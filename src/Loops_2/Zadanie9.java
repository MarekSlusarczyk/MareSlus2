package Loops_2;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj początkową liczbę organizmów");
        int poczatkowaIloscOrganizmow = klawiatura.nextInt();

        if(poczatkowaIloscOrganizmow < 2 ) {
            System.out.println("Początkowa popolacja nie może być mniejsza niż 2");
            return;
        }

        System.out.println("Podaj średni dzienny przyrost populacji (w procentach)");
        double sredniDziennyPrzyrost = klawiatura.nextDouble();

        if (sredniDziennyPrzyrost < 1) {
            System.out.println("Sredni dzienny przyrost populacji nie może być mniejszy niż 1");
            return;
        }

        System.out.println("Podaj liczbę dni w których organizmy się rozmnażają");
        int iloscDni = klawiatura.nextInt();

        double iloscOrganizmowTeraz = poczatkowaIloscOrganizmow;
        for (int i = 0; i < iloscDni; i++) {
            int dzien = i+1;
            if(i != 0) {
                double t = (iloscOrganizmowTeraz * sredniDziennyPrzyrost / 100);
                iloscOrganizmowTeraz += t;
            }

            System.out.printf("Wielkość populacji dnia " + dzien + ". to %.0f\n", iloscOrganizmowTeraz);

        }
    }
}
