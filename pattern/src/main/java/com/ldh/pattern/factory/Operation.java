package com.ldh.pattern.factory;

import lombok.Data;

@Data
public abstract class Operation {
    private double numberA;
    private double numberB;

    public double getResult() {
        return 0;
    }

    public void setNumber(double numberA,double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }
}
