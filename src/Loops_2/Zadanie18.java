package Loops_2;

import java.util.Random;
import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int losowaLiczba;
        Random losowanie = new Random();
        losowaLiczba = losowanie.nextInt(500);
//        System.out.println(losowaLiczba);

        int odgadniecie = 0;
        int iloscProb = 0;

        while(odgadniecie != losowaLiczba) {
            System.out.println("Podaj liczbę");
            odgadniecie = klawiatura.nextInt();

            if(odgadniecie > losowaLiczba) {
                System.out.println("Podana liczba jest większa od wylosowanej! Spróbuj ponownie");
            } else if (odgadniecie < losowaLiczba) {
                System.out.println("Podana liczba jest mniejsza od wylosowanej! Spróbuj ponownie");
            }
            iloscProb++;
        }

        System.out.println("Odgadłeś liczbę");
        System.out.println("Ilość prób: " + iloscProb);
    }
}
