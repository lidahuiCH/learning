package com.ldh.pattern.factory.factorymethod;

/**
 * Created on 2018/5/23.
 */
public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW bmw523 = factoryBMW523.createBMW();
    }
}
