package com.company.devices;

import com.company.Human;
import com.company.Saleable;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Phone extends Device implements Saleable {
    final Double screenSize;
    public String os;
    final static String DEFAULT_SERVER_ADDRESS = "21.37.56.1337";
    final static String DEFAULT_PROTOCOL = "HTTPS";
    final static String DEFAULT_VERSION = "1.18.2";
    public Human phoneOwner;
    public List<Application> phoneApplications;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction,producer,model);
        this.screenSize = screenSize;
        phoneApplications = new ArrayList<>();
    }

    public String toString(){
        return "Producer: "+ producer+" Model: "+model+" Rok wydania: " + yearOfProduction + " Rozdzialka: "+screenSize+"Cali"+" System Operacyjny: "+os;
    }
    public void turnOn(){
        System.out.println("Klik ! Klik! ");
    }

    @Override
    public void sale() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Proba sprzedania telefonu "+ this.producer);
        if(seller.mobile != this){
            System.out.println("Sprzedawca nie ma telefonu");
        }else if (buyer.cash <price){
            System.out.println("Soryy kupujacy nie ma kasy");
        }else{
            seller.cash +=price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("Telefon "+ this.producer + " zostal sprzedany za "+ price);
        }
    }

    public void installAnApp(String appName) {
        installAnApp(appName, DEFAULT_VERSION);
    }

    public void installAnApp(String appName, String appVersion) {
        installAnApp(appName,appVersion,DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String appVersion, String serverAdres) {
        System.out.println("zainstalowano na telefonie aplikacje " + appName + " w wersji " +appVersion + " na serverze " + serverAdres);
    }

    public void installAnApp(List<String> applicationsToInstall) {
        for (String application: applicationsToInstall) {
            installAnApp(application);
        }
    }
    public void installAnApp(URL url) {
        installAnApp("youtube");
        System.out.println(url.toString());
    }
    public void installAppOnPhone(Application application) {
        if (this.phoneOwner.cash < application.price) {
            System.out.println("Wlasciciel nie ma wystarczajaco pieniedzy na pobranie aplikacji: " + application.applicationName);
        } else {
            this.phoneOwner.cash -= application.price;
            System.out.println("Aplikacja zostala zainstalowana :" + application.applicationName);
            phoneApplications.add(application);
        }
    }
    public void isAppInstalledOnPhone(Application application) {
        if (phoneApplications.contains(application)){
            System.out.println("Applikacja " + application.applicationName +" zostala zainstalowana na telefonie");
        } else {
            System.out.println("Applikacja " + application.applicationName +" niezostala zainstalowana na telefonie");
        }
    }

    public void getAllFreeAppOnPhone() {
        List<Application> freeApplications = phoneApplications.stream()
                .filter(application -> application.price == 0)
                .collect(Collectors.toList());
        if (freeApplications.size() == 0) {
            System.out.println("Na telefonie nie ma darmowych aplikacji");
        } else {
            System.out.println("Darmowe aplikacje to :");
            System.out.println(freeApplications.stream().map(application -> application.applicationName)
                    .collect(Collectors.joining(", ")));
        }
    }

    public void getAppValue() {
        double applicationsValue = 0;
        for (Application application: phoneApplications) {
            applicationsValue += application.price;
        }
        System.out.println("Wartosc wszystkich aplikacji " + applicationsValue);
    }

    public void getAllAppNamesInAlphabetic() {
        System.out.println("Aplikacje w kolejnosci alfabetycznej to:");
        Collections.sort(phoneApplications, new AppNameComparator());
        for (Application application: phoneApplications) {
            System.out.println(application.applicationName);
        }
    }

    public void getAllAppPriceInOrderFromCheapestToExpensive() {
        System.out.println("Aplikacje w kolejnosci od najtanszego do najdrozszego: ");
        Collections.sort(phoneApplications, new AppValueComparator());
        for (Application application: phoneApplications) {
            System.out.println(application.applicationName + " wartosc: " + application.price);
        }
    }
}
