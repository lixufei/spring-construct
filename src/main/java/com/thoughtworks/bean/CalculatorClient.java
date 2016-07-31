package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.ICalculator;

public class CalculatorClient {
    private ICalculator addCalculator;
    private ICalculator plusCalculator;

    public CalculatorClient(ICalculator addCalculator, ICalculator plusCalculator) {
        this.addCalculator = addCalculator;
        this.plusCalculator = plusCalculator;
    }

    public String add(String a, String b) {
        return addCalculator.add(a, b);
    }

    public String plus(String a, String b) {
        return plusCalculator.add(a, b);
    }
}
