package ru.main;
public abstract class Employer implements Comparable<Employer> {

    int id;
    String name;
    static int count = 0;

    Employer(String name) {
        this.name = name;
        count++;
        id = count;
    }
    abstract public double calcSalary();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee id= " + id + ", name= " + name;
    }

    public int compareTo(Employer o) {
        return this.name.compareTo(o.name);
    }

}
