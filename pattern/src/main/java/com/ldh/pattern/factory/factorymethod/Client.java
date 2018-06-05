package com.ldh.pattern.factory.factorymethod;

import com.ldh.pattern.factory.Operation;

/**
 * Created on 2018/5/24.
 * 工厂方法模式和简单工厂模式在结构上的不同很明显。工厂方法模式的核心是一个抽象工厂类，而简单工厂模式把核心放在一个具体类上。
 * 工厂方法模式退化后可以变得很像简单工厂模式。设想如果非常确定一个系统只需要一个具体工厂类，那么不妨把抽象工厂类合并到具体工厂类中去。
 * 由于只有一个具体工厂类，所以不妨将工厂方法改为静态方法，这时候就得到了简单工厂模式。
 * 如果系统需要加入一个新的导出类型，那么所需要的就是向系统中加入一个这个导出类以及所对应的工厂类。
 * 没有必要修改客户端，也没有必要修改抽象工厂角色或者其他已有的具体工厂角色。对于增加新的导出类型而言，这个系统完全支持“开-闭原则”。
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OperationFactory operationFactory = new AdditionFactory();
        Operation operation=operationFactory.createOption();
        operation.setNumber(1.2,2.4);
        System.out.println(operation.getResult());
    }
}
