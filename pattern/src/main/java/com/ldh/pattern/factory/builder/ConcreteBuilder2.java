package com.ldh.pattern.factory.builder;

public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("具体建造者2part1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("具体建造者2part2");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
