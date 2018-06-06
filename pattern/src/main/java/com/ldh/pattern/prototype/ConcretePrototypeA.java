package com.ldh.pattern.prototype;

public class ConcretePrototypeA extends Prototype {

    ConcretePrototypeA(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return super.clone();
    }


}
