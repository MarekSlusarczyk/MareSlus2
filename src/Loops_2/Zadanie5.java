package Loops_2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków");
        String znaki = klawiatura.nextLine();

        System.out.println("Podaj znak, który chcesz wyszukać");
        String znak = klawiatura.nextLine();
//        klawiatura.nextLine();

        int iloscPowtorzenZnaku = 0;
        for (int i = 0; i < znaki.length(); i++) {
            if (znaki.charAt(i) == znak.charAt(0)) {
                iloscPowtorzenZnaku++;
            }
        }
        if (iloscPowtorzenZnaku == 0) {
            System.out.println("Znak nie wystąpił w ciągu");
        } else if (iloscPowtorzenZnaku == 1) {
            System.out.println("Ten znak wystąpił tylko raz");
        } else if (iloscPowtorzenZnaku > 0) {
            System.out.println("Ten znak powtórzył się: " + iloscPowtorzenZnaku + " razy");
        }
    }
}
