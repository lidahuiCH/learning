package com.ldh.pattern.factory.simplefactory;

import com.ldh.pattern.factory.AmdMainboard;
import com.ldh.pattern.factory.IntelMainboard;
import com.ldh.pattern.factory.Mainboard;

/**
 * Created on 2018/5/23.
 */
public class MainboardFactory {
    public static Mainboard createMainboard(int type) {
        Mainboard mainboard = null;
        if (type == 1) {
            mainboard = new IntelMainboard(755);
        } else if (type == 2) {
            mainboard = new AmdMainboard(938);
        }
        return mainboard;
    }
}
