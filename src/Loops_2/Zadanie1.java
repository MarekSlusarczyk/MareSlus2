package Loops_2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią, różną od 0");
        int liczba = klawiatura.nextInt();
        int i = 1;
        int suma = 0;
        while(i <= liczba) {
            suma += i;
            i++;
        };

        System.out.println("Suma to: " + suma);
    }
}
