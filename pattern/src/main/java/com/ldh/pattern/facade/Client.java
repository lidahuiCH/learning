package com.ldh.pattern.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.CallOneAndThree();
        facade.CallTwoAndThree();
    }
}
