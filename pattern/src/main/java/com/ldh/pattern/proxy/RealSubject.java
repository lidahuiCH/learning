package com.ldh.pattern.proxy;

public class RealSubject extends Subject {
    @Override
    public void Request() {
        System.out.println("real request");
    }
}
