package Loops_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) throws IOException {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytania: ");
        String nazwaPliku = klawiatura.nextLine();

        File plik = new File(nazwaPliku);

        if (!plik.exists()) {
            System.out.println("Plik nie istnieje");
            System.exit(0);
        }

        System.out.println("Podaj znak, który chcesz wyszukać");
        String znak = klawiatura.nextLine();

        Scanner czytelnikPlik = new Scanner(plik);
        int iloscPowtorzenZnaku = 0;
        while (czytelnikPlik.hasNext()) {
            String linia =  czytelnikPlik.nextLine();
            for (int i = 0; i < linia.length(); i++) {
                if (linia.charAt(i) == znak.charAt(0)) {
                    iloscPowtorzenZnaku++;
                }
            }
        }


        System.out.println("Znak " + znak.charAt(0) + " powtórzył się "
                + iloscPowtorzenZnaku + " razy");
        czytelnikPlik.close();
    }
}
