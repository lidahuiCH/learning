package com.ldh.pattern.factory.factorymethod;

/**
 * Created on 2018/5/23.
 */
public class FactoryBMW320 implements FactoryBMW {

    @Override
    public BMW320 createBMW() {

        return new BMW320();
    }

}
