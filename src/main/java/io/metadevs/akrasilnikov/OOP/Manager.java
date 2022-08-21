package io.metadevs.akrasilnikov.OOP;

public class Manager extends AbstractSpecialist {
    public Manager(String name, int age) {
        super(name, age);
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
