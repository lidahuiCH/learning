package com.ldh.collection.collection.list;

import com.ldh.collection.collection.Collection;

import java.util.Iterator;

/**
 * Created on 2018/6/4.
 */
public class ArrayList<E> implements List<E> {
    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iteractor() {
        return null;
    }

    @Override
    public boolean removed(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArrry(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean removedAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
