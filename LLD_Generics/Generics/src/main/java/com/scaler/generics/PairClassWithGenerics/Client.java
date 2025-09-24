package com.scaler.generics.PairClassWithGenerics;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>();
        p1.first = "Hello";
        p1.second = 10;

        Pair<Double, Integer> p2 = new Pair<>();
        p2.first = 3.14;
        p2.second = 20;

        System.out.println("Pair 1: " + p1.first + ", " + p1.second);
        System.out.println("Pair 2: " + p2.first + ", " + p2.second);
    }
}
