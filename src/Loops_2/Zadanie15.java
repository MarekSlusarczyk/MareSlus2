package Loops_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) throws IOException {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku tylko do odczytu:");
        String doOdczytu = klawiatura.nextLine();
        File plikDoOdczytu = new File (doOdczytu);
        if(!plikDoOdczytu.exists()) {
            System.out.println("Podany plik nie istnieje!");
            return;
        }

        System.out.println("Podaj nazwę pliku do zapisu:");
        String doZapisu = klawiatura.nextLine();

        FileWriter plikZapis = new FileWriter(doZapisu,true);
        PrintWriter plikDoZapisu = new PrintWriter(plikZapis);

        Scanner fileScanner = new Scanner (plikDoOdczytu);

        while(fileScanner.hasNext()) {
            String linia = fileScanner.nextLine();
            plikDoZapisu.println(linia.toUpperCase());
        }
        fileScanner.close();
        plikDoZapisu.close();
    }
}
