package io.metadevs.akrasilnikov.module_2_9_DoubleLinkBilateralList;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DoubleLinkBilateralListTest {
    DoubleLinkBilateralList doubleLinkBilateralList = new DoubleLinkBilateralList();

    @Test
    void deleteKey() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);
        doubleLinkBilateralList.deleteKey(300);

        assertThat(doubleLinkBilateralList.first).isEqualTo(doubleLinkBilateralList.deleteKey(200));
        assertThat(doubleLinkBilateralList.deleteKey(400)).isEqualTo(null);
    }

    @Test
    void insertAfter() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(400);

        assertThat(doubleLinkBilateralList.insertAfter(400, 300)).isEqualTo(true);

        doubleLinkBilateralList.deleteFirst();

        assertThat(doubleLinkBilateralList.first.data).isEqualTo(300);
        assertThat(doubleLinkBilateralList.insertAfter(400, 300)).isEqualTo(false);
    }

    @Test
    void deleteLast() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);

        assertThat(doubleLinkBilateralList.last).isEqualTo(doubleLinkBilateralList.deleteLast());

        doubleLinkBilateralList.deleteLast();
        doubleLinkBilateralList.deleteLast();
        assertThat(doubleLinkBilateralList.deleteLast()).isEqualTo(null);
    }

    @Test
    void deleteFirst() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);
        assertThat(doubleLinkBilateralList.first).isEqualTo(doubleLinkBilateralList.deleteFirst());
        doubleLinkBilateralList.deleteFirst();
        doubleLinkBilateralList.deleteFirst();
        assertThat(doubleLinkBilateralList.deleteFirst()).isEqualTo(null);
    }

    @Test
    void insertLast() {
        doubleLinkBilateralList.insertLast(100);
        doubleLinkBilateralList.insertLast(200);
        doubleLinkBilateralList.insertLast(300);
        assertThat(doubleLinkBilateralList.first.data).isEqualTo(100);
        assertThat(doubleLinkBilateralList.last.data).isEqualTo(300);
    }
    @Test
    void insertFirst() {
        doubleLinkBilateralList.insertFirst(100);
        doubleLinkBilateralList.insertFirst(200);
        doubleLinkBilateralList.insertFirst(300);
        assertThat(doubleLinkBilateralList.first.data).isEqualTo(300);
        assertThat(doubleLinkBilateralList.last.data).isEqualTo(100);
    }
}
