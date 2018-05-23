package com.ldh.pattern.factory.abstractfactory;

import com.ldh.pattern.factory.Cpu;
import com.ldh.pattern.factory.IntelCpu;
import com.ldh.pattern.factory.IntelMainboard;
import com.ldh.pattern.factory.Mainboard;

public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(755);
    }
}