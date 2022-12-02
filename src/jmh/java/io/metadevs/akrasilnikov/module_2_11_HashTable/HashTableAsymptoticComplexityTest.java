package io.metadevs.akrasilnikov.module_2_11_HashTable;

import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
public class HashTableAsymptoticComplexityTest {
    @Param({"1001", "10001", "100001"})
    int value;

    HashTable<Integer> hashTable;

    @Setup(Level.Invocation)
    public void prepare() {
        hashTable = new HashTable<>(value);
        for (int i = 0; i < value - 1; i++) {
            hashTable.insert(i, i);
        }
    }

    @Benchmark
    public void insertOneNode() {
        hashTable.insert(value, value);
    }

    @Benchmark
    public void insertAndFindOneNode() {
        hashTable.insert(value, value);
        hashTable.find(value);
    }

    @Benchmark
    public void insertAndDeleteOneNode() {
        hashTable.insert(value, value);
        hashTable.delete(value);
    }

    @TearDown
    public void post() {
        hashTable.display(value);
    }
}
