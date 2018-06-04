package com.ldh.collection.collection.list;

import com.ldh.collection.collection.Collection;

import java.util.Iterator;

/**
 * Created on 2018/6/4.
 */
public interface List<E> extends Collection<E> {
    @Override
    boolean add(E o);

    @Override
    boolean addAll(Collection<? extends E> c);

    @Override
    void clear();

    @Override
    boolean contains(E o);

    @Override
    boolean containsAll(Collection<?> c);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    boolean isEmpty();

    @Override
    Iterator<E> iteractor();

    @Override
    boolean removed(Object o);

    @Override
    boolean removedAll(Collection<?> collection);

    @Override
    int size();

    @Override
    Object[] toArray();

    @Override
    Iterator<E> iterator();

    @Override
    <T> T[] toArrry(T[] t);
}
