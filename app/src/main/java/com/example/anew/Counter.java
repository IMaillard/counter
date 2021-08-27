package com.example.anew;

public class Counter {
    Integer value = 0;

    public Counter() {
    }

    public void increaseValue() {
        value++;
    }

    public Integer getValue() {
        return value;
    }

    public void decreaseValue() {
        value = 0;
    }
}
