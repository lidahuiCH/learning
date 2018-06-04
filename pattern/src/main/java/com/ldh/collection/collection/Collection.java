package com.ldh.collection.collection;

import java.util.Iterator;

/**
 * Created on 2018/6/4.
 */
public interface Collection<E> extends Iterable<E> {
    boolean add(E o);

    boolean addAll(Collection<? extends E> c);

    void clear();

    boolean contains(E o);

    boolean containsAll(Collection<?> c);


    boolean equals(Object o);

    int hashCode();

    boolean isEmpty();

    Iterator<E> iteractor();

    boolean removed(Object o);

    boolean removedAll(Collection<?> collection);

    int size();

    Object[] toArray();

    <T> T[] toArrry(T[] t);

}
