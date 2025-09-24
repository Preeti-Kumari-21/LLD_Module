package com.scaler.streamsandlambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStreams {
    public static void main(String[] args) {
        //Q. Extract all the even numbers from a list

        //First way
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenList = new ArrayList<>();
        for(Integer i : list){
            if(i % 2 == 0){
                evenList.add(i);
            }
        }
        System.out.println("This is first way");
        for (int i = 0; i < evenList.size(); i++) {
            System.out.print(evenList.get(i)+" ");
        }


        // Second Way
        System.out.println("\nThis is  Second Way");
        list.stream().filter((num) -> {return num % 2 == 0;}).forEach(num -> {System.out.print(num+" ");});
    }
}
