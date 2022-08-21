package io.metadevs.akrasilnikov.module_2_5;

import io.metadevs.akrasilnikov.OOP.*;
import java.util.ArrayList;

public abstract class AbstractHiringSpecialists {
    private final AbstractSpecialist alice = new Worker("Alice", 18);
    private final AbstractSpecialist bob = new Worker("Bob", 25);
    private final AbstractSpecialist ares = new Manager("Ares", 25);
    private final AbstractSpecialist nika = new Worker("Nika", 25);

    private final ArrayList<AbstractSpecialist> abstractSpecialists = new ArrayList<>();
    Company companyBender = new Company("Bender", abstractSpecialists);

     public void hiringSpecialists() {
        companyBender.hire(bob, 60);
        companyBender.hire(alice, 100);
        companyBender.hire(ares, 200);
        companyBender.hire(nika, 50);
    }
}
