package com.scaler.collections.collections;

import java.util.Set;
import java.util.TreeSet;

public class ClientOfCar {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",420000.00,2000);
        Car car2 = new Car("AUDI",120000.00,2001);
        Car car3 = new Car("MERCEDES",320000.00,2027);
        Car car4 = new Car("SKODA",920000.00,2003);
        Car car5 = new Car("HONDA",620000.00,2002);
        Car car6 = new Car("CHERVOLET",220000.00,2011);

        Set<Car> cars = new TreeSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println("cars-----> "+cars);

    }
}
