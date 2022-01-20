package com.company;
import com.company.creatures.Animal;
import com.company.devices.*;
import com.company.creatures.Pet;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        Phone xiaomi=new Phone(2014,"xiaomi","note4",8.1);
        xiaomi.os="xiaomi";
        Pet dog = new Pet("canis");
        dog.name = "Dino";
        //dog.weight = 3.0;
        dog.age = 4;
        dog.alive = true;
        Human ania=new Human("Ania","Kowalska",4);
        Car dodge =new Diesel(2000,"Dodge Challenger","Dodge",2000.0,1745.0,4,ania);
        ania.addCar(dodge);
        ania.setCar(dodge,0);
        ania.getCar(0);
        Human dariusz =new Human("Dariusz","Pietrzak",4);
        dariusz.cash=5000.0;
        dodge.sell(ania,dariusz,2000.0);
        dodge.doasASoldToB(ania,dariusz);
        System.out.println("Czy "+ ania.firstName+" sprzedala "+dariusz.firstName+ " samochod ? " + dodge.doasASoldToB(ania,dariusz));
        Human patryk =new Human("Patryk","Pietrzak",4);
        Car bmw = new Diesel(2010,"BMW e39","bmw",4000.0,1453.0,4,patryk);
        patryk.addCar(bmw);
        patryk.hasCar(bmw);
        bmw.sell(patryk,dariusz,2000.0);
        System.out.println("Suma wartosci wszystkich samochodow dariusza: "+ dariusz.calculateSumOfCarsValue());
        System.out.println("Czy ania jest byla ostatnim wlascicielem dodge "+ dodge.isLastOwner(ania));
        dodge.transationNumber();
        /*patryk.pet=dog;
        patryk.mobile=xiaomi;
        patryk.feed();
        patryk.age=3;*/
        patryk.cash=1000.0;
        /*
        Phone samsung=new Phone(2020,"samsung","note4",7.2);
        samsung.installAnApp("Insta","14.2");
        samsung.installAnApp("youtube","23.4","https://www.youtube.com/");
        URL url = new URL("HTTP","youtube.com",8080,"/file");
        samsung.installAnApp(url);
        dodge.refuel();*/

        /*Human Mariusz =new Human("Mariusz","Gryz");
        Mariusz.cash=2000.0;
        Human sister= new Human("Karolina","Gryz");
        sister.cash = 200.0;

        System.out.println("patryk.mobile "+patryk.mobile);
        System.out.println("Mariusz.mobile "+Mariusz.mobile);
        patryk.mobile.sell(patryk,Mariusz,566.0);

        System.out.println("patryk.mobile "+patryk.mobile);
        System.out.println("Mariusz.mobile "+Mariusz.mobile);
        System.out.println("Pieniadze Patryk: "+patryk.cash);
        System.out.println("Peniadze Mariusza: "+ Mariusz.cash);

        System.out.println("patryk.pet "+patryk.pet);
        System.out.println("Mariusz.pet "+Mariusz.pet);

        patryk.pet.sell(patryk,Mariusz,200.0);

        System.out.println("patryk.pet "+patryk.pet);
        System.out.println("Mariusz.pet "+Mariusz.pet);
        System.out.println("Pieniadze Patryk: "+patryk.cash);
        System.out.println("Peniadze Mariusza: "+ Mariusz.cash);

        System.out.println("patryk.pet "+patryk.car);
        System.out.println("Mariusz.pet "+Mariusz.car);

        patryk.car.sell(patryk,Mariusz,200.0);

        System.out.println("patryk.pet "+patryk.car);
        System.out.println("Mariusz.pet "+Mariusz.car);
        System.out.println("Pieniadze Patryk: "+patryk.cash);
        System.out.println("Peniadze Mariusza: "+ Mariusz.cash);
        patryk.pet= Mariusz;
        patryk.pet.sell(patryk,sister,20.0);*/
/*
        System.out.println("Zad1");

        Double weightBeforeBreakfast=dog.getWeight();

        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.feed(0.5);

        System.out.println("Przytylem "+(dog.getWeight()-weightBeforeBreakfast)+"kg");
        System.out.println("Zad34");
        patryk.setSalary(4000.0);
        patryk.getSalary();
        System.out.println("Zad5");
        patryk.setCar(dodge);
        patryk.getCar();
        System.out.println(patryk);*/
}
}
