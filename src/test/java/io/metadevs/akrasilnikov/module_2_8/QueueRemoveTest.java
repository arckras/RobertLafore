package io.metadevs.akrasilnikov.module_2_8;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class QueueRemoveTest {
    Queue<Integer> queue = new Queue<>(111);

    @Test
    void remove() {
        for (int i = 0; i <= 111; i++) {
            queue.add(i);
        }

        queue.remove();
        assertThat(queue.printOneObject(0)).isEqualTo(null);
        assertThat(queue.printOneObject(110)).isEqualTo(110);

        queue.add(400);
        assertThat(queue.printOneObject(0)).isEqualTo(400);
    }
}

