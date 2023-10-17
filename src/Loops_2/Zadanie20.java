package Loops_2;

import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj długość boku kwadratu:");
        int bok = klawiatura.nextInt();

        String linia = "";
        for(int i = 0; i < bok; i++) {
            linia += "X";
        }
        for(int i = 0; i < bok; i++) {
            System.out.println(linia);
        }
    }
}
