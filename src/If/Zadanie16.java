package If;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Ile książek kupiłeś w tym miesiącu?");
        int iloscKsiazek = klawiatura.nextInt();

        if (iloscKsiazek == 0) {
            System.out.println("Otrzymujesz 0 punktów");
        } else if (iloscKsiazek == 1) {
            System.out.println("Otrzymujesz 5 punktów");
        } else if (iloscKsiazek == 2) {
            System.out.println("Otrzymujesz 15 punktów");
        } else if (iloscKsiazek == 3) {
            System.out.println("Otrzymujesz 30 punktów");
        } else if (iloscKsiazek >= 4) {
            System.out.println("Otrzymujesz 60 punktów");
        }
    }
}
