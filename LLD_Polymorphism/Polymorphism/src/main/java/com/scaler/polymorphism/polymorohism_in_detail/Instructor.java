package com.scaler.polymorphism.polymorohism_in_detail;

public class Instructor extends User {
    String instructorName;
    String instructorAddress;

  @Override
    void printTheName(String name) {
        System.out.println("B--->I am printTheName function "+name);
    }
}
