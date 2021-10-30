package com.company.devices;

public class Car extends Device {
    public Double value;
    public Double weight;
    public Integer doors;

    public Car(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors) {
        super(yearOfProduction,model,producer);
        this.value = value;
        this.weight = weight;
        this.doors = doors;
    }

    public void turnOn(){
        System.out.println("Brum Brum ");
    }

    public String showCar(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+yearOfProduction+ " Waga: "+ weight+" Liczba drzwi: "+doors;}
}
