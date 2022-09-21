package io.metadevs.akrasilnikov.module_2_8_Stack_and_Queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackPeekTest {
    Stack<Integer> stack = new Stack(111);

    @Test
    void peek() {
        for (int i = 0; i < 111; i++) {
            stack.push(i);
        }
        assertThat(stack.peek()).isEqualTo(110);
        assertThat(stack.peek()).isEqualTo(110);
    }
}