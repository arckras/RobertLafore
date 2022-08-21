package io.metadevs.akrasilnikov.OOP;

import java.util.Comparator;

public abstract class AbstractSpecialist implements Comparable<AbstractSpecialist> {
    private String name;
    private int age;
    private int salary;
    private String companyName;

    //region constructors
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
    //endregion

    //region getters/setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    //endregion

    /**
     * Comparator для сортировки списка объектов по имени
     */
    public static Comparator<AbstractSpecialist> NameComparator = new Comparator<AbstractSpecialist>() {
        @Override
        public int compare(AbstractSpecialist a, AbstractSpecialist b) {
            return a.getName().compareTo(b.getName());
        }
    };

    /**
     * Comparator для сортировки объектов по возрасту
     */
    public static Comparator<AbstractSpecialist> AgeComparator = new Comparator<AbstractSpecialist>() {
        @Override
        public int compare(AbstractSpecialist a, AbstractSpecialist b) {
            int temp =a.getAge() - b.getAge();
            return (temp < 0) ? -1 : ((temp > 0) ? 1 : 0);
        }
    };

    /**
     * переопределение Comparable-метода compareTo
     */
    @Override
    public int compareTo(AbstractSpecialist o) {
        int temp = name.compareTo(o.getName());
        return (temp < 0) ? -1 : ((temp > 0) ? 1 : 0);
    }

    protected boolean isAgeGreaterThanSalary(int salary) {
        return salary < this.age;
    }

    public void salaryValidate(int salary) throws SalaryValidateException {
        if (isAgeGreaterThanSalary(salary)) {
            throw new SalaryValidateException("Возраст больше зарплаты");
        }
    }

    public void printPersonalInfo() {
        System.out.print(this.name + ", age " + this.age + ", salary " + this.salary + ", company \"" + this.companyName + "\"\n");
    }
}
