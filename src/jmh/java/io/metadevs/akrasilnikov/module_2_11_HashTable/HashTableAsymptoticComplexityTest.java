package io.metadevs.akrasilnikov.module_2_11_HashTable;

import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
public class HashTableAsymptoticComplexityTest {
    @Param({"11"})
    int value;

    HashTable<Integer> hashTable;
//    List<Integer> list;

    @Setup(Level.Invocation)
    public void prepare() {
        HashTable<Integer> hashTable = new HashTable<>(value);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < value - 1; i++) {
//            list.add(i);
//        }
        for (int i = 0; i < value - 1; i++) {
            hashTable.insert(i, i);
        }
    }

    @Benchmark
    public void insert() {
        //HashTable<Integer> hashTable = new HashTable<>(97);
        //List<Integer> list = new ArrayList<>();
        hashTable.insert(value, value);
    }

//    @Benchmark
//    public void insertAndDelete97Elements() {
//        HashTable<Integer> hashTable = new HashTable<>(97);
//        List<Integer> list = new ArrayList<>();
//        insertNumberElements(hashTable, list, 97);
//        deleteNumberElements(hashTable);
//    }
//
//    @Benchmark
//    public void insertAndFind97Elements() {
//        HashTable<Integer> hashTable = new HashTable<>(97);
//        List<Integer> list = new ArrayList<>();
//        insertNumberElements(hashTable, list, 97);
//        findNumberElements(hashTable);
//    }


}
