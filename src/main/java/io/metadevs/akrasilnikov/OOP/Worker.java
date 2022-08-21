package io.metadevs.akrasilnikov.OOP;

public class Worker extends AbstractSpecialist {
    public Worker(String name, int age){
        super(name,age);
        }

    @Override
    public void printPersonalInfo() {
        System.out.print("Worker ");
        super.printPersonalInfo();
    }

//    @Override
//    public void salaryValidate(int salary) throws SalaryValidateException {
//        if (salary < getAge()) {
//            throw new SalaryValidateException("Age is greater than salary!");
//        }
//    }
}
