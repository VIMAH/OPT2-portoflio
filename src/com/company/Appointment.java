package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Appointment extends Activity {

    private String locatie;

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
        System.out.println("Voer de locatie van u afspraak in:");
        String locatie = scanner.nextLine();
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

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
}


