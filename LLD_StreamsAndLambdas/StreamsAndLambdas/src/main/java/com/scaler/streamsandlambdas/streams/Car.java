package com.scaler.streamsandlambdas.streams;

public class Car {
    private String name;
    public double price;
    private int speed;

    Car(String name, double price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
