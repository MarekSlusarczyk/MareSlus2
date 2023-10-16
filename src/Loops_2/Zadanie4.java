package Loops_2;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ilość przepracowanych dni");
        int iloscDni = klawiatura.nextInt();

        if (iloscDni <= 1) {
            System.out.println("Ilość przepracowanych dni musi być większa niż 1");
            return;
        }
        double wyplataWGroszachZaCalosc = 0;
        double wyplataZaDzienPoprzedni = 0;
        double wyplataZaDzien = 0.01;
        for(int i = 1; i <= iloscDni; i++) {
            wyplataZaDzienPoprzedni = wyplataZaDzien;
            if (i > 1) {
                wyplataZaDzien = 2 * wyplataZaDzienPoprzedni;
            }
            wyplataWGroszachZaCalosc += wyplataZaDzien;
            System.out.printf("%-10s %-10s\n", "Wypłata za dzień " + i + ". w złotych ", wyplataZaDzien);
        }

        System.out.printf("%-10s %-10s\n", "Wyplata za całość w złotych ", wyplataWGroszachZaCalosc);
    }
}
