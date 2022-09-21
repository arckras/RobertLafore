package io.metadevs.akrasilnikov.module_2_8_Stack_and_Queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QueueAddTest {
    Queue<Integer> queue = new Queue<>(111);

    @Test
    void add() {
        for (int i = 0; i < 110; i++) {
            queue.add(i);
        }
        assertThat(queue.peek()).isEqualTo(0);
        assertThat(queue.printOneObject(50)).isEqualTo(50);
        assertThat(queue.printOneObject(110)).isEqualTo(null);
    }
}

