package com.scaler.generics.PairClassWithoutGenerics;

public class Client {
    public static void main(String[] args) {
        Pair p = new Pair();
        p.first = "Hello";
        p.second = 123; // This is allowed, but can lead to runtime errors

        // To use the values, we need to cast them back to their original types
        String firstValue = (String) p.first;
      //  String secondValue = (String) p.second; this will throw ClassCastException at runtime
        Integer secondValue = (Integer) p.second; // Correct casting

        System.out.println("First: " + firstValue);
        System.out.println("Second: " + secondValue);
    }
}
