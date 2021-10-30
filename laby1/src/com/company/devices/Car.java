package com.company.devices;
import com.company.devices.Car;
import com.company.devices.Phone;
public class Car {
    public String model;
    public String producer;
    public Double value;
    public Integer year;
    public Double weight;
    public Integer doors;

    void turnOn(){
        System.out.println("Brum Brum ");
    }

    public String showCar(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+year+ " Waga: "+ weight+" Liczba drzwi: "+doors;}
}
