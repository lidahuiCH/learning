package com.ldh.pattern.factory;

import lombok.Data;

@Data
public class Addition extends Operation {

    private double numberA;
    private double numberB;

    @Override
    public double getResult() {
        return numberA + numberB;
    }

    @Override
    public void setNumber(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }
}
