package com.scaler.streamsandlambdas.defaultFunInterFaceImpUsingAnynomousClass;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {

        // Using Anonymous Class
        // Implementing BiPredicate using an anonymous class
        // Here, we create an instance of BiPredicate that checks if the length of the string
        // is greater than the given integer.

        BiPredicate<String, Integer> biPredicate = new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String name, Integer integer2) {
                return name.length() > integer2;
            }
        };
        System.out.println(biPredicate.test("hello", 1)); // true
        System.out.println(biPredicate.test("hi", 3)); // false
    }
}
