package com.company.devices;

import com.company.Human;
import com.company.Saleable;



public class Phone extends Device implements Saleable {
    final Double screenSize;
    public String os;

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
    public void installAnnApp(String nameApp){
        nameApp = "Photos";
        System.out.println("Nazwa aplikacji: "+ nameApp);
    }
    /*public void installAnnApp(String nameApp,){
        nameApp = "Photos";
        System.out.println("Nazwa aplikacji: "+ nameApp);
    }*/
}
