package com.company;

import java.util.Scanner;

public class Menu {

    public  Menu() {
        Security security = new Security();
        Scanner scanner = new Scanner(System.in);
        Activity k = new Activity();
        Activity a = new Appointment();
        Activity t = new School();
        Security S = new Security();
        S.CreatePinCode();
        System.out.println("");
        boolean check = false;
        while (!check) {
            if (S.CheckPinCode()) {
                check = true;
                SleepRhythm.laatKeuzesZien();
                SleepRhythm.SlaapRitmeKeuze();
                System.out.println("");
                String Check1 = "";
                while (!Check1.equalsIgnoreCase("n")) {
                    k.AddActivity();
                    System.out.println("Voer n in om te stoppen met activiteiten toe te voegen");
                    Check1 = scanner.nextLine();
                }
                System.out.println("");
                String Check2 = "";
                while (!Check2.equalsIgnoreCase("n")) {
                    a.AddActivity();
                    System.out.println("Voer n in om te stoppen met afspraken toe te voegen");
                    Check2 = scanner.nextLine();
                }
                System.out.println("");
                String Check3 = "";
                while (!Check3.equalsIgnoreCase("n")) {
                    t.AddActivity();
                    System.out.println("Voer n in om te stoppen met  toe te voegen");
                    Check3 = scanner.nextLine();
                }
                System.out.println("");
                /*System.out.println("Voer j in om de agenda's tonen \nvoer n om door te gaan");
                String Check4 = scanner.nextLine();
                if(Check4.equalsIgnoreCase("j")) {
                    Agenda.laatKeuzesZien();
                    Agenda.AgendaTonenKeuze();
                }
                else if (Check4.equalsIgnoreCase("n")){
                    System.out.println("Fijne Dag");
        }
        }
        }
        }

                 */
            }
        }
    }
}