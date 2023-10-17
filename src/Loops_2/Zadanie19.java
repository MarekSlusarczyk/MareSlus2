package Loops_2;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String[] kolory = {"czerwony", "zielony", "niebieski", "pomarańczowy", "żółty"};

        int wylosowanyKolor;
        Random losowanie = new Random();

        int punkty = 0;
        for(int i = 0; i < 10; i++) {
            wylosowanyKolor = losowanie.nextInt(5);
            System.out.println("Podaj kolor:");
            String kolorUzytkownika = klawiatura.nextLine();
            if (kolory[wylosowanyKolor].equalsIgnoreCase(kolorUzytkownika)) {
                System.out.println("Podano kolor poprawnie!");
                punkty++;
            } else {
                System.out.println("Podano niepoprawny kolor! Wylosowany kolor to: " + kolory[wylosowanyKolor]);
            }
        }

        System.out.println("Poprawnie wskazałeś kolor " + punkty + " razy");
    }
}
