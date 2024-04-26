package ru.main;

public class Main {
    public static void main(String[] args) {

        Emloyers emloyers = new Emloyers();
        for (Employer employer: emloyers) {
            System.out.println(employer);
        }
        emloyers.sortEmloyers();
        System.out.println("_________________________________________________________________________");
        for (Employer employer: emloyers) {
            System.out.println(employer);
        }

    }
}