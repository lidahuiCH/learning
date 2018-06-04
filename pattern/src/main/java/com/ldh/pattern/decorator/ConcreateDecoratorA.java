package com.ldh.pattern.decorator;


public class ConcreateDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "new state";
        System.out.println("A ");
        component.Operation();

    }
}
