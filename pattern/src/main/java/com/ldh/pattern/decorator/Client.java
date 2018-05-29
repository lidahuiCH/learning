package com.ldh.pattern.decorator;

public class Client {
    public static void main(String[] args){
        ConcreateComponent c = new ConcreateComponent();
        ConcreateDecoratorA a = new ConcreateDecoratorA();
        ConcreateDecoratorB b = new ConcreateDecoratorB();
        a.setComponent(c);
        b.setComponent(a);
        b.Operation();
    }
}
