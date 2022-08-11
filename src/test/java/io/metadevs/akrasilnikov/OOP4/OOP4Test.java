package io.metadevs.akrasilnikov.OOP4;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OOP4Test {
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

        companyBender.printSpecialists();


//        assertThat(companyBender.getEmployees().length).isEqualTo(3);
//        assertThat(companyBender.s
//        assertThat(companyBender.employeeByName(alice.getName())).isEqualTo(alice);
//        assertThat(companyBender.employeeByName(bob.getName())).isEqualTo(bob);
//        assertThat(companyBender.employeeByName(ares.getName())).isEqualTo(ares);
    }

//    @Test
//    public void shouldThrowEmployeeAlreadyExistsInCompanyExceptionWhenTryHireEmployeeToTheCompany() {
    //Company metadevs = new Company("Metadevs", 2);
//        Manager sasha = new Manager("Саша", 30);
//        metadevs.hire(sasha, 100);

//        assertThatExceptionOfType(SpecialistAlreadyExistsInCompanyException.class).isThrownBy(() -> metadevs.hire(sasha, 100));
//    }

    //    @Test
//    public void shouldThrowSalaryValidateExceptionWhenTryHireEmployeeToTheCompany() {
//        Company metadevs = new Company("Metadevs", 2);
//        Manager sasha = new Manager("Саша", 30);
//
//        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(() -> metadevs.hire(sasha, 10));
//    }
//
//    @Test
//    public void shouldFireEmployeeFromCompany() {
//        companyBender.fire(alice);
//        assertThatExceptionOfType(SpecialistNotFoundException.class).isThrownBy(() -> companyBender.specialistByName(alice));
//
//    }

//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenTryToFireEmployeeFromCompany() {
//        Company metadevs = new Company("Metadevs", 1);
//        Manager sasha = new Manager("Саша", 30);
//        Worker pasha = new Worker("Паша", 28);
//
//        companyBender.hire(alice, 100);
//
//        assertThatExceptionOfType(SpecialistNotFoundException.class).isThrownBy(() -> companyBender.fire(alice));
//    }
}
