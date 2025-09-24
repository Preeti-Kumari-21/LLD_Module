package com.scaler.streamsandlambdas.FunctionalInterface;

public interface FunctionalInterfaceExample2 {

    int add(int a, int b);

    default void display(){
        System.out.println("This is a default method in FunctionalInterfaceExample2");
    }
}

// This is a functional interface because it has only one abstract method (add).
// We can use this interface to create lambda expressions or method references in Java.
// The default method (display) does not count as an abstract method, so it does not affect the functional interface status.