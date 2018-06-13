package com.ldh.pattern.observer;

public class ConcreteObserver2 extends Observer {

    private String name;
    private String observerState;
    private Subject subject;

    public ConcreteObserver2(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }


    @Override
    public void update() {
        System.out.println(this.name + "看书");
    }
}
