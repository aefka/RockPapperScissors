package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    Random random = new Random();
	    String tab[] = {"Rock", "Papper", "Scissors"};


        for( int i = 0; i < tab.length; i++) {
            int resultsU = 0;
            int resultsC = 0;
            System.out.println("Choose: Rock, Papper, Scissors");
            String c = tab[random.nextInt(tab.length)];
            String u = read.nextLine();
            if (u.equals(c)) {
                System.out.println("Computer choose: " + c);
                System.out.println("REMIS");
            } else if (u.equals("Rock") && c.equals("Papper") || u.equals("Scissors") && c.equals("Rock") || u.equals("Papper") && c.equals("Scissors")) {
                System.out.println("Computer choose: " + c);
                System.out.println("Compuer WIN!");
                resultsC++;
            } else if (c.equals("Rock") && u.equals("Papper") || c.equals("Scissors") && u.equals("Rock") || c.equals("Papper") && u.equals("Scissors")) {
                System.out.println("Computer choose: " + c);
                System.out.println("User WIN!");
                resultsU++;
            }
            System.out.println("Computer score: " + resultsU);
            System.out.println("User score : " + resultsC);
        }


    }
}
