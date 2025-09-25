package com.scaler.polymorphism.polymorohism_in_detail;

public class Client {
    public static void main(String[] args) {
        User userParentOfInstructor = new Instructor();
      // userParentOfInstructor.printTheName("Preeti");

        User userParentOfStudent = new Student();
        userParentOfStudent.printTheName("John");


    }
}
