package If;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        double cenaPakietu_A = 39.99;
        int iloscDarmowychMinut_A = 450;
        double cenaPoPrzekroczeniuLimitu_A = 0.45;
        String pakiet_A = "A";

        double cenaPakietu_B = 59.99;
        int iloscDarmowychMinut_B = 900;
        double cenaPoPrzekroczeniuLimitu_B = 0.4;
        String pakiet_B = "B";


        double cenaPakietu_C = 69.99;
        String pakiet_C = "C";

        System.out.println("Z jakiego pakietu korzystasz (A, B lub C)?: ");
        String pakiet = klawiatura.nextLine();

        System.out.println("Podaj liczbę minut, którą rozmawiałeś:");
        int liczbaMinut = klawiatura.nextInt();

        if (pakiet.equalsIgnoreCase(pakiet_A)) {
            if (liczbaMinut > iloscDarmowychMinut_A) {
                int roznicaMinut = liczbaMinut - iloscDarmowychMinut_A;
                double kwotaZaMinuty = roznicaMinut * cenaPoPrzekroczeniuLimitu_A;
                double kwotaDoZaplaty = kwotaZaMinuty + cenaPakietu_A;
                System.out.println("RACHUNEK ZA PAKIET A: \nKwota do zapłaty: "
                        + kwotaDoZaplaty + " zł");
            } else {
                System.out.println("RACHUNEK ZA PAKIET A: \nKwota do zapłaty: "
                        + cenaPakietu_A + " zł");
            }
        } else if (pakiet.equalsIgnoreCase(pakiet_B)) {
            if (liczbaMinut > iloscDarmowychMinut_B) {
                int roznicaMinut = liczbaMinut - iloscDarmowychMinut_B;
                double kwotaZaMinuty = roznicaMinut * cenaPoPrzekroczeniuLimitu_B;
                double kwotaDoZaplaty = kwotaZaMinuty + cenaPakietu_B;
                System.out.println("RACHUNEK ZA PAKIET B: \nKwota do zapłaty: "
                        + kwotaDoZaplaty + " zł");
            } else {
                System.out.println("RACHUNEK ZA PAKIET B: \nKwota do zapłaty: "
                        + cenaPakietu_B + " zł");
            }
        } else if (pakiet.equalsIgnoreCase(pakiet_C)) {
//            System.out.println("C");
            System.out.println("RACHUNEK ZA PAKIET C: \nKwota do zapłaty: " + cenaPakietu_C + " zł");
        } else {
            System.out.println("Podano błędy pakiet");
        }
    }


}
