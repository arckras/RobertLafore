package io.metadevs.akrasilnikov.module_2_4.ArrayList;

import io.metadevs.akrasilnikov.module_2_4.OOP.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayListTest {
    private ArrayList<Person> arrayListPersons = new ArrayList<>();
    private Person alice = new Person("Alice", 18, 50000);
    private Person bob = new Person("Bob", 25, 60000);
    private Person ares = new Person("Ares", 40, 100000);
    private Person nika = new Person("Nika", 60, 150000);

//    @Test
//    public void ad() {
//        arrayListPersons.add(alice);
//        assertThat(arrayListPersons.get(0)).isEqualTo(alice);
//        //assertThat(arrayListPersons.add(bob)).isEqualTo(true);
//    }

    @Test
    public void ad() {
        for (int i = 0; i < 100; i++) {
            arrayListPersons.add(alice);
            assertThat(arrayListPersons.get(i)).isEqualTo(alice);
           // assertThat(arrayListPersons.add(bob)).isEqualTo(true);
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
        ArrayList<Person> newArrayListPerson = (ArrayList<Person>) arrayListPersons.subList(0, 2);
        assertThat(newArrayListPerson.get(0)).isEqualTo(alice);
        assertThat(newArrayListPerson.get(1)).isEqualTo(bob);
        assertThat(newArrayListPerson.size()).isEqualTo(2);
        assertThat(newArrayListPerson.subList(0, 0)).isEqualTo(null);
    }
}