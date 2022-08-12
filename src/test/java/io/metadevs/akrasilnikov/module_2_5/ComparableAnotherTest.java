package io.metadevs.akrasilnikov.module_2_5;

import io.metadevs.akrasilnikov.OOP4.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparableAnotherTest {
    private AbstractSpecialist alice = new Worker("Alice", 18);
    private AbstractSpecialist bob = new Worker("Bob", 25);
    private AbstractSpecialist ares = new Manager("Ares", 40);
    private AbstractSpecialist nika = new Worker("Nika", 60);

    private ArrayList<AbstractSpecialist> arrayListSpecialists = new ArrayList<>();
    Company companyBender = new Company("Bender", arrayListSpecialists);

    @Test
    public void shouldHireEmployeesToCompany() {
        companyBender.hire(alice, 100);
        companyBender.hire(ares, 200);
        companyBender.hire(bob, 60);
        companyBender.hire(nika, 50);

        for (int i = 0; i < arrayListSpecialists.size(); i++) {
            //arrayListSpecialists.get(i).printPersonalInfo();
            //System.out.println(arrayListSpecialists.get(i).compareTo(alice));
            System.out.println(companyBender.getSpecialists().get(i).getName() + ":" + companyBender.getSpecialists().get(0).getName() + " " + companyBender.getSpecialists().get(i).getName().compareTo(companyBender.getSpecialists().get(0).getName()));
        }

        companyBender.getSpecialists().;
    }
}
