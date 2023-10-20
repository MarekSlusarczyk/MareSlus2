package Methods;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int opcja = menu();
        double meters = 0.0;
        do {
            System.out.println("Podaj ilość metrów: ");
            meters = klawiatura.nextDouble();
            if (meters < 0) {
                System.out.println("ilość metrów musi być dodatnia!");
                meters = 0.0;
            }
        } while(meters <= 0);
        if (opcja == 1) {
            showKilometers(meters);
        } else if (opcja == 2) {
            showInches(meters);
        } else if (opcja == 3) {
            showFeet(meters);
        }
    }
    public static int menu() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("1. konwersja na kilometry\n2. konwersja na cale," +
                "\n3. konwersja na stopy, \n4. wyjście z programu.");
        int opcja = klawiatura.nextInt();
        if (opcja == 4) {
            System.exit(0);
        } else if (opcja != 1 || opcja != 2 || opcja != 3 || opcja != 4) {
            System.out.println("Nie wybrano poprawnej opcji");
            System.exit(0);
        }
        return opcja;
    }

    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.println(meters + " metrów to: " + kilometers + " km");
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(meters + " metrów to: " + inches + " inchów");
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.println(meters + " metrów to: " + feet + " feetów");
    }
}
