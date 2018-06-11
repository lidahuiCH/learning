package com.ldh.pattern.temple;

public abstract class AbstractClass {

    abstract void PrimitiveOperation1();

    abstract void PrimitiveOperation2();

    public void TempleMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
    }
}
