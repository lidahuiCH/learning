package com.ldh.pattern.strategy;

public class Client {
    public static void main(String[] arg) {
        double totlePrice = 0d;
        double singlePrice = 12d;
        double mount = 12d;
        CashContext context = new CashContext("00");
        totlePrice = context.getResult(singlePrice * mount);
        System.out.println(totlePrice);
        context = new CashContext("01");
        totlePrice = context.getResult(singlePrice * mount);
        System.out.println(totlePrice);


    }
}
