package io.metadevs.akrasilnikov.OOP4;

public class Manager extends AbstractSpecialist {
    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    //    @Override
//    public void salaryValidate(int salary) throws SalaryValidateException {
//        if (salary < getAge()) {
//            throw new SalaryValidateException("Age is greater than salary!");
//        }
//    }

    @Override
    public void printPersonalInfo() {
        System.out.print("Manager ");
        super.printPersonalInfo();
    }
}
