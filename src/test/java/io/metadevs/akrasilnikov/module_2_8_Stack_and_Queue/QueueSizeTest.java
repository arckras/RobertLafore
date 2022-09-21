package io.metadevs.akrasilnikov.module_2_8_Stack_and_Queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class QueueSizeTest {
    Queue<Integer> queue = new Queue<>(111);

    @Test
    void size() {
        for (int i = 0; i < 111; i++) {
            queue.add(i);
        }
        assertThat(queue.size()).isEqualTo(111);
    }
}

