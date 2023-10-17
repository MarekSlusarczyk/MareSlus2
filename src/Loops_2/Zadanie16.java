package Loops_2;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj miesięczny budżet");
        double miesiecznyBudzet = klawiatura.nextDouble();

        double sumaWydatkow = 0;
        double wydatek;

        do {
            System.out.println("Podaj kwotę wydatku: (Wpisz 0 aby zakończyć)");
            wydatek = klawiatura.nextDouble();
            sumaWydatkow += wydatek;
        } while (wydatek != 0);
        double roznica = miesiecznyBudzet - sumaWydatkow;

        System.out.println("Różnica między wydaną kwotą a budżetem: " + roznica);
    }
}
