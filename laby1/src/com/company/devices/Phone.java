package com.company.devices;

import com.company.Saleable;

public class Phone extends Device implements Saleable {
    final Double screenSize;
    public String os;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction,model,producer);
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
    public Double getPrice() {
        return null;
    }
}
