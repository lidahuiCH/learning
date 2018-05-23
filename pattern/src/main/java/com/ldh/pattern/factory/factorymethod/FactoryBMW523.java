package com.ldh.pattern.factory.factorymethod;

/**
 * Created on 2018/5/23.
 */
public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {

        return new BMW523();
    }
}
