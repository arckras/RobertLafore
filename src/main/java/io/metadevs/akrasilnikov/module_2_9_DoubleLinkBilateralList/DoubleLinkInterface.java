package io.metadevs.akrasilnikov.module_2_9_DoubleLinkBilateralList;

public interface DoubleLinkInterface<T> {

    boolean isEmpty();
    void insertFirst(T data);
    void insertLast(T data);
    DoubleLink deleteFirst();
    DoubleLink deleteLast();
    boolean insertAfter(T key, T data);
    DoubleLink deleteKey(T key);
    void displayForward();
    void displayBackward();
}
