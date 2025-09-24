package com.scaler.streamsandlambdas.defaultFuncInterFaceByJava;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer + integer2;
    }
}
