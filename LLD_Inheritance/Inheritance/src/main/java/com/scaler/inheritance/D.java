package com.scaler.inheritance;

public class D extends C {
    D(){
        super("Preeti");
        System.out.println("Constructor of D");
    }

    D(String name){
        System.out.println("Constructor of D with param "+name);
    }
}
