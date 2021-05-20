package com.company;

import java.io.Serializable;

public class ReflectionSample extends SuperClass implements Serializable {
    private int number;
    public String name;

    public ReflectionSample() {
        super(2.0);
        name = "default constructor";
        number = 4;
    }

    public ReflectionSample(int number, String name) {
        super(3.0);
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
}
