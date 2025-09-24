package com.scaler.generics.extendGenerics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());

      //List<Animal> animals1 = new ArrayList<Dog>(); // This line will cause a compile-time error
        // because List<Dog> is not a subtype of List<Animal>

        List<? extends Animal> animals2 = new ArrayList<Dog>(); // This is valid because of wildcard
        List<? extends Animal> animals3 = new ArrayList<Cat>(); // This is also valid because of wildcard
        List<? extends Animal> animals4 = new ArrayList<Animal>(); // This is also valid because of wildcard
    }
}
