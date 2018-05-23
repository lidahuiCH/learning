package com.ldh.pattern.factory.abstractfactory;

/**
 * Created on 2018/5/23.
 */
public class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
