package com.ldh.pattern.prototype;

public abstract class Prototype implements Cloneable {
    private String id;

    Prototype(String id) {
        this.id = id;
    }

    public Prototype clone() {
        Prototype clone = null;
        try {
            clone = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }

    ;

    public void setId(String id) {
        this.id = id;
    }

    public void outId() {
        System.out.println(id);
    }
}
