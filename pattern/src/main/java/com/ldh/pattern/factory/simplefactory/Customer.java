package com.ldh.pattern.factory.simplefactory;

/**
 * Created on 2018/5/23.
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
