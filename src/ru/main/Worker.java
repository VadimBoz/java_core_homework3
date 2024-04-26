package ru.main;
public class Worker extends Employer {

    double salaryRate;

    Worker(String name, double salaryRate) {
        super(name);
        this.salaryRate = salaryRate;
    }


    @Override
    public double calcSalary() {
        return salaryRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary= " + calcSalary() + "\n";
    }
}
