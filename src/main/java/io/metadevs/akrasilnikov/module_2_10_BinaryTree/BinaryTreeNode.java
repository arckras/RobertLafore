package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

public class BinaryTreeNode<T> {
    public T data;
    public int keyData;
    public BinaryTreeNode<T> leftChild;
    public BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data, int keyData) {
        this.data = data;
        this.keyData = keyData;
    }
}
