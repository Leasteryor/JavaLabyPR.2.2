package com.company.devices;

import com.company.Human;

public class LPG extends Car{
    static final String LPG = "LPG";
    public LPG(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors, Human firstOwner) {
        super(yearOfProduction,model,producer,value,weight,doors,firstOwner);
    }
    @Override
    public void refuel(){
        System.out.println("Tankuje samochod gazem");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}

