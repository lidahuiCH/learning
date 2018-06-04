package com.ldh.pattern.factory.builder;

/**
 * Created on 2018/5/24.
 */
public interface Builder {
    public void buildPart1();

    public void buildPart2();

    public Product retrieveResult();
}
