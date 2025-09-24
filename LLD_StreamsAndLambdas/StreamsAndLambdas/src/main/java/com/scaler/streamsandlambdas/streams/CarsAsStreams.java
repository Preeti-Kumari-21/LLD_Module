package com.scaler.streamsandlambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsAsStreams {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",12300.99,200);
        Car car2 = new Car("AUDI",567300.99,100);
        Car car3 = new Car("SKODA",7852300.99,600);
        Car car4 = new Car("HONDA",134500.99,290);
        Car car5 = new Car("MG",1246700.99,89);
        Car car6 = new Car("KIA",123450.99,20);
        Car car7 = new Car("MERC",10980.99,2);

        List<Car> cars = Arrays.asList(car1,car2,car3,car4,car5,car6,car7);

        cars.stream().filter((c1) -> c1.price > 10000).toList();
        System.out.println(cars);

        System.out.println("---------------------------------------------------\n");

        System.out.println(cars.stream().map((car) -> car.price).toList());

        System.out.println("---------------------------------------------------\n");

        System.out.println(cars.stream().map((car) -> car.price > 1000).toList());

    }
}
