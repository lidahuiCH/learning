package com.ldh.pattern.factory.factorymethod;

/**
 * Created on 2018/5/24.
 */
public class ExportFinancialHtmlFile implements ExportFile {

    @Override
    public boolean export(String data) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("导出财务版HTML文件");
        return true;
    }

}
