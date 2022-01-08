package com.company.devices;

public class Electric extends Car{
    static final String ELECTRIC = "ELECTRIC";
    public Electric(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors) {
        super(yearOfProduction,model,producer,value,weight,doors);
    }
    @Override
    public void refuel(){
        System.out.println("Laduje samochod");
    }
}
