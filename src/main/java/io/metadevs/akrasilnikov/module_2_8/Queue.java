package io.metadevs.akrasilnikov.module_2_8;

import java.util.Collection;
import java.util.Iterator;

public class Queue<T> implements java.util.Queue {
    private int maxSize;
    private T[] array;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

     @Override
    public int size() {
        return nItems;
    }

    @Override
    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    @Override
    public boolean add(Object o) {
        if (isFull()) {
            rear = -1;
        }
        array[++rear] = (T) o;
        nItems++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    public Object peek() {
        return array[front];
    }

      public T printOneObject(int index) {
        return array[index];
    }

    public void print() {
        for (T t : array) {
            System.out.println(t);
        }
    }

    @Override
    public T remove() {
        array[front] = null;
        T temp = array[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    @Override
    public boolean contains(Object o) {
        for (T t : array) {
            if (o.equals(t)) {
                return true;
            }
        }
        return false;
    }

    //region DoNotChange
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
    }


    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }
    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
    //endregion
}