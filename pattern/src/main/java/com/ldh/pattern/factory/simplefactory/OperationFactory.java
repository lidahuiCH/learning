package com.ldh.pattern.factory.simplefactory;

import com.ldh.pattern.factory.Addition;
import com.ldh.pattern.factory.Operation;
import com.ldh.pattern.factory.Subtraction;

public class OperationFactory {
    public static Operation createOperation(OperationType type) {
        switch (type) {
            case addition:
                return new Addition();
            case subtraction:
                return new Subtraction();
            default:
                return null;
        }

    }
}
