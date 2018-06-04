package com.ldh.collection.collection.set;

import com.ldh.collection.collection.Collection;

import java.util.Iterator;

/**
 * Created on 2018/6/4.
 */
public class TreeSet<E> implements SortedSet<E> {

    @Override
    public boolean add(E o) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iteractor() {
        return null;
    }

    @Override
    public boolean removed(Object o) {
        return false;
    }

    @Override
    public boolean removedAll(Collection<?> collection) {
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
    public <T> T[] toArrry(T[] t) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
