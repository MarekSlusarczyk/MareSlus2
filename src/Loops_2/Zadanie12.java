package Loops_2;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int[] wartoscSprzedazy = new int[5];
//        wartoscSprzedazy[0] = 0;
//        wartoscSprzedazy[1] = 0;
//        wartoscSprzedazy[2] = 0;
//        wartoscSprzedazy[3] = 0;
//        wartoscSprzedazy[4] = 0;
        for(int i = 0; i < wartoscSprzedazy.length; i++) {
            System.out.println("Podaj wartość sprzedaży z " + (i+1) + " skelpu");
            wartoscSprzedazy[i] = klawiatura.nextInt();
        }
//
        int wartoscGwiazdki = 100;
        for(int i = 0; i < wartoscSprzedazy.length ; i++) {
            int ileGwiazdek = wartoscSprzedazy[i] / wartoscGwiazdki;
            System.out.print("Sklep nr: " + (i+1) + " ");
            for(int j = 0; j < ileGwiazdek; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
