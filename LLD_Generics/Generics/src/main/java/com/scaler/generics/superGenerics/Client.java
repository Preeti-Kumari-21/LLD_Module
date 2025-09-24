package com.scaler.generics.superGenerics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<ChharDadu> chharDadus = new ArrayList<ChharDadu>();
        chharDadus.add(new ChharDadu());
        chharDadus.add(new ParDadu());
        chharDadus.add(new Dadu());
        chharDadus.add(new Papa());

        //List<ChharDadu> chharDadus1 = new ArrayList<ParDadu>(); // This line will cause a compile-time error
        // because List<ParDadu> is not a subtype of List<ChharDadu>

        List<Papa> papas = new ArrayList<Papa>();
        papas.add(new Papa());
        //papas.add(new Dadu()); // This line will cause a compile-time error
        //papas.add(new ParDadu()); // This line will cause a compile-time error
        //papas.add(new ChharDadu()); // This line will cause a compile-time

        List<? super Papa> papas1 = new ArrayList<ParDadu>(); // This is valid because of wildcard
        List<? super Papa> papas2 = new ArrayList<Dadu>(); // This is also valid because of wildcard
        List<? super Papa> papas3 = new ArrayList<ChharDadu>(); // This is also valid because of wildcard

        //Create one clid class of Papa.

       // List<Papa> papas4 = new ArrayList<Son>();// This line will cause a compile-time error
       // List<Papa> papas5 = new ArrayList<Daughter>();// This line will cause a compile-time error

        List<? extends Papa> papas4 = new ArrayList<Son>();
        List<? extends Papa> papas5 = new ArrayList<Daughter>();


    }
}
