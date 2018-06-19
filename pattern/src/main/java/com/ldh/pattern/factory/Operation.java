package com.ldh.pattern.factory;

import lombok.Data;

@Data
public abstract class Operation {

    public double getResult() {
        return 0;
    }

    public abstract void setNumber(double numberA, double numberB);
}
