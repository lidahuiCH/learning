package com.ldh.pattern.factory.factorymethod;

import com.ldh.pattern.factory.Addition;
import com.ldh.pattern.factory.Operation;

public class AdditionFactory extends OperationFactory {
    @Override
    public Operation createOption(){
        return new Addition();
    };
}
