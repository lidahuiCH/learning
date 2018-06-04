package com.ldh.pattern.factory.simplefactory;

/**
 * Created on 2018/5/23.
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1, 1);
    }
}
