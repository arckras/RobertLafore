package io.metadevs.akrasilnikov.module_2_10_BinaryTree;

import zholud.homeworks.BinaryTrees.BinaryTree;

import java.util.Collections;
import java.util.List;

public class BenchmarkInitialisation {
    private void addAndShuffleElements(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public void insertNumberElements(BinaryTree<Integer> BinaryTree, List<Integer> list, int count) {
        addAndShuffleElements(list, count);
        for (int i = 0; i < count; i++) {
            BinaryTree.insert(list.get(i), i);
        }
    }

    public void deleteNumberElements(BinaryTree<Integer> BinaryTree, int count) {
        for (int i = 0; i < count; i++) {
            BinaryTree.delete(i);
        }
    }

    public void findNumberElements(BinaryTree<Integer> BinaryTree, int count) {
        for (int i = 0; i < count; i++) {
            BinaryTree.findElement(i);
        }
    }
}
