package io.metadevs.akrasilnikov.module_2_11_HashTable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HashTableTest {
    HashTable<String> hashTable = new HashTable<>(3);

    @Test
    void isEmpty() {
        assertThat(hashTable.isEmpty()).isEqualTo(true);
        hashTable.insert(10, "One");
        assertThat(hashTable.isEmpty()).isEqualTo(false);
    }

    @Test
    void insetElements() {
        hashTable.insert(10, "One");
        hashTable.insert(20, "Two");
        hashTable.insert(30, "Three");
        assertThat(hashTable.size()).isEqualTo(3);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> hashTable.insert(30, "Tree"));
    }

    @Test
    void findTest() {
        hashTable.insert(10, "One");
        hashTable.insert(20, "Two");
        hashTable.insert(30, "Three");
        assertThat(hashTable.find(10).getData()).isEqualTo("One");
        assertThat(hashTable.find(20).getData()).isEqualTo("Two");
        assertThat(hashTable.find(30).getData()).isEqualTo("Three");
    }

    @Test
    void deleteTest() {
        hashTable.insert(10, "One");
        hashTable.insert(20, "Two");
        hashTable.insert(30, "Three");
        hashTable.delete(10);
        hashTable.delete(20);
        hashTable.delete(30);
        assertThat(hashTable.isEmpty()).isEqualTo(true);
    }
}
