package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class TestBinaryTreesMethodsExecutionTime extends BenchmarkInitialisation {

    @Benchmark
    public void insert100Elements() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(binaryTree, list, 100);
    }

    @Benchmark
    public void insert1000Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 1000);
    }

    @Benchmark
    public void insert10000Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 10000);
    }

    @Benchmark
    public void insertAndDelete100Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 100);
        deleteNumberElements(BinaryTree, 100);
    }

    @Benchmark
    public void insertAndDelete1000Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 1000);
        deleteNumberElements(BinaryTree, 1000);
    }

    @Benchmark
    public void insertAndDelete10000Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 10000);
        deleteNumberElements(BinaryTree, 10000);
    }

    @Benchmark
    public void insertAndFind100Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 100);
        findNumberElements(BinaryTree, 100);
    }

    @Benchmark
    public void insertAndFind1000Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 1000);
        findNumberElements(BinaryTree, 1000);
    }

    @Benchmark
    public void insertAndFind10000Elements() {
        BinaryTree<Integer> BinaryTree = new BinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(BinaryTree, list, 10000);
        findNumberElements(BinaryTree, 10000);
    }
}
