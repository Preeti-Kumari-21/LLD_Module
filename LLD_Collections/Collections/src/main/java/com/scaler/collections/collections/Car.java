package com.scaler.collections.collections;

import java.util.Objects;

public class Car implements Comparable<Car>{
    String name;
    Double price;
    Integer year;

    Car(){

    }

    public Car(String name, Double price, Integer year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if(!this.name.equals(car.name)){
            return this.name.compareTo(car.name);
        }else{
            return this.year.compareTo(car.year);
        }
    }
}
