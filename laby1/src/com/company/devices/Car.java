package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable{
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

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", weight=" + weight +
                ", doors=" + doors +
                ", yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String showCar(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+yearOfProduction+ " Waga: "+ weight+" Liczba drzwi: "+doors;}

    @Override
    public void sale() {

    }

    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Proba sprzedania samochodu "+ this.producer);
        if(seller.car != this){
            System.out.println("Sprzedawca nie ma samochodu");
        }else if (buyer.cash <price){
            System.out.println("Soryy kupujacy nie ma kasy");
        }else{
            seller.cash +=price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Samochod "+ this.producer + " zostal sprzedany za "+ price);
        }
    }
}
