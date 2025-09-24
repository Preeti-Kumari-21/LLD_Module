package com.scaler.streamsandlambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        //Different ways of creating streams in Java

        //First
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = numbers.stream();

        //Second
        Integer[] array = {10,50,20,6,14,67,34,3,21};
        Stream<Integer> stream1 = Arrays.stream(array);

        //Third
        Stream<Integer> stream2 = Stream.of(array);

        //Fourth
        Stream.Builder<Integer> builder = Stream.builder();
    }
}
