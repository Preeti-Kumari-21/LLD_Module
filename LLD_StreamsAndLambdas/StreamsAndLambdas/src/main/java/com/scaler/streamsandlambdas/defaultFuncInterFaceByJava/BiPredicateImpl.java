package com.scaler.streamsandlambdas.defaultFuncInterFaceByJava;

import java.util.function.BiPredicate;

public class BiPredicateImpl implements BiPredicate<String, Integer> {
    @Override
    public boolean test(String s, Integer integer) {
        return s.length() > integer;
    }
}
