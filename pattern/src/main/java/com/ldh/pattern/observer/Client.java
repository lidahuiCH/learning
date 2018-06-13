package com.ldh.pattern.observer;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Subject subject = new ConcreteSubject();
        Subject subject2 = new ConcreteSubject2();
        Observer observer = new ConcreteObserver(subject, "小王");
        Observer observer2 = new ConcreteObserver2(subject2, "小李");
        subject.attch(observer);
        subject.attch(observer2);
        subject.notifyBySub();
        subject.detach(observer2);
        subject.notifyBySub();
    }
}
