package io.metadevs.akrasilnikov.module_2_9_DoubleLinkBilateralList;

public class DoubleLink<T> {
    public T data;
    public DoubleLink<T> next;
    public DoubleLink<T> previous;

    public DoubleLink(T data) {
        this.data = data;
    }

    public void displayLink() {
        System.out.print(data + " ");
    }
}