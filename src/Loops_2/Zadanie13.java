package Loops_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) throws IOException {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku");

        String nazwaPliku = klawiatura.nextLine();
        File plik = new File (nazwaPliku);

        if (!plik.exists()) {
            System.out.println("Plik nie istnieje");
            return;
        }

        Scanner fileScanner = new Scanner (plik);


        Scanner czytelnikPlik = new Scanner(plik);
        int i = 0;
        while (czytelnikPlik.hasNext() && i < 5) {
            String linia =  czytelnikPlik.nextLine();
            System.out.println(linia);
            i++;
        }

        czytelnikPlik.close();
    }
}
