package com.ldh.pattern.strategy;

public class CashContext {
    private CashSuper cashSuper;
    double rebate = 0.9d;

    public CashContext(String type) {
        switch (type) {
            case "00":
                cashSuper = new NormalCash();
                break;
            case "01":
                cashSuper = new RebateCash(rebate);
                break;
            default:
                System.out.println("error");
        }
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
