package com.ldh.pattern.facade;

public class Facade {

    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void CallOneAndThree() {
        one.MethodOne();
        three.MethodTree();
    }

    public void CallTwoAndThree() {
        two.MethodTwo();
        three.MethodTree();
    }
}
