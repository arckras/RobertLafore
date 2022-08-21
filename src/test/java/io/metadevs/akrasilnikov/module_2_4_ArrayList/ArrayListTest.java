package io.metadevs.akrasilnikov.module_2_4_ArrayList;

import io.metadevs.akrasilnikov.OOP.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayListTest {
    private ArrayList<AbstractSpecialist> arrayListAbstractSpecialists = new ArrayList<>();
    private AbstractSpecialist alice = new Manager("Alice", 18);
    private AbstractSpecialist bob = new Worker("Bob", 25);
    private AbstractSpecialist ares = new Worker("Ares", 40);
    private AbstractSpecialist nika = new Worker("Nika", 60);

    @Test
    public void ad() {
        for (int i = 0; i < 100; i++) {
            arrayListAbstractSpecialists.add(alice);
            assertThat(arrayListAbstractSpecialists.get(i)).isEqualTo(alice);
        }
    }

    @Test
    void remove() {
        arrayListAbstractSpecialists.add(alice);
        arrayListAbstractSpecialists.add(bob);
        arrayListAbstractSpecialists.remove(alice);
        assertThat(arrayListAbstractSpecialists.contains(alice)).isEqualTo(false);
        assertThat(arrayListAbstractSpecialists.contains(bob)).isEqualTo(true);
    }

    @Test
    public void size() {
        arrayListAbstractSpecialists.add(alice);
        assertThat(arrayListAbstractSpecialists.size()).isEqualTo(1);
    }

    @Test
    void isEmpty() {
        assertThat(arrayListAbstractSpecialists.isEmpty()).isEqualTo(true);
        arrayListAbstractSpecialists.add(alice);
        assertThat(arrayListAbstractSpecialists.isEmpty()).isEqualTo(false);
    }

    @Test
    void contains() {
        arrayListAbstractSpecialists.add(alice);
        assertThat(arrayListAbstractSpecialists.contains(alice)).isEqualTo(true);
        assertThat(arrayListAbstractSpecialists.contains(bob)).isEqualTo(false);
    }

    @Test
    void subList() {
        arrayListAbstractSpecialists.add(alice);
        arrayListAbstractSpecialists.add(bob);
        arrayListAbstractSpecialists.add(ares);
        arrayListAbstractSpecialists.add(nika);
        ArrayList<AbstractSpecialist> newArrayListPerson = (ArrayList<AbstractSpecialist>) arrayListAbstractSpecialists.subList(0, 2);
        assertThat(newArrayListPerson.get(0)).isEqualTo(alice);
        assertThat(newArrayListPerson.get(1)).isEqualTo(bob);
        assertThat(newArrayListPerson.size()).isEqualTo(2);
        assertThat(newArrayListPerson.subList(0, 0)).isEqualTo(null);
    }
}