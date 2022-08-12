package io.metadevs.akrasilnikov.module_2_5;

import io.metadevs.akrasilnikov.OOP4.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ComparableTest {
    private AbstractSpecialist alice = new Manager("Alice", 18);
    private AbstractSpecialist bob = new Worker("Bob", 25);
    private AbstractSpecialist nika = new Worker("Nika", 60);

    @Test
    void comparisonUsingComparable() {
        assertThat(bob.compareTo(alice)).isEqualTo(1);
        assertThat(bob.compareTo(bob)).isEqualTo(0);
        assertThat(bob.compareTo(nika)).isEqualTo(-12);

        System.out.println(bob.compareTo(alice));
        System.out.println(bob.compareTo(bob));
        System.out.println(bob.compareTo(nika));


    }
}
