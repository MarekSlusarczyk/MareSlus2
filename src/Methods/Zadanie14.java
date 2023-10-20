package Methods;

import java.util.Random;

public class Zadanie14 {
    public static void main(String[] args) {
        Random losowanie = new Random();
        int even = 0;
        int odd = 0;
        for(int i = 0; i < 100; i++) {
            int wylosowanaLiczba = losowanie.nextInt(1000);
            if (isEven(wylosowanaLiczba)) {
                even++;
            } else {
                odd++;
            };
        }

        log(even, odd);
    }

    public static boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void log(int even, int odd) {
        System.out.println("Liczb parzystych jest: " + even);
        System.out.println("Liczb nieparzystych jest: " + odd);
    }
}
