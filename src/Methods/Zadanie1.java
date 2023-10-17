package Methods;

import java.util.Scanner;

public class Zadanie1 {
    static void showChar(String cityName, int liczba) {
        System.out.println(cityName.charAt(liczba));
    }

    public static void main(String[] args) {
        showChar("Nowy Sącz", 2);
    }
}
