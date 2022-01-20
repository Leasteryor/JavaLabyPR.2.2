package com.company.devices;

import com.company.Human;

public class Electric extends Car{
    static final String ELECTRIC = "ELECTRIC";

    public Electric(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors, Human firstOwner) {
        super(yearOfProduction,model,producer,value,weight,doors,firstOwner);
    }

    @Override
    public void refuel(){
        System.out.println("Laduje samochod");
    }

}
