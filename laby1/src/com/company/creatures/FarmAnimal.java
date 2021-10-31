package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile {

    FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Został zjedzony");
    }

    @Override
    public void feed(double foodWeight) {

    }
}
