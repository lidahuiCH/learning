package com.ldh.pattern.factory.builder;

/**
 * Created on 2018/5/24.
 */
public class Director {
    /**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;

    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct(Builder builder) {
        this.builder = builder;
        this.builder.buildPart1();
        this.builder.buildPart2();
    }
}
