package com.ldh.pattern.temple;

public class Client {
    public static void main(String[] args) {
        AbstractClass c = new ConcreteClass();
        c.TempleMethod();
        c = new ConcreteClass2();
        c.TempleMethod();
    }
}
