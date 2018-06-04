package com.ldh.pattern.strategy;

public class RebateCash extends CashSuper {

    private double rebate = 1d;

    public RebateCash(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
