package io.metadevs.akrasilnikov.module_2_11_HashTable;


public class HashTable<T> implements HashMapInterface<T> {
    private DataItem<T>[] hashArray;
    private int size;
    private DataItem<T> nonItem;

    public HashTable(int length) {
        hashArray = new DataItem[length];
        size = 0;
        nonItem = new DataItem(-1, null);
    }

    public DataItem<T>[] getHashArray() {
        return hashArray;
    }

    public void display() {
        for (DataItem<T> t : hashArray) {
            System.out.println(t);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public DataItem<T> find(int key) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Hash table is empty");
        }
        int hashValue = hashFunction(key);
        int stepSize = hashFunctionForStep(key);
        int stepCount = 0;
        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getKeyData() == key) {
                return hashArray[hashValue];
            }
            hashValue += stepSize;
            hashValue %= hashArray.length;
            if (stepCount >= hashArray.length) {
                throw new IllegalArgumentException("No element");
            }
            stepCount++;
        }
        throw new IllegalArgumentException("No element");
    }

    @Override
    public void insert(int key, T data) {
        int hashValue = hashFunction(key);
        int stepSize = hashFunctionForStep(key);
        int stepCount = 0;

        while (hashArray[hashValue] != null && hashArray[hashValue].getKeyData() != -1) {
            if (hashArray[hashValue].getKeyData() == key) {
                throw new IllegalArgumentException("Element already exists");
            }
            hashValue += stepSize;
            hashValue %= hashArray.length;
            if (stepCount >= hashArray.length) {
                throw new IllegalArgumentException("Failed to insert element");
            }
            stepCount++;
        }
        hashArray[hashValue] = new DataItem<>(key, data);
        size++;
    }

    @Override
    public DataItem<T> delete(int key) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Hash table is empty");
        }
        int hashValue = hashFunction(key);
        int stepSize = hashFunctionForStep(key);
        int stepCount = 0;

        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getKeyData() == key) {
                DataItem<T> temp = hashArray[hashValue];
                hashArray[hashValue] = nonItem;
                size--;
                return temp;
            }
            hashValue += stepSize;
            hashValue %= hashArray.length;
            if (stepCount >= hashArray.length) {
                throw new IllegalArgumentException("No element");
            }
            stepCount++;
        }
        throw new IllegalArgumentException("No element");
    }

    private int hashFunction(int key) {
        return key % hashArray.length;
    }

    private int hashFunctionForStep(int key) {
        return 5 - key % 5;
    }
}
