package com.scaler.streamsandlambdas.usingLambdas;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        //() -> {}
        //() is the place where we define the parameters
        //{} is the place where we define the logic

        BiPredicate<String, Integer> biPredicate = (name, length) ->
                            {return  name.length() > length;};
        System.out.println(biPredicate.test("hello", 1)); // true
        System.out.println(biPredicate.test("hi", 3)); // false


        BinaryOperator<String> binaryOperator = (str1, str2) -> {
            System.out.println(str1 +" "+ str2);
            return str1 + str2;};
        binaryOperator.apply("hello", "Bangalore");

    }
}
