package com.scaler.streamsandlambdas.FunctionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceExample3 {

    void display();

  //  void display2(); // This will cause a compilation error because it adds a second abstract method.
    //When we have especified @FunctionalInterface, the compiler will enforce the rule of having only one abstract method.
    //If we remove the @FunctionalInterface annotation, this interface will no longer be a functional interface if user adds second abstract method
    //But it is a good practice to use @FunctionalInterface annotation to avoid accidental addition of more abstract methods.

    default void display2(){
        System.out.println("This is a default method in FunctionalInterfaceExample3");
    }

    // Default methods do not count as abstract methods, so they do not affect the functional interface status.
}
