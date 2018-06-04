package com.ldh.pattern.decorator;

public class ConcreateDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("B ");
        component.Operation();

    }

    private void AddedBehavior() {
        System.out.println("BB");
    }
}
