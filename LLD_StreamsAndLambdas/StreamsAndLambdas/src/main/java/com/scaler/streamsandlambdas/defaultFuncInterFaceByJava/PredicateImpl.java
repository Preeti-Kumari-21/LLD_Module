package com.scaler.streamsandlambdas.defaultFuncInterFaceByJava;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.length() > 3;
    }
}
