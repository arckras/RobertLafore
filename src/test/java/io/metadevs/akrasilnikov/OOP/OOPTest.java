package io.metadevs.akrasilnikov.OOP;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OOPTest {
    private AbstractSpecialist alice = new Worker("Alice", 18);
    private AbstractSpecialist bob = new Worker("Bob", 25);
    private AbstractSpecialist ares = new Manager("Ares", 40);
    private AbstractSpecialist nika = new Worker("Nika", 60);

    private ArrayList<AbstractSpecialist> arrayListSpecialists = new ArrayList<>();
    Company companyBender = new Company("Bender", arrayListSpecialists);


//    @Test
//    public void shouldThrowSpecialistAlreadyExistsInCompanyExceptionWhenTryHireSpecialistToTheCompany() {
    //Company metadevs = new Company("Metadevs", 2);
//        Manager sasha = new Manager("Саша", 30);
//        metadevs.hire(sasha, 100);

//        assertThatExceptionOfType(SpecialistAlreadyExistsInCompanyException.class).isThrownBy(() -> metadevs.hire(sasha, 100));
//    }

    //    @Test
//    public void shouldThrowSalaryValidateExceptionWhenTryHireSpecialistToTheCompany() {
//        Company metadevs = new Company("Metadevs", 2);
//        Manager sasha = new Manager("Саша", 30);
//
//        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(() -> metadevs.hire(sasha, 10));
//    }
//


    //    @Test
//    public void shouldThrowSpecialistNotFoundExceptionWhenTryToFireSpecialistFromCompany() {
//        Company metadevs = new Company("Metadevs", 1);
//        Manager sasha = new Manager("Саша", 30);
//        Worker pasha = new Worker("Паша", 28);
//
//        companyBender.hire(alice, 100);
//
//        assertThatExceptionOfType(SpecialistNotFoundException.class).isThrownBy(() -> companyBender.fire(alice));
//    }

    @Test
    public void shouldFireSpecialistFromCompany() {
        System.out.println("\nТест shouldFireSpecialistFromCompany");
        hiringSpecialists();
        companyBender.fire(alice);
        companyBender.fire(nika);
        assertThatExceptionOfType(SpecialistNotFoundException.class).isThrownBy(() -> companyBender.specialistByName(alice.getName()));
    }

    @Test
    public void shouldHireSpecialistsToCompany() {
        System.out.println("\nТест shouldHireSpecialistsToCompany");
        hiringSpecialists();
        assertThat(companyBender.getSpecialists().size()).isEqualTo(3);
     //   assertThat(companyBender.specialistByName(String.valueOf(alice))).isEqualTo(alice.getName());

//        assertThat(companyBender.specialistByName(String.valueOf(bob))).isEqualTo(bob);
//        assertThat(companyBender.specialistByName(String.valueOf(ares))).isEqualTo(ares);
    }

    private void hiringSpecialists() {
        companyBender.hire(alice, 100);
        companyBender.hire(ares, 200);
        companyBender.hire(bob, 60);
    }
}
