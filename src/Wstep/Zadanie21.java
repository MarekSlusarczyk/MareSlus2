package Wstep;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj kwotę, którą zdeponowałeś: ");
        double kwotaZdeponowana = klawiatura.nextDouble(); // (P)

        System.out.println("Podaj wysokość rocznej stopy oprocentowania");
        double stopaOprocentowania = klawiatura.nextDouble(); // (r)

        System.out.println("Ile razy w roku odestki są kapitalizowane?");
        double kapitalizacjaOdsetekWCiaguRoku = klawiatura.nextInt(); // (n)

        System.out.println("Podaj przez jaki czas środki będą znajdować się" +
                " na koncie (w latach)");
        double liczbaLat = klawiatura.nextDouble(); // (t)

        double wykladnik = kapitalizacjaOdsetekWCiaguRoku * liczbaLat;
        double wynikPotegowania = Math.pow((1 + stopaOprocentowania / kapitalizacjaOdsetekWCiaguRoku),
                wykladnik);
        double kwotaPoOkreslonejLiczbieLat = kwotaZdeponowana * wynikPotegowania;

        BigDecimal kwotaDoZaokraglenia = new BigDecimal(kwotaPoOkreslonejLiczbieLat).setScale(2, RoundingMode.HALF_UP);
        double kwotaPoZaokagleniu = kwotaDoZaokraglenia.doubleValue();

        System.out.println("Kwota jaka będzie na twoim koncie po " +
                liczbaLat + " latach to: " +
                kwotaPoZaokagleniu + " zł");
    }
}
