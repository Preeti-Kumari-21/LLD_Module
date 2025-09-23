package com.scaler.concurrency.syncronizedMethod;

public class Count {

    private int sharedValue = 0;

    public synchronized void setSharedValue(int sharedValue) {
        this.sharedValue += sharedValue;
    }

    public  int getSharedValue() {
        return sharedValue;
    }
}
