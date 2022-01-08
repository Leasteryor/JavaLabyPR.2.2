package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Electric;
import com.company.devices.Phone;
import com.company.creatures.Pet;

import java.net.URL;

public class Main {

    public static void main(String[] args) {
        Phone xiaomi=new Phone(2014,"xiaomi","note4",8.1);
        xiaomi.os="xiaomi";
        Pet dog = new Pet("canis");
        dog.name = "Dino";
        //dog.weight = 3.0;
        dog.age = 4;
        dog.alive = true;

        Car dodge =new Electric(2000,"Dodge Challenger","Dodge",1000.0,1745.0,4);
        Human patryk =new Human("Patryk","Pietrzak");
        patryk.pet=dog;
        patryk.mobile=xiaomi;
        patryk.feed();
        patryk.age=3;
        patryk.cash=2000.0;
        patryk.car=dodge;
        Phone samsung=new Phone(2020,"samsung","note4",7.2);
        samsung.installAnApp("Insta","14.2");
        samsung.installAnApp("youtube","23.4","https://www.youtube.com/");
        dodge.refuel();
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
