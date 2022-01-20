package com.company.devices;

import com.company.Human;
import com.company.Saleable;

import java.util.LinkedList;
import java.util.List;

public abstract class Car extends Device implements Saleable{
    public Double value;
    public Double weight;
    public Integer doors;
    List<Human> owners;
    public Car(Integer yearOfProduction, String model, String producer, Double value, Double weight, Integer doors,Human firstOwner ){
        super(yearOfProduction,producer,model);
        this.value = value;
        this.weight = weight;
        this.doors = doors;
        this.owners = new LinkedList<>();
        this.owners.add(firstOwner);
        firstOwner.addCar(this);
    }

    public void turnOn(){
        System.out.println("Brum Brum ");
    }

    public boolean isLastOwner(Human human){
        return owners.get(owners.size()-1).equals(human);
    }

    public boolean wasAnOwner(Human human){
        return !this.owners.contains(human);
    }
    public boolean doasASoldToB(Human a, Human b){
        if (wasAnOwner(a) || wasAnOwner(b)){
            return false;
        }else{
            if(this.owners.indexOf(b)-this.owners.indexOf(a)==1){
                return true;
            }
            return false;
        }
    }

    public String toString(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+yearOfProduction+ " Waga: "+ weight+" Liczba drzwi: "+doors;}

    @Override
    public void sale() {

    }

    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Proba sprzedania samochodu "+ this.producer);
        if(!seller.hasCar(this)){
            System.out.println("Sprzedawca nie ma samochodu");
        }else if(!buyer.hasFreeParkingLot()){
            System.out.println("Kupujacy nie ma miejsca na samochod");
        } else if(!this.isLastOwner(seller)) {
            System.out.println("Sprzedajacy nie jest ostatnim wlascicielem auta");
        }else if (buyer.cash <price){
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
