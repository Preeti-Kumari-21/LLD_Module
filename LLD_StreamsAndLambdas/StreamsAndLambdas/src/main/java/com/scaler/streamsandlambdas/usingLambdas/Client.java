package com.scaler.streamsandlambdas.usingLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {

    static class Car{
        String name;
        int price;

        Car(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,9,2,4,5,1,8,6,3,0,5,3,2);
        Collections.sort(list);
        System.out.println(list);


        Car car1 = new Car("BMW", 10);
        Car car2 = new Car("AUDI", 301);
        Car car3 = new Car("MERC", 130);
        Car car4 = new Car("SKODA", 3410);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        //Using anynomous class
        Comparator<Car> comparator = new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price; // sort cars in ascending order via price
               // return o2.price - o1.price; // sort in desc order of price
            }
        };
        Collections.sort(cars,comparator);
        for (Car car : cars) {
            System.out.println(car+" ");
        }

        //Using Lambdas

        Comparator<Car> comparator2 = (c1, c2) -> c2.price - c1.price;
        Collections.sort(cars,comparator2);
        for (Car car : cars) {
            System.out.println(car+"\n");
        }



    }
}
