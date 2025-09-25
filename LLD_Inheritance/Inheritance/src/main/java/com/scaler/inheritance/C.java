package com.scaler.inheritance;

public class C extends B{
    String name;
    C(){
        System.out.println("Constructor of C");
    }

    C(String name){
        System.out.println("Constructor of C "+name);
    }

    C(String name,int age){

    }

    C(int age,String name){

    }

    C(String name,String university){

    }
}
