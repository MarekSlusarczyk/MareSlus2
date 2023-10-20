package Methods;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int[] wynikiTestow = new int[5];
        for(int i = 0; i < wynikiTestow.length; i++) {
            System.out.println("Podaj wynik z " + (i+1) + " testu");
            int wynik = klawiatura.nextInt();
            wynikiTestow[i] = wynik;
        }

        System.out.println("średnia ze wszystkich " +
                "testów: " + calcAverage(wynikiTestow));

        for(int i = 0; i < wynikiTestow.length; i++) {
            System.out.println("Ocena z " + (i+1) + " testu: " + determineGrade(wynikiTestow[i]));
        }
    }

    public static double calcAverage(int[] wynikiTestow) {
        int suma = 0;
        for(int i:wynikiTestow) {
            suma += i;
        }
        double average = suma / wynikiTestow.length;
        return average;
    }

    public static int determineGrade(int wynik) {
        int ocena = 1;
        if (wynik > 89) {
            ocena = 5;
        } else if (wynik > 79) {
            ocena = 4;
        } else if (wynik > 69) {
            ocena = 3;
        } else if (wynik > 59) {
            ocena = 2;
        } else {
            ocena = 1;
        }

        return ocena;
    }
}
