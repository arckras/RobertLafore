package io.metadevs.akrasilnikov.OOP4;

public interface InterfaceCompany {
    void hire(AbstractSpecialist worker, int salary);

    void fire(AbstractSpecialist worker);

    void printSpecialists();
}
