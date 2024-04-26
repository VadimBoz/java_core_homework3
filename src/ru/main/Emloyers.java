package ru.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Emloyers implements Iterable<Employer>{

    private final ArrayList<Employer> emloyers;


    public Emloyers() {
        emloyers = new ArrayList<>();
        emloyers.add(new Worker("Oleg", 100));
        emloyers.add(new Worker("Mikl", 150.0));
        emloyers.add(new Worker("Zoya", 150.0));
        emloyers.add(new Worker("Zevs", 150.01));
        emloyers.add(new Worker("Sofia", 90));
        emloyers.add(new Freelancer("Alex", 0.5));
        emloyers.add(new Freelancer("Igor", 0.4));
        emloyers.add(new Freelancer("Elena", 0.6));
    }


    public void sortEmloyers() {
        emloyers.sort(new EmployerComporator());
    }


    public void addEmployer(Employer employer) {
        emloyers.add(employer);
    }


    @Override
    public Iterator<Employer> iterator() {
        return emloyers.iterator();
    }
}
