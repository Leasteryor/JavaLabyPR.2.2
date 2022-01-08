package com.company.devices;

public class Diesel extends Car{
    static final String DIESEL = "DIESEL";
    public Diesel(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors) {
        super(yearOfProduction,model,producer,value,weight,doors);
    }
    @Override
    public void refuel(){
        System.out.println("Tankuje samochod dieselem");
    }
}

