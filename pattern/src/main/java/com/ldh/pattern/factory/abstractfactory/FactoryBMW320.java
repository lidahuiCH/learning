package com.ldh.pattern.factory.abstractfactory;

/**
 * Created on 2018/5/23.
 */
public class FactoryBMW320 implements AbstractFactory{

    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
