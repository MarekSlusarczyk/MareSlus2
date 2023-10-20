package Methods;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia");
        int number = klawiatura.nextInt();
        if (isPrime(number)) {
            System.out.println("Liczba jest pierwsza");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }
    }

    public static boolean isPrime(int number) {
        if (number == 2) {
            return false;
        }
        for(int i = 2; i < number; i++) {
            System.out.println(i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
