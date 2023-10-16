package Loops_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {

        PrintWriter plik = new PrintWriter("zadanie3.txt");

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj prędkość pociągu w km/h");
        int predkosc = klawiatura.nextInt();

        System.out.println("Podaj czas w godzinach");
        int czas = klawiatura.nextInt();

        if (predkosc <= 0 || czas < 1) {
            System.out.println("Niepoprawne dane");
            return;
        }

        int odleglosc = predkosc * czas;
        plik.println("Przejechana odległość wynosi: " + odleglosc);


        for(int i = 1; i <= czas; i++) {

            plik.println("Odległość przejechana po " + i + " godzinie: "
                    + predkosc * i);
        }

        plik.close();
    }
}
