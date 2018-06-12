package com.ldh.pattern.factory.builder;

/**
 * Created on 2018/5/24.
 */
public abstract class Builder {
    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract Product retrieveResult();
}
