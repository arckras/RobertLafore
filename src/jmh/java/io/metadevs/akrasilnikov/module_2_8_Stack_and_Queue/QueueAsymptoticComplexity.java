package io.metadevs.akrasilnikov.module_2_8_Stack_and_Queue;

import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
public class QueueAsymptoticComplexity {
    @Param({"1001", "10001", "100001"})
    int value;
    Queue<Integer> queue;

    @Setup(Level.Invocation)
    public void prepare() {
        queue = new Queue(value);
        for (int i = 0; i < value - 1; i++) {
            queue.add(i);
        }
    }

    @Benchmark
    public void queueAdd() {
        queue.add(value);
    }

    @Benchmark
    public void queueRemove() {
        queue.remove();
    }

    @Benchmark
    public void queuePeek() {
        queue.peek();
    }
}
