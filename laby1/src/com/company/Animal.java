package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;
public class Animal implements Saleable{
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;
    final String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive;

    Animal(String species) {
        this.species = species; //wartosc z parametru
        this.alive = true; //wartosc domyslna
        if (this.species == "canis") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species == "felis") {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed() {
        if(weight>0) {
            weight++;
            System.out.println("Moja waga to: " + weight);
        }else{
            System.out.println("Nie nakarmisz kogos kto niezyje przestan!!");
        }
    }
    void takeForAWalk() {
        weight--;
        if(weight==0){
            System.out.println("Zwierzak nie zyje ");
            alive=false;
        }else if(alive==false){
            System.out.println("On nie zyje czego nie rozumiesz ");
        }
        else{
            System.out.println("Moja waga to: " + weight);
        }
    }
    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("Ilosc jedzenia: " + weight);
    }
    Double getWeight() {
        return weight;
    }
    public String toString()
    {
        return "Imię: " + name + " Waga: " + weight  +" Lata: " + age + " Czy zyje : "+ alive;
    }

    @Override
    public void sale() {

    }

    @Override
    public Double getPrice() {
        return null;
    }
}
