package com.company.devices;

import com.company.Human;
import com.company.Saleable;

import java.net.URL;
import java.util.List;


public class Phone extends Device implements Saleable {
    final Double screenSize;
    public String os;
    final static String DEFAULT_SERVER_ADDRESS = "21.37.56.1337";
    final static String DEFAULT_PROTOCOL = "HTTPS";
    final static String DEFAULT_VERSION = "1.18.2";

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction,producer,model);
        this.screenSize = screenSize;
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
        installAnApp("twitter");
        System.out.println(url.toString());
    }
}
