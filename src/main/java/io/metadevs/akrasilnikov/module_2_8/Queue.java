package io.metadevs.akrasilnikov.module_2_8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Queue<T> implements java.util.List {
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

    //region getters/setters
    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }
    //endregion

    //region MyCode
    @Override
    public int size() {
        return nItems;
    }

    @Override
    public boolean isEmpty() {
        return nItems == 0;
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

//    @Override
//    public Object remove() {
//         Object temp = array[front++];
//        if (isFull()) {
//            front = 0;
//        }
//        nItems--;
//        return temp;
//    }
//
    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    public Object peek() {
        return array[front];
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public T printOneObject(int index) {
        return array[index];
    }

    public void print() {
        for (T t : array) {
            System.out.println(t);
        }
    }
    //endregion

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
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
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}