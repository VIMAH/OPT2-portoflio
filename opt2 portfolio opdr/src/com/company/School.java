package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class School extends Activity {

    private String Vakken;
    private String Lokaal;

    @Override
    public void AddActivity() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer de naam van u afspraak in:");
        String naam = scanner.nextLine();
        System.out.println("Voer de datum van de afspraak in:");
        Date dag = null;
        try {
            dag = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Voer de vakken in die u vandaag heeft: ");
        String vakken = scanner.nextLine();
        System.out.println("Voer de lokalen van de vakken in: ");
        String Lokaal = scanner.nextLine();
        System.out.println(Notitie());
        System.out.println("Voer de Starttijd van u afspraak in: ");
        String Starttijd = scanner.nextLine();
        String startTimeString = Starttijd;
        System.out.println("Voer de eindtijd van u afspraak in: ");
        String Eindtijd = scanner.nextLine();
        String endTimeString = Eindtijd;

        String[] startSplit = startTimeString.split(":");
        String[] endTime = endTimeString.split(":");

        int startSec = (Integer.parseInt(startSplit[0]) * 60 * 60) + (Integer.parseInt(startSplit[1]) * 60);
        int endSec = (Integer.parseInt(endTime[0]) * 60 * 60) + (Integer.parseInt(endTime[1]) * 60);

        int usedTime;

        if (startSec > endSec) {
            usedTime = startSec - endSec;
        } else {
            usedTime = endSec - startSec;
        }

        double s = SleepRhythm.DAG-(usedTime/3600D);

        int minutes = (int) (s%1*60);
        String parse = String.format("U heeft %d uur %d minuten beschikbare tijd",Math.round(s-s%1), minutes);
        System.out.println(parse);
        System.out.println("");
    }

    public static String Notitie () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voeg een notitie toe aan u afspraak:");
        String Notitie = scanner.nextLine();

        return "";
    }

    public String getVakken() {
        return Vakken;
    }

    public void setVakken(String vakken) {
        Vakken = vakken;
    }

    public String getLokaal() {
        return Lokaal;
    }

    public void setLokaal(String lokaal) {
        Lokaal = lokaal;
    }
}
