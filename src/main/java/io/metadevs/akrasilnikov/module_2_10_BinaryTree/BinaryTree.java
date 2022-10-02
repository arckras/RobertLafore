package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

public class BinaryTree<T> implements BinaryTreeInterface<T> {
    private BinaryTreeNode<T> root;
    private boolean isLeftChild = true;

    public BinaryTree() {
        root = null;
    }

    @Override
    public void insert(int keyData, T data) {
        BinaryTreeNode<T> binaryTreeNode = new BinaryTreeNode<>(data, keyData);
        if (isEmpty()) {
            root = binaryTreeNode;
            return;
        }
        BinaryTreeNode<T> current = root;
        BinaryTreeNode<T> parent;
        while (true) {
            parent = current;
            if (keyData == current.keyData) {
                throw new IllegalArgumentException("The node already exists");
            }
            if (current.keyData > binaryTreeNode.keyData) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = binaryTreeNode;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = binaryTreeNode;
                    return;
                }
            }
        }
    }

    @Override
    public boolean delete(int key) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Empty tree");
        }
        BinaryTreeNode<T> current = root;
        BinaryTreeNode<T> parent = root;
        while (current.keyData != key) {
            parent = current;
            if (key < current.keyData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                throw new IllegalArgumentException("Failed to find the item");
            }
        }
        if (current.leftChild == null && current.rightChild == null) {
            swapNode(null, current, parent);
        } else if (current.rightChild == null) {
            swapNode(current.leftChild, current, parent);
        } else if (current.leftChild == null) {
            swapNode(current.rightChild, current, parent);
        } else {
            BinaryTreeNode<T> successor = getSuccessor(current);
            swapNode(successor, current, parent);
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private void swapNode(BinaryTreeNode<T> child, BinaryTreeNode<T> current, BinaryTreeNode<T> parent) {
        if (current == root) {
            root = child;
            return;
        }
        if (isLeftChild) {
            parent.leftChild = child;
            return;
        }
        parent.rightChild = child;
    }

    private BinaryTreeNode<T> getSuccessor(BinaryTreeNode<T> deleteBinaryNode) {

        BinaryTreeNode<T> successorParent = deleteBinaryNode;
        BinaryTreeNode<T> successor = deleteBinaryNode;
        BinaryTreeNode<T> current = deleteBinaryNode.rightChild;
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Empty tree");
        }
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = deleteBinaryNode.leftChild;
        }
        if (successor != deleteBinaryNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = deleteBinaryNode.rightChild;

        }
        return successor;
    }

    @Override
    public BinaryTreeNode<T> findElement(int key) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Empty tree");
        }
        BinaryTreeNode<T> current = root;
        while (current.keyData != key) {
            if (current.keyData <= key) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }
            if (current == null) {
                throw new IllegalArgumentException("Failed to find the item");
            }
        }
        return current;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}
