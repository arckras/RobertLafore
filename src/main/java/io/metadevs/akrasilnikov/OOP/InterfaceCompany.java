package io.metadevs.akrasilnikov.OOP;

public interface InterfaceCompany {
    void hire(AbstractSpecialist worker, int salary);

    void fire(AbstractSpecialist worker);

    void specialistByName(String name);

    void printSpecialists();
}
