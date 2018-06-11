package com.ldh.pattern.factory.simplefactory;

import com.ldh.pattern.factory.Operation;

/**
 * Created on 2018/5/23.
 */
public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation(OperationType.addition);
        operation.setNumber(1.2, 2.4);
        System.out.println(operation.getResult());
    }
}
