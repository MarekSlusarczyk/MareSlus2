package Wstep;

import java.math.BigDecimal;

public class Zadanie22 {
    public static void main(String[] args) {

        int iloscZakupionychAkcji = 1000;
        double cenaZakupuAkcji = 32.87;
        double prowizja = 0.02;

        int liczbaSprzedanychAkcji = 1000;
        double cenaSprzedazyAkcji = 33.92;

        double kwotaZaZakupAkcji = cenaZakupuAkcji * iloscZakupionychAkcji;
        double wartoscProwizjiPrzyZakupie = kwotaZaZakupAkcji * prowizja;
        double kwotaZakupu = kwotaZaZakupAkcji + wartoscProwizjiPrzyZakupie;

        double kwotaPrzySprzezady = cenaSprzedazyAkcji * liczbaSprzedanychAkcji;
        double wartoscProwizjiPrzySprzedazy = kwotaPrzySprzezady * prowizja;

        double kwotaSprzedazy = kwotaPrzySprzezady - wartoscProwizjiPrzySprzedazy;

        double zyskNaCzysto =  kwotaSprzedazy - kwotaZakupu;

        System.out.println("kwota za akcje: " + kwotaZaZakupAkcji);
        System.out.println("prowizja za akcje: " + wartoscProwizjiPrzyZakupie);

        System.out.println("kwota za sprzedaz akcji: " + kwotaPrzySprzezady);
        System.out.println("prowizja za sprzedaz akcji: " + wartoscProwizjiPrzySprzedazy);


        System.out.println("Zysk na transakcji: " +  zyskNaCzysto);


    }
}
