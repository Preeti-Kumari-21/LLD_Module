package com.scaler.streamsandlambdas.defaultFuncInterFaceByJava;

import java.util.function.BiConsumer;

public class BiConsumerImpl implements BiConsumer<String, String> {
    @Override
    public void accept(String s, String s2) {
        System.out.println(s + " " + s2);
    }
}
