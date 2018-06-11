package com.ldh.pattern.prototype;

public class ConcretePrototypeB extends Prototype {

    ConcretePrototypeB(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return super.clone();
    }
}
