package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Agenda {

    public static ArrayList<String> AgendaTonen = new ArrayList<>();
    public static ArrayList <String> AgendaLatenZien() {
        System.out.println("Kies wat u wilt zien: ");
        AgendaTonen.add("1) Activiteiten");
        AgendaTonen.add("2) Afspraken");
        AgendaTonen.add("3) School Activiteiten");
        AgendaTonen.add("4) Exit");
        return AgendaTonen;
    }

    public static void laatKeuzesZien() {
        if(AgendaTonen.isEmpty()) {
            AgendaLatenZien();
        }
        if(AgendaTonen.isEmpty()) {
            System.out.println("Er zijn geen keuzes");
        }
        for (int i = 0; i < AgendaTonen.size(); i++) {
            System.out.println(AgendaTonen.get(i));
        }
    }

    public static void AgendaTonenKeuze() {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("U Keuze: ");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("U heeft gekozen voor optie 1: Activiteiten");
                Activity a = new Activity();
                System.out.println("De naam van u activiteit: " + a.getNaam());
                System.out.println("De datum van u activiteit: " + a.getDatum());
                System.out.println("De startijd van u activiteit: " + a.getStarttijd());
                System.out.println("De eindtijd van u activiteit: " + a.getEindtijd());
                System.out.println("Notitie: " + a.getNotitie());
                System.out.println("");
            } else if (userChoice == 2) {
                System.out.println("U heeft gekozen voor optie 2: Afspraken");
                Activity b = new Appointment();
                System.out.println("De naam van u afspraak: " + b.getNaam());
                System.out.println("De datum van u afspraak: " + b.getDatum());
                System.out.println("De locatie van u afspraak: " + b.getLocatie());
                System.out.println("De startijd van u afspraak: " + b.getStarttijd());
                System.out.println("De eindtijd van u afspraak: " + b.getEindtijd());
                System.out.println("Notitie: " + b.getNotitie());
                System.out.println("");
            } else if (userChoice == 3) {
                System.out.println("U heeft gekozen voor optie 3: School Activiteiten");
                Activity c = new School();
                System.out.println("De naam van u afspraak: " + c.getNaam());
                System.out.println("De datum van u afspraak: " + c.getDatum());
                System.out.println("U heeft de volgende vakken vandaag: " + c.getVakken());
                System.out.println("U heeft in de volgende lokalen les vandaag: " + c.getLokaal());
                System.out.println("De startijd van u afspraak: " + c.getStarttijd());
                System.out.println("De eindtijd van u afspraak: " + c.getEindtijd());
                System.out.println("Notitie: " + c.getNotitie());
                System.out.println("");
            } else if (userChoice == 4) {
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("U heeft geen geldige keuze gemaakt");
        }
    }
}
