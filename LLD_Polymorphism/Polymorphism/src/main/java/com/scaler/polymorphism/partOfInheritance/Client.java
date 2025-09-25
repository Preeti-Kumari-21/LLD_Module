package com.scaler.polymorphism.partOfInheritance;

public class Client {
    public static void main(String[] args) {
        User userParentOfInstructor = new Instructor();
        System.out.println(userParentOfInstructor.userName);
        System.out.println(userParentOfInstructor.userAddress);


        User userParentOfStudent = new Student();
        System.out.println(userParentOfStudent.userName);
        System.out.println(userParentOfStudent.userAddress);

        User userParentOfTa = new TA();
        System.out.println(userParentOfTa.userName);
        System.out.println(userParentOfTa.userAddress);

        // with parent object reference we can only call the attributes of parent class but cannot call the attributes of child classes.
        // in this case with the parent reference object userParentOfInstructor has Instructor class object internally
        //But still with this userParentOfInstructor we are able to call only userName and userAddress and not instructorName, instructorAddress.

        Instructor instructorChildOfUser = new Instructor();
        System.out.println(instructorChildOfUser.userName);
        System.out.println(instructorChildOfUser.userAddress);
        System.out.println(instructorChildOfUser.instructorName);
        System.out.println(instructorChildOfUser.instructorAddress);

        //from child class object we can call all the attributes of parent classes as well as childs own attributes.
    }
}
