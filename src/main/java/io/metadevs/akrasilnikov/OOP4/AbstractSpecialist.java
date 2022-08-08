package io.metadevs.akrasilnikov.OOP4;

public abstract class AbstractSpecialist {
    private String name;
    private int age;
    private int salary;
    private String companyName;

    protected AbstractSpecialist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected AbstractSpecialist(String name, int age, String companyName, int salary) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.salary = salary;
    }

    protected AbstractSpecialist() {
    }

    //region getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //endregion
    protected boolean isAgeGreaterThanSalary(int salary) {
        return salary < this.age;
    }

    public void salaryValidate(int salary) throws SalaryValidateException {
        if (isAgeGreaterThanSalary(salary)) {
            throw new SalaryValidateException("Age is greater than salary!");
        }
    }

    public void printPersonalInfo() {
        System.out.print(this.name + ", age " + this.age + ", salary " + this.salary + ", company \"" + this.companyName + "\"");
    }
}
