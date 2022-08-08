package io.metadevs.akrasilnikov.OOP4;

import java.util.ArrayList;

public class Company {
    private ArrayList<AbstractSpecialist> specialists;
    private String companyName;

    public Company(String companyName, ArrayList<AbstractSpecialist> specialists) {
        this.companyName = companyName;
        this.specialists = specialists;
    }

    public void hire(AbstractSpecialist specialist, int salary) {
        if (isSpecialistBelongsToCompany(specialist)) {
            throw new SpecialistAlreadyExistsInCompanyException("This person is already in staff!");
        }

//        specialist.salaryValidate(salary);
//        specialist.setSalary(salary);
//        specialist.setCompanyName(companyName);

        specialists.add(specialist);
        specialist.setSalary(salary);
        specialist.setCompanyName(companyName);
    }

    public void fire(AbstractSpecialist specialist) {
        if (!isExistsByName(specialist)) {
            throw new SpecialistNotFoundException("There is no such specialist in the company");
        }

//        AbstractSpecialist[] newArray = new AbstractSpecialist[specialists.length - 1];
//        int newspecialistsIndex = 0;
//
//        for (specialist value : specialists) {
//            if (!value.equals(specialist)) {
//                newArray[newspecialistsIndex] = (AbstractSpecialist) value;
//                newspecialistsIndex++;
//            }
//        }
//        specialists = newArray;
    }

    public void printSpecialists() {
        System.out.println();
        for (AbstractSpecialist specialist : specialists) {
            specialist.printPersonalInfo();
            System.out.println();
        }
        System.out.println();
    }

//    @Override
//    public AbstractSpecialist specialistByName(String name) {
//        for (AbstractSpecialist specialist : specialists) {
//            if (specialist.getName().equals(name)) {
//                return specialist;
//            }
//        }
//        throw new SpecialistNotFoundException("specialist this name is not found");
//    }

    private boolean isSpecialistBelongsToCompany(AbstractSpecialist specialist) {
        //   System.out.println(specialists.contains(specialist));
        return specialists.contains(specialist);
    }

    private boolean isExistsByName(AbstractSpecialist specialist) {
        try {
            System.out.println("есть ли такой специалист " + specialists.contains(specialist));
            specialists.contains(specialist);
            return true;
        } catch (SpecialistNotFoundException e) {
            return false;
        }
    }
}
