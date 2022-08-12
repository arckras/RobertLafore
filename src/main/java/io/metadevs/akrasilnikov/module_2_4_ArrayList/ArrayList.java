package io.metadevs.akrasilnikov.module_2_4_ArrayList;

import java.util.*;

import static java.util.Arrays.copyOfRange;

public class ArrayList<E> implements List<E> {
    private E[] array;
    private int size;

    public ArrayList(E[] array) {
        this.array = array;
        this.size = array.length;
    }

    public ArrayList(int length) {
        this.array = (E[]) new Object[length];
        this.size = 0;
    }

    public ArrayList() {
        this.array = (E[]) new Object[10];
        this.size = 0;
    }

    //region getters/setters
    public E[] getArray() {
        return array;
    }

    @Override
    public E get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("The index cannot be negative");
        }
        return array[index];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLength() {
        return array.length;
    }
    //endregion

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public E[] copyOf(E[] original, int newLength) {
        if (newLength < 0) {
            return null;
        }
        E[] array = (E[]) new Object[newLength];
        for (int i = 0; i < original.length; i++) {
            array[i] = original[i];
        }
        return array;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("The index cannot be negative");
        }
        if (index >= array.length - 1) {
            array = copyOf(array, array.length + 1);// +index
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @Override
    public boolean add(E name) {
        if (array.length <= size) {
            array = copyOf(array, array.length * 2);
        }
        array[size] = name;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public E remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("The index cannot be negative");
        }
        if (size <= 0) {
            return null;
        }
        E object = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return object;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object name) {
        for (Object o : array) {
            if (name.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        if (toIndex - fromIndex <= 0) {
            return null;
        }
        E[] subArray = copyOfRange(array, fromIndex, toIndex);
        return new ArrayList<>(subArray);
    }

    //region list methods
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public E set(int index, E element) {
        return null;
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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }
//endregion
}
