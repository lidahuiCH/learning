package com.ldh.pattern.factory.factorymethod;

public class Client {
    public static void main(String[]args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1,1);
        cf.makeComputer(2,2);
    }
}
