package com.ldh.pattern.strategy;

public class NormalCash extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
