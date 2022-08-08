package io.metadevs.akrasilnikov.module_2_4_ArrayList;

import io.metadevs.akrasilnikov.OOP4.*;
import io.metadevs.akrasilnikov.module_2_4_ArrayList.ArrayList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayListTest {
    private ArrayList<AbstractSpecialist> arrayListPersons = new ArrayList<>();
    private AbstractSpecialist alice = new Manager("Alice", 18);
    private AbstractSpecialist bob = new Worker("Bob", 25);
    private AbstractSpecialist ares = new Worker("Ares", 40);
    private AbstractSpecialist nika = new Worker("Nika", 60);

    @Test
    public void ad() {
        for (int i = 0; i < 100; i++) {
            arrayListPersons.add(alice);
            assertThat(arrayListPersons.get(i)).isEqualTo(alice);
        }
    }

    @Test
    void remove() {
        arrayListPersons.add(alice);
        arrayListPersons.add(bob);
        arrayListPersons.remove(alice);
        assertThat(arrayListPersons.contains(alice)).isEqualTo(false);
        assertThat(arrayListPersons.contains(bob)).isEqualTo(true);
    }

    @Test
    public void size() {
        arrayListPersons.add(alice);
        assertThat(arrayListPersons.size()).isEqualTo(1);
    }

    @Test
    void isEmpty() {
        assertThat(arrayListPersons.isEmpty()).isEqualTo(true);
        arrayListPersons.add(alice);
        assertThat(arrayListPersons.isEmpty()).isEqualTo(false);
    }

    @Test
    void contains() {
        arrayListPersons.add(alice);
        assertThat(arrayListPersons.contains(alice)).isEqualTo(true);
        assertThat(arrayListPersons.contains(bob)).isEqualTo(false);
    }

    @Test
    void subList() {
        arrayListPersons.add(alice);
        arrayListPersons.add(bob);
        arrayListPersons.add(ares);
        arrayListPersons.add(nika);
        ArrayList<AbstractSpecialist> newArrayListPerson = (ArrayList<AbstractSpecialist>) arrayListPersons.subList(0, 2);
        assertThat(newArrayListPerson.get(0)).isEqualTo(alice);
        assertThat(newArrayListPerson.get(1)).isEqualTo(bob);
        assertThat(newArrayListPerson.size()).isEqualTo(2);
        assertThat(newArrayListPerson.subList(0, 0)).isEqualTo(null);
    }
}