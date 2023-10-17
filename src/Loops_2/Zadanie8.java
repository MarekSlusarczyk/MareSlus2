package Loops_2;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ilość lat");
        int lata = klawiatura.nextInt();

        String[] miesiace = {"styczniu", "lutym", "marcu", "kwietniu", "maju", "czerwcu", "lipcu", "sierpniu", "wrzesniu",
        "październiku", "listopadzie", "grudniu"};
        int liczbaMiesiecy = 12;
        double lacznaIloscOpadow = 0;

        for(int i = 0; i < lata; i++) {
            int rok = i+1;
            System.out.println("Podaj ilosc opadów w miesiącach roku " + rok + ".");
            for(int j = 0; j < liczbaMiesiecy; j++) {
                System.out.println("Podaj ilość opadów w centymetrach w " + miesiace[j]);
                int iloscOpadowWMiesiacu = klawiatura.nextInt();
                if (iloscOpadowWMiesiacu < 0) {
                    System.out.println("Ilość opadów w danym miesiącu nie może być ujemna");
                    j--;
                } else {
                    lacznaIloscOpadow += iloscOpadowWMiesiacu;
                }

            }
        }

        int iloscMiesiecy = lata * liczbaMiesiecy;
        double srednia = lacznaIloscOpadow / iloscMiesiecy;

        System.out.println("Ilość miesięcy: " + iloscMiesiecy);
        System.out.println("Łączna ilość opadów: " + lacznaIloscOpadow);
        System.out.println("średnia ilość opadów " + srednia);
    }
}
