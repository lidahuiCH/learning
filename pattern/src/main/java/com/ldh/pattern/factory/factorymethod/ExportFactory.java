package com.ldh.pattern.factory.factorymethod;

/**
 * Created on 2018/5/24.
 */
public interface ExportFactory {
    public ExportFile factory(String type);
}
