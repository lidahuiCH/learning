package com.ldh.pattern.factory.factorymethod;

import com.ldh.pattern.factory.AmdCpu;
import com.ldh.pattern.factory.Cpu;
import com.ldh.pattern.factory.IntelCpu;

public class CpuFactory {
    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}