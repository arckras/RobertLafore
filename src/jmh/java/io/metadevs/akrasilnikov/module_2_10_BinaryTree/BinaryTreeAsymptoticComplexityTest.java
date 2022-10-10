package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@State(Scope.Benchmark)
public class BinaryTreeAsymptoticComplexityTest {
    @Param({"1001", "10001", "100001"})
    int value;

    BinaryTree<Integer> binaryTree;
    List<Integer> list;

    @Setup(Level.Invocation)
    public void prepare() {
        list = new ArrayList<>();
        for (int i = 0; i < value - 1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        binaryTree = new BinaryTree<>();
        for (int i = 0; i < value - 1; i++) {
            binaryTree.insert(list.get(i), i);
        }
    }

    @Benchmark
    public void insert() {
        binaryTree.insert(value, value);
    }

    @Benchmark
    public void delete() {
        binaryTree.delete(value - 2);
    }

    @Benchmark
    public void find() {
        binaryTree.findElement(value - 2);
    }
}
