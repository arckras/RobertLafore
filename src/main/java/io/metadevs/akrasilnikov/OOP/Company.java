package io.metadevs.akrasilnikov.OOP;

import java.util.ArrayList;

public class Company {
    private ArrayList<AbstractSpecialist> specialists;
    private String companyName;

    public Company(String companyName, ArrayList<AbstractSpecialist> specialists) {
        this.companyName = companyName;
        this.specialists = specialists;
    }

    //region getters/setters
    public ArrayList<AbstractSpecialist> getSpecialists() {
        return specialists;
    }
    //endregion

    public void hire(AbstractSpecialist specialist, int salary) {
        if (isSpecialistBelongsToCompany(specialist)) {
            throw new SpecialistAlreadyExistsInCompanyException("Этот специалист уже работает");
        }

       // specialist.salaryValidate(salary);

        specialists.add(specialist);
        specialist.setSalary(salary);
        specialist.setCompanyName(companyName);
    }

    public void fire(AbstractSpecialist specialist) {
        if (!isExistsByName(specialist)) {
            throw new SpecialistNotFoundException(specialist.getName() + " не работает в компании");
        }
        specialists.remove(specialist);
    }

    public AbstractSpecialist specialistByName(String name) {
        for (AbstractSpecialist specialist : specialists) {
            if (specialist.getName().equals(name)) {
                return specialist;
            }
        }
        throw new SpecialistNotFoundException("Специалист не найден");
    }

    private boolean isSpecialistBelongsToCompany(AbstractSpecialist specialist) {
        return specialists.contains(specialist);
    }

    private boolean isExistsByName(AbstractSpecialist specialist) {
        try {
            System.out.println("Есть ли " + specialist.getName() + " в компании? - " + specialists.contains(specialist));
            specialists.contains(specialist);
            return true;
        } catch (SpecialistNotFoundException e) {
            return false;
        }
    }

    public void printSpecialists() {
        System.out.println();
        for (AbstractSpecialist specialist : specialists) {
            specialist.printPersonalInfo();
        }
        System.out.println();
    }
}
