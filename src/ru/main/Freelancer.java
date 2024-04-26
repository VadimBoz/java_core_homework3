package ru.main;
public class Freelancer extends Employer {

    double hourlySalaryRate;

    Freelancer(String name, double hourlySalaryRate) {
        super(name);
        this.hourlySalaryRate = hourlySalaryRate;
    }

    @Override
    public double calcSalary() {
        return hourlySalaryRate * 20.8 * 8;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary= " + calcSalary() + "\n";
    }
}
