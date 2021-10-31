package com.company.creatures;
import com.company.Human;
import com.company.Saleable;
import com.company.devices.Car;
import com.company.devices.Phone;
public abstract class Animal implements Saleable , Feedable {
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;
    final String species;
    public String name;
    private Double weight;
    public Integer age;
    public Boolean alive;

    public Animal(String species) {
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

    public void feed() {
        if(weight>0) {
            weight++;
            System.out.println("Moja waga to: " + weight);
        }else{
            System.out.println("Nie nakarmisz kogos kto niezyje przestan!!");
        }
    }
    public void takeForAWalk() {
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
    public Double getWeight() {
        return weight;
    }
    public String toString()
    {
        return "Imię: " + name + " Waga: " + weight  +" Lata: " + age + " Czy zyje : "+ alive;
    }

    @Override
    public void sale() {

    }


    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Proba sprzedania zwierzaka "+ this.species);
        if(seller.pet != this){
            System.out.println("Sprzedawca nie ma zwierzaka");
        }else if (buyer.cash <price){
            System.out.println("Soryy kupujacy nie ma kasy");
        }else if(this.species == Human.HUMAN_SPECIES){
            System.out.println("nie mozna sprzedawac ludzi");
        }
        else{
            seller.cash +=price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Zwierzak "+ this.species + " zostal sprzedany za "+ price);
        }
    }
}
