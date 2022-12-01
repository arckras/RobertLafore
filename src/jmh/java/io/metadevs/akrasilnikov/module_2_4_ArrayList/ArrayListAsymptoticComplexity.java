package io.metadevs.akrasilnikov.module_2_4_ArrayList;

import io.metadevs.akrasilnikov.OOP.*;
import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
public class ArrayListAsymptoticComplexity {
    AbstractSpecialist bob = new Worker("Bob", 21);
    AbstractSpecialist alice = new Worker("Alice", 25);
    ArrayList<AbstractSpecialist> arrayListPersons;

    @Param({"1001", "10001", "100001"})
    public int value;

    @Setup(Level.Invocation)
    public void prepare() {
        arrayListPersons = new ArrayList<AbstractSpecialist>(value);
        for (int i = 0; i < value - 1; i++) {
            arrayListPersons.add(bob);
        }
    }

    @Benchmark
    public void add() {
        arrayListPersons.add(alice);
    }

    @Benchmark
    public void addByIndex() {
        arrayListPersons.add(0, alice);
    }

    @Benchmark
    public void remove() {
        arrayListPersons.remove(0);
    }
}

