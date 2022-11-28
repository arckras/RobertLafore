//package io.metadevs.akrasilnikov.module_2_8_Stack_and_Queue;
//
//import org.openjdk.jmh.annotations.*;
//
//@State(Scope.Benchmark)
//public class StackAsymptoticComplexity {
//    @Param({"1001", "10001", "100001"})
//    int value;
//    Stack<Integer> stack;
//
//    @Setup(Level.Invocation)
//    public void prepare() {
//        stack = new Stack(value);
//        for (int i = 0; i < value - 1; i++) {
//            stack.push(i);
//        }
//    }
//
//    @Benchmark
//    public void stackAdd() {
//        stack.push(value);
//    }
//
//    @Benchmark
//    public void stackPop() {
//        stack.pop();
//    }
//
//    @Benchmark
//    public void stackPeek() {
//        stack.peek();
//    }
//}
