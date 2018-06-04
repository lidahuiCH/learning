package com.ldh.pattern.factory;

/**
 * Created on 2018/5/23.
 */
public class AmdCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
