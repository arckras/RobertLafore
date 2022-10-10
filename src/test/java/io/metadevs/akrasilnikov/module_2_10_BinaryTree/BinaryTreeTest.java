package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeTest {
    BinaryTree<String> BinaryTree = new BinaryTree<>();

    @Test
    void insert() {
        BinaryTree.insert(50, "One");
        BinaryTree.insert(25, "Two");
        BinaryTree.insert(75, "Three");
        assertThat(BinaryTree.findElement(25).data).isEqualTo("Two");
        assertThat(BinaryTree.findElement(75).data).isEqualTo("Three");
        //System.out.println(BinaryTree.findElement(75).data);
    }

    @Test
    void delete() {
        BinaryTree.insert(50, "One");
        BinaryTree.insert(25, "Two");
        BinaryTree.insert(75, "Three");
        assertThat(BinaryTree.delete(25)).isEqualTo(true);
        assertThat(BinaryTree.delete(75)).isEqualTo(true);
        assertThat(BinaryTree.delete(50)).isEqualTo(true);
        assertThat(BinaryTree.isEmpty()).isEqualTo(true);
    }

    @Test
    void findElement() {
        BinaryTree.insert(50, "One");
        BinaryTree.insert(25, "Two");
        BinaryTree.insert(75, "Three");
        assertThat(BinaryTree.findElement(50).data).isEqualTo("One");
        assertThat(BinaryTree.findElement(75).data).isEqualTo("Three");
    }

    @Test
    void isEmpty() {
        assertThat(BinaryTree.isEmpty()).isEqualTo(true);
    }
}