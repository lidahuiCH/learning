package com.ldh.pattern.factory.abstractfactory;

/**
 * Created on 2018/5/23.
 */
public interface  AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
