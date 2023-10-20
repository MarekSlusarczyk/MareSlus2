package Methods;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zadanie13 {
    public static void main(String[] args) throws IOException  {
        FileWriter fw = new FileWriter("zadanie13_metody.txt",true);
        PrintWriter pw = new PrintWriter(fw);
        for(int i = 1; i < 10000; i++) {
            if (isPrime(i)) {
                pw.println(i);
            }
        }
        System.out.println("Zapisano liczby pierwsze do pliku!");
        pw.close();
    }

    public static boolean isPrime(int number) {
        if (number == 2) {
            return false;
        }
        for(int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
