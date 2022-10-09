package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.*;

import  static org.assertj.core.api.Assertions.assertThat;
import  org.assertj.core.api.Assertions.assertThatExceptionOfType;

class BinaryTreeTest {

    private final BinaryTree<String> customBinaryTree = new BinaryTree<>();
    @Test
    void insert() {
        //BinaryTree.insert(50, "Boom");
        BinaryTree.insert(10, "First");
        BinaryTree.insert(5, "Second");
        BinaryTree.insert(15, "Third");
        assertThat(BinaryTree.findElement(5).data).isEqualTo("Second");
        assertThat(BinaryTree.findElement(15).data).isEqualTo("Third");
        //System.out.println(BinaryTree.class);
        //assertThat(BinaryTree.class);

        //assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> BinaryTree.insert(50, "Boom"));
    }

    @Test
    void delete() {

    }

    @Test
    void findElement() {
    }

    @Test
    void isEmpty() {
    }
}