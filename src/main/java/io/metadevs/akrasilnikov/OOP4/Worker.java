package io.metadevs.akrasilnikov.OOP4;

public class Worker extends AbstractSpecialist {
    public Worker(String name, int age){
        super(name,age);
        }

    @Override
    public int compareTo(Object o) {
        return 0;
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
