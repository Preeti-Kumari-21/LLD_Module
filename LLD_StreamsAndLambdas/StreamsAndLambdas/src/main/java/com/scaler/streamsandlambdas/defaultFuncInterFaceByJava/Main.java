package com.scaler.streamsandlambdas.defaultFuncInterFaceByJava;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = new BiPredicateImpl();
        System.out.println(biPredicate.test("hello", 3)); // true
        System.out.println(biPredicate.test("hi", 3)); // false

        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Hello, World!"); // prints "s = Hello, World!"

        BiConsumer<String, String> biConsumer = new BiConsumerImpl();
        biConsumer.accept("Hello", "World"); // prints "Hello World"

        Predicate<String> predicate = new PredicateImpl();
        System.out.println(predicate.test("hello")); // true
        System.out.println(predicate.test("hi")); // false

        Function<String, String> function = new FunctionImpl();
        System.out.println(function.apply("input"));

        BiFunction<String, Integer, Integer> biFunction = new BiFunctionImpl();
        System.out.println(biFunction.apply("hello", 3)); // 8

        BinaryOperator<Integer> binaryOperator = new BinaryOperatorImpl();
        System.out.println(binaryOperator.apply(1,2)); // 3
    }
}
