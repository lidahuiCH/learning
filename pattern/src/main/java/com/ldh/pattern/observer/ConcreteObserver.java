package com.ldh.pattern.observer;

public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private Subject subject;

    public ConcreteObserver(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }


    @Override
    public void update() {
        System.out.println(this.name + "打麻将");
    }
}
