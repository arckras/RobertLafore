//package io.metadevs.akrasilnikov.module_2_8;
//
//import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
//
//class QueueRemoveTest {
//    Queue<Integer> queue = new Queue<>(111);
//
//    @Test
//    void remove() {
//        for (int i = 0; i < 111; i++) {
//            queue.add(i);
//        }
//
//        queue.print();
//
//        queue.remove();
//
//        queue.print();
//
//        assertThat(queue.printOneObject(0)).isEqualTo(null);
//        assertThat(queue.printOneObject(109)).isEqualTo(109);
//
//        queue.add(110);
//
//        queue.print();
//
//        assertThat(queue.printOneObject(0)).isEqualTo(110);
//    }
//}

