package com.learning.effective.element;

public class UseStaticFactoryMethod {
    /**
     * 静态工厂方法与构造器的优势
     * 1、静态工厂方法有名字
     * 2、不必在每次调用他的时候都创建一个新对象
     * 3、可以返回原返回类型的任何子类的对象
     * 4、在创建参数化类型实例的时候，可以使代码变的更简洁
     * 缺点
     * 1、类如果不含有公有的或者受保护的构造器，就不能被子类化
     * 2、静态工厂方法与其他静态方法本质上没有区别
     * @param b
     * @return
     */
    public static Boolean valueof(boolean b){
        return b ? Boolean.TRUE :Boolean.FALSE;
    }


}
