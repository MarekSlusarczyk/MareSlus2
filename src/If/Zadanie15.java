package If;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double oplataZaKonto = 10.0;
        double kosztCzekow = 0.0;
        System.out.println("Podaj ilość czeków");
        int iloscCzekow = klawiatura.nextInt();

        if (iloscCzekow < 20) {
            kosztCzekow = iloscCzekow * 0.1;
        } else if (iloscCzekow >= 20 && iloscCzekow <= 39) {
            kosztCzekow = iloscCzekow * 0.08;
        } else if (iloscCzekow >= 40 && iloscCzekow <= 59) {
            kosztCzekow = iloscCzekow * 0.06;
        } else if (iloscCzekow >= 60) {
            kosztCzekow = iloscCzekow * 0.04;
        }


        double lacznyKoszt = oplataZaKonto + kosztCzekow;
        System.out.println("Opłata za czeki: " + kosztCzekow + " zł");
        System.out.println("Opłata za prowadzenie konta: " + oplataZaKonto + " zł");
        System.out.println("Łączna kwota opłat: " + lacznyKoszt + " zł");
    }
}
