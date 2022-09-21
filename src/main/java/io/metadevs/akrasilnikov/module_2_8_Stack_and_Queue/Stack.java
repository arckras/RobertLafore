package io.metadevs.akrasilnikov.module_2_8_Stack_and_Queue;

public class Stack<T> implements InterfaceStack {
    private int maxSize;
    private T[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }

    @Override
    public void push(Object o) {
        stackArray[++top] = (T) o;
    }

    @Override
    public T pop() {
        stackArray[top] = null;
        return stackArray[top--];
    }

    @Override
    public T peek() {
        return stackArray[top];
    }

    public void display() {
        for (T t : stackArray) {
            System.out.println(t);
        }
    }

    @Override
    public T elementByIndex(int index) {
        return stackArray[index];
    }
}

