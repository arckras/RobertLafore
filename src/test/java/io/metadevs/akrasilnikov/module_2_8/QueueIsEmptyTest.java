package io.metadevs.akrasilnikov.module_2_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueIsEmptyTest {
    Queue<Integer> queue = new Queue<>(111);

    @Test
    void isEmpty() {
        Assertions.assertTrue(queue.isEmpty());
        for (int i = 0; i < 111; i++) {
            queue.add(i);
        }
        Assertions.assertFalse(queue.isEmpty());
    }
}

