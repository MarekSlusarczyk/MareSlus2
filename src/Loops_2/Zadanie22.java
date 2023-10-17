package Loops_2;

import java.util.Random;
import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {

        double kwotaWrzuconaDoAutomatu = 0;
        double lacznaWartoscWygranych = 0;

        Scanner klawiatura = new Scanner(System.in);
        int graDalej;
        do {
            Random losowanie = new Random();

            System.out.println("Podaj jaką kwotę chcesz wrzucić do automatu:");
            double kwota = klawiatura.nextDouble();
            kwotaWrzuconaDoAutomatu += kwota;

            String[] owoce = {"Wiśnie", "Pomarańcze", "Śliwki", "Melony", "Bary"};

            int[] wylosowaneOwoce = new int[3];
            for (int i = 0; i < wylosowaneOwoce.length; i++) {
                wylosowaneOwoce[i] = losowanie.nextInt(5);
            }

            for (int i = 0; i < wylosowaneOwoce.length; i++) {
                System.out.print(owoce[wylosowaneOwoce[i]] + " ");
            }

            System.out.println("\n");

            if (wylosowaneOwoce[0] == wylosowaneOwoce[1] && wylosowaneOwoce[0] == wylosowaneOwoce[2] && wylosowaneOwoce[1] == wylosowaneOwoce[2]) {
                lacznaWartoscWygranych += (kwota * 3);
                System.out.println("Wygrałeś 3-krotność stawki, czyli: " + (kwota * 3) + " zł");
            } else if (wylosowaneOwoce[0] != wylosowaneOwoce[1] && wylosowaneOwoce[0] != wylosowaneOwoce[2] && wylosowaneOwoce[1] != wylosowaneOwoce[2]) {
                System.out.println("Nic nie wygrałeś!");
            } else if (wylosowaneOwoce[0] == wylosowaneOwoce[1] || wylosowaneOwoce[0] == wylosowaneOwoce[2] || wylosowaneOwoce[1] == wylosowaneOwoce[2]) {
                lacznaWartoscWygranych += (kwota * 2);
                System.out.println("Wygrałeś 2-krotność stawki, czyli " + (kwota * 2) + " zł");
            }

            System.out.println("Czy chcesz dalej grać?\nTak - [0]\nNie - [1]");
            graDalej = klawiatura.nextInt();
        } while(graDalej == 0);

        System.out.println("Łącznie wrzuciłeś do automatu: " + kwotaWrzuconaDoAutomatu + " zł");
        System.out.println("Łącznie wygrałeś: " + lacznaWartoscWygranych + " zł");
    }
}
