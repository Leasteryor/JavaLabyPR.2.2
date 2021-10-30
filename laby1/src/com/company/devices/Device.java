package com.company.devices;

public abstract class Device {
    final Integer yearOfProduction;
    final String producer;
    final String model;

    public Device(Integer yearOfProduction, String producer, String model) {
        this.yearOfProduction = yearOfProduction;
        this.producer = producer;
        this.model = model;
    }
    abstract public void turnOn();
}
