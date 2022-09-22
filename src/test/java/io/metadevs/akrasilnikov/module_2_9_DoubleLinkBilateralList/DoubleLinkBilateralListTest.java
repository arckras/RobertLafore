package io.metadevs.akrasilnikov.module_2_9_DoubleLinkBilateralList;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DoubleLinkBilateralListTest {
    DoubleLinkBilateralList doubleLinkBilateralList = new DoubleLinkBilateralList();
    ListIterator iterator = doubleLinkBilateralList.getIterator();

    @Test
    void iterator() {
        iterator.insertAfter(20);
        assertThat(doubleLinkBilateralList.getFirst().data).isEqualTo((long) 20);
        iterator.insertBefore(10);
        assertThat(doubleLinkBilateralList.getFirst().data).isEqualTo((long) 10);
    }

    @Test
    void deleteKey() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);
        doubleLinkBilateralList.deleteKey(300);

        assertThat(doubleLinkBilateralList.getFirst()).isEqualTo(doubleLinkBilateralList.deleteKey(200));
        assertThat(doubleLinkBilateralList.deleteKey(400)).isEqualTo(null);
    }

    @Test
    void insertAfter() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(400);

        assertThat(doubleLinkBilateralList.insertAfter(400, 300)).isEqualTo(true);

        doubleLinkBilateralList.deleteFirst();

        assertThat(doubleLinkBilateralList.getFirst().data).isEqualTo(300);
        assertThat(doubleLinkBilateralList.insertAfter(400, 300)).isEqualTo(false);
    }

    @Test
    void deleteLast() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);

        assertThat(doubleLinkBilateralList.getLast()).isEqualTo(doubleLinkBilateralList.deleteLast());

        doubleLinkBilateralList.deleteLast();
        doubleLinkBilateralList.deleteLast();
        assertThat(doubleLinkBilateralList.deleteLast()).isEqualTo(null);
    }

    @Test
    void deleteFirst() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);
        assertThat(doubleLinkBilateralList.getFirst()).isEqualTo(doubleLinkBilateralList.deleteFirst());
        doubleLinkBilateralList.deleteFirst();
        doubleLinkBilateralList.deleteFirst();
        assertThat(doubleLinkBilateralList.deleteFirst()).isEqualTo(null);
    }

    @Test
    void insertLast() {
        doubleLinkBilateralList.insertLast(100);
        doubleLinkBilateralList.insertLast(200);
        doubleLinkBilateralList.insertLast(300);
        assertThat(doubleLinkBilateralList.getFirst().data).isEqualTo(100);
        assertThat(doubleLinkBilateralList.getLast().data).isEqualTo(300);
    }

    @Test
    void insertFirst() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);
        assertThat(doubleLinkBilateralList.getFirst().data).isEqualTo(300);
        assertThat(doubleLinkBilateralList.getLast().data).isEqualTo(100);
    }
}
