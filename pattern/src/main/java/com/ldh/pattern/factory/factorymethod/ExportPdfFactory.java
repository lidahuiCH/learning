package com.ldh.pattern.factory.factorymethod;

/**
 * Created on 2018/5/24.
 */
public class ExportPdfFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {
        // TODO Auto-generated method stub
        if ("standard".equals(type)) {

            return new ExportStandardPdfFile();

        } else if ("financial".equals(type)) {

            return new ExportFinancialPdfFile();

        } else {
            throw new RuntimeException("没有找到对象");
        }
    }
}
