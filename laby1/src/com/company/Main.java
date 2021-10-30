package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;
public class Main {

    public static void main(String[] args) {
        Phone xiaomi=new Phone("xiaomi","note4",8);
        xiaomi.os="xiaomi";
        Animal dog = new Animal("canis");
        dog.name = "Dino";
        //dog.weight = 3.0;
        dog.age = 4;
        dog.alive = true;

        Car dodge =new Car();
        dodge.model ="Dodge Challenger";
        dodge.producer="Dodge";
        dodge.weight = 1745.0;
        dodge.doors =4;
        dodge.value=1000.0;
        dodge.year=2000;

        Human patryk =new Human("Patryk","Pietrzak");
        patryk.pet=dog;
        patryk.mobile=xiaomi;



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
        System.out.println(patryk);
}
}
