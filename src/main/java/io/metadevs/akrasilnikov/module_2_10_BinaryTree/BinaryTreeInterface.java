package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

public interface BinaryTreeInterface<T> {
    void insert(int keyData, T data);
    boolean delete(int key);
    BinaryTreeNode<T> findElement(int key);
    boolean isEmpty();
}
