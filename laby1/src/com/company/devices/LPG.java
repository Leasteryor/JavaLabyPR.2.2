package com.company.devices;

public class LPG extends Car{
    static final String LPG = "LPG";
    public LPG(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors) {
        super(yearOfProduction,model,producer,value,weight,doors);
    }
    @Override
    public void refuel(){
        System.out.println("Tankuje samochod gazem");
    }
}

