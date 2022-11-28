package io.metadevs.akrasilnikov.module_2_11_HashTable;

public interface HashMapInterface<T> {
    int size();

    boolean isEmpty();

    void insert(int key, T data);

    DataItem<T> find(int key);

    DataItem<T> delete(int key);
}
