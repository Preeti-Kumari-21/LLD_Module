package com.scaler.streamsandlambdas.defaultFuncInterFaceByJava;

import java.util.function.BiFunction;

public class BiFunctionImpl implements BiFunction<String, Integer, Integer> {

    @Override
    public Integer apply(String s, Integer integer) {
        return s.length() + integer;
    }
}
