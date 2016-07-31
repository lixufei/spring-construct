package com.thoughtworks.bean.operation;

public class AddCalculator extends ICalculator {

    @Override
    public String operate(String a, String b) {
        return String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
    }
}
