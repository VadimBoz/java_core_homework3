
package ru.main;

import java.util.Comparator;

public class EmployerComporator implements Comparator<Employer> {

    @Override
    public int compare(Employer o1, Employer o2) {
        if (o1 != null && o2!= null) {
            if (Math.abs(o1.calcSalary() - o2.calcSalary()) <= 0.001) {
                return o1.getName().compareTo(o2.getName());
            }
            else if ((o1.calcSalary() - o2.calcSalary()) > 0.001) return 1;
            else return -1;
        }
        return 0;
    }
}
