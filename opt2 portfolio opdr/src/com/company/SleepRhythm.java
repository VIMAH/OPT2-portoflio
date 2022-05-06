package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SleepRhythm {

    Scanner scanner = new Scanner(System.in);
    private static SleepRhythm sleepRhythm;
    private final static double GOED = 8.00;
    private final static double GEMIDDELD = 7.00;
    private final static double SLECHT = 6.00;
    public static double DAG = 24.00;
    private int uitkomst;


    public static SleepRhythm getSleepRhythm() {
        if (sleepRhythm == null){
            sleepRhythm = new SleepRhythm();
        }
        return sleepRhythm;
    }

    public static void setSleepRhythm(SleepRhythm sleepRhythm) {
        SleepRhythm.sleepRhythm = sleepRhythm;
    }

    public int getUitkomst() {
        return this.uitkomst;
    }

    public void setUitkomst(int uitkomst) {
        this.uitkomst = uitkomst;
    }

    public static ArrayList<String> Keuzes = new ArrayList<>();
    public static ArrayList <String> KeuzesSlaapritme() {
        System.out.println("Kies u slaapritme: ");
        Keuzes.add("1) GOED = 8.00 uur");
        Keuzes.add("2) GEMIDDELD = 7.00 uur");
        Keuzes.add("3) SLECHT = 6.00 uur");
        return Keuzes;
    }

    public static void laatKeuzesZien() {
        if(Keuzes.isEmpty()) {
            KeuzesSlaapritme();
        }
        if(Keuzes.isEmpty()) {
            System.out.println("Er zijn geen keuzes");
        }
        for (int i = 0; i < Keuzes.size(); i++) {
            System.out.println(Keuzes.get(i));
        }
    }

    public static void SlaapRitmeKeuze() {

        SleepRhythm s =  SleepRhythm.getSleepRhythm();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("U Keuze: ");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                s.setUitkomst((int) (DAG-=GOED));
                System.out.println("U heeft gekozen voor het slaapritme: GOED = 8.00 uur ");
                System.out.println("U Heeft " + s.uitkomst + " uur beschikbare tijd. \n");
            } else if (userChoice == 2) {
                s.setUitkomst((int) (DAG-=GEMIDDELD));
                System.out.println("U heeft gekozen voor het slaapritme: GEMIDDELD = 7.00 uur ");
                System.out.println("U Heeft " + s.uitkomst + " uur beschikbare tijd. \n");
            } else if (userChoice == 3) {
                s.setUitkomst((int) (DAG-=SLECHT));
                System.out.println("U heeft gekozen voor het slaapritme: SLECHT = 6.00 uur ");
                System.out.println("U Heeft " + s.uitkomst + " uur beschikbare tijd. \n");
            }
        } catch (Exception e) {
            System.out.println("U heeft geen geldige keuze gemaakt");
        }
    }
}