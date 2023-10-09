package Loops;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wpisz liczbę z przedziału 10-24");
        int liczba;
        do {
            liczba = klawiatura.nextInt();
            if (liczba < 10 || liczba > 24) {
                System.out.println("Nie podano poprawnej liczby, spróbuj ponownie");
            }
        } while (liczba < 10 || liczba > 24);
        System.out.println("Podano poprawną liczbę");
    }
}
