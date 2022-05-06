package com.company;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Activity {

    private String naam;
    private String tijdsduur;
    private Date datum;
    private String Starttijd;
    private String Eindtijd;
    private String Notitie;

    private String locatie;
    private String Vakken;
    private String Lokaal;

    public void AddActivity() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer de naam van u activiteit in:");
        String naam = scanner.nextLine();
        System.out.println("Voer de datum van de activiteit in (dd/MM/yyyy) :");
        Date datum = null;
        try {
            datum = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(Notitie());
        System.out.println("Voer de Starttijd van u activiteit in: ");
        String Starttijd = scanner.nextLine();
        String startTimeString = Starttijd;
        System.out.println("Voer de eindtijd van u activiteit in: ");
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

        double s = SleepRhythm.DAG - (usedTime / 3600D);

        int minutes = (int) (s % 1 * 60);
        String parse = String.format("U heeft %d uur %d minuten beschikbare tijd", Math.round(s - s % 1), minutes);
        System.out.println(parse);
        System.out.println("");
    }

    public static String Notitie () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voeg een notitie toe aan u activiteit:");
        String Notitie = scanner.nextLine();

        return "";
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTijdsduur() {
        return tijdsduur;
    }

    public void setTijdsduur(String tijdsduur) {
        this.tijdsduur = tijdsduur;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
    }

    public String getStarttijd() {
        return Starttijd;
    }

    public void setStarttijd( String starttijd) {
        Starttijd = starttijd;
    }

    public String getEindtijd() {
        return Eindtijd;
    }

    public void setEindtijd(String eindtijd) {
        Eindtijd = eindtijd;
    }

    public String getNotitie() {
        return Notitie;
    }

    public void setNotitie(String notitie) {
        Notitie = notitie;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
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
