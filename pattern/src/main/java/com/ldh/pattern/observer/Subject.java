package com.ldh.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void attch(Observer o) {
        observerList.add(o);
    }

    ;

    public void detach(Observer o) {
        observerList.remove(o);
    }

    ;

    public void notifyBySub() {
        for (Observer o : observerList
                ) {
            o.update();
        }
    }

    ;
}
