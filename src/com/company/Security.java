package com.company;

import java.util.Random;
import java.util.Scanner;

public class Security {

    Scanner scanner = new Scanner(System.in);

    private int random = new Random().nextInt(10_000);

    public void CreatePinCode(){
        String Pincode = String.format("%04d",random);
        System.out.println("U Verificatie code is: " +Pincode + "\nLet op! Deze code is 30 minuten geldig.");
    }

    public boolean CheckPinCode(){

        System.out.println("Voer u verificatie code in: ");
        int answer = scanner.nextInt();
        if (answer == getRandom()) {
            System.out.println("Verificatie voltooid");
            return true;
        } else {
            System.out.println("U verificatie is niet gelukt");
            return false;
        }
    }

    public static void WrongAnswer(){
        System.out.println("U verificatie is niet gelukt");
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }
}