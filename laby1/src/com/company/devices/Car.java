package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable{
    public Double value;
    public Double weight;
    public Integer doors;

    public Car(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors) {
        super(yearOfProduction,producer,model);
        this.value = value;
        this.weight = weight;
        this.doors = doors;
    }

    public void turnOn(){
        System.out.println("Brum Brum ");
    }



    public String toString(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+yearOfProduction+ " Waga: "+ weight+" Liczba drzwi: "+doors;}

    @Override
    public void sale() {

    }

    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Proba sprzedania samochodu "+ this.producer);
        if(seller.hasCar(this)){
            System.out.println("Sprzedawca nie ma samochodu");
        }else if(!buyer.hasFreeParkingLot()){
            System.out.println("Kupujacy nie ma miejsca na samochod");
        }
        else if (buyer.cash <price){
            System.out.println("Soryy kupujacy nie ma kasy");
        }else{
            seller.cash +=price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Samochod "+ this.producer + " zostal sprzedany za "+ price);
        }
    }
    public abstract void refuel();
}
