package io.metadevs.akrasilnikov.module_2_8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackPopTest {
    Stack<Integer> stack = new Stack(111);

    @Test
    void pop() {
        for (int i = 0; i < 111; i++) {
            stack.push(i);
        }
        stack.pop();
        assertThat(stack.elementByIndex(0)).isEqualTo(0);
        assertThat(stack.elementByIndex(110)).isEqualTo(null);
    }
}