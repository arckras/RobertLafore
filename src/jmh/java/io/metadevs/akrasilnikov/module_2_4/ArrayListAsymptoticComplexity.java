package io.metadevs.akrasilnikov.module_2_4;

import io.metadevs.akrasilnikov.module_2_4.ArrayList.ArrayList;
import io.metadevs.akrasilnikov.module_2_4.OOP.Person;
import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
public class ArrayListAsymptoticComplexity {
    //static long j = 0;

    Person alice = new Person("Alice", 18, 50000);
    Person bob = new Person("Bob", 21, 60000);
    ArrayList<Person> arrayListPersons;

    @Param({"1001", "10001", "100001"})
    public int value;

    @Setup(Level.Trial)
    public void doSetup() {
        System.out.println("DO MY SETUP");
        arrayListPersons = new ArrayList<Person>(value);
        for (int i = 0; i < value - 1; i++) {
            arrayListPersons.add(bob);
        }
        //System.out.println(j++ + " size= " + arrayListPersons.size() + " " + arrayListPersons.toString());
    }

    @TearDown(Level.Trial)
    public void doTearDown() {
        System.out.println("DO MY TEARDOWN");
        //System.out.println(j++ + " size= " + arrayListPersons.size()+ " " + arrayListPersons.toString());
        //j = 0;
        arrayListPersons = null;
    }

    @Benchmark
    public void add() {
//        if (arrayListPersons.getLength() <= 100) {
//            System.out.println(j++ + " size= " + arrayListPersons.size() + " length= " + arrayListPersons.getLength());
//        }

        arrayListPersons.add(alice);
        arrayListPersons.setSize(arrayListPersons.getSize()-1);//костыль
    }

    @Benchmark
    public void addByIndex() {
        arrayListPersons.add(0, alice);
        arrayListPersons.setSize(arrayListPersons.getSize()-1);//костыль
    }

    @Benchmark
    public void addAndRemove() {
        arrayListPersons.remove(0);
    }
}
