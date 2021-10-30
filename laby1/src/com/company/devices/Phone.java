package com.company.devices;
import com.company.devices.Car;
import com.company.devices.Phone;
public class Phone {
    final String producer;
    final String model;
    final Integer screenSize;
    public String os;

    public Phone(String producer, String model, Integer screenSize) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
    }
    public String toString(){
        return "Producer: "+ producer+"Model: "+model+"Przekatna ekranu: "+screenSize+"Cali"+"System Operacyjny: "+os;
    }
}
