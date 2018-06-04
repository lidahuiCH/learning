package com.ldh.pattern.proxy;

public class Proxy extends Subject {
    private RealSubject realSubject;

    @Override
    public void Request() {

        if (null == realSubject) {
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
