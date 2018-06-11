package com.ldh.pattern.factory.factorymethod;

import com.ldh.pattern.factory.Operation;
import com.ldh.pattern.factory.Subtraction;

public class SubtractionFactory extends OperationFactory {
    @Override
    public Operation createOption() {
        return new Subtraction();
    }

    ;
}
