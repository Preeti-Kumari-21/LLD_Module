package com.scaler.streamsandlambdas.defaultFuncInterFaceByJava;

import java.util.function.Function;

public class FunctionImpl implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "I am from FunctionImpl and input was: " + s;
    }
}
