package com.ldh.pattern.prototype;

public class Client {
    public static void main(String[] args){
        Prototype a = new ConcretePrototypeA("1");
        a.outId();
        Prototype b = a.clone();
        b.outId();
        b.setId("2");
        a.outId();
        b.outId();
    }
}
