package io.metadevs.akrasilnikov.module_2_8_Stack_and_Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueIsFullTest {
    Queue<Integer> queue = new Queue<>(111);

    @Test
    void isFull() {
        Assertions.assertFalse(queue.isFull());
        for (int i = 0; i < 111; i++) {
            queue.add(i);
        }
        Assertions.assertTrue(queue.isFull());
    }
}

