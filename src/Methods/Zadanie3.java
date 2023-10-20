package Methods;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

//        System.out.println("Ile pokojów chcesz pomalować?");
//        int iloscPokojow = klawiatura.nextInt();
        int iloscPokojow = ilePokojow();

        double powierzchniaLaczna = jakaPowierzchnia(iloscPokojow);

        double cenaFarbyZaLitr = cenaZaLitrFarby();

        double dziesiecM2 = 10;
        double farbaWLitrach = iloscFarby(powierzchniaLaczna, dziesiecM2);
        double godziny = iloscGodzin(powierzchniaLaczna, dziesiecM2);
        double kosztFarby = ileKosztujeFarba(farbaWLitrach, cenaFarbyZaLitr);
        double kosztRobociznyZaGodzine = 18.00;
        double kosztRobocizny = ileKosztujeRobocizna(kosztRobociznyZaGodzine, godziny);
        double kosztLaczny = obliczLacznyKoszt(kosztFarby, kosztRobocizny);


        System.out.println("Potrzeba: " + farbaWLitrach + " litrów farby");
        System.out.println("Ilość godzin pracy: " + godziny);
        System.out.println("koszt farby: " + kosztFarby);
        System.out.println("Koszt robocizny: " + kosztRobocizny);
        System.out.println("Łączny koszt: " + kosztLaczny);
    }

    public static int ilePokojow() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Ile pokojów chcesz pomalować?");
        int iloscPokojow = klawiatura.nextInt();
        return iloscPokojow;
    }

    public static double jakaPowierzchnia(int iloscPokojow) {
        Scanner klawiatura = new Scanner(System.in);
        double powierzchniaLaczna = 0;
        for(int i = 1; i <= iloscPokojow; i++) {
            System.out.println("Podaj powierzchnię " + i + ". pokoju w m2");
            powierzchniaLaczna += klawiatura.nextDouble();
        }
        return powierzchniaLaczna;
    }

    public static double cenaZaLitrFarby() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cenę farby za 1 litr");
        double cenaZaLitr = klawiatura.nextDouble();
        return cenaZaLitr;
    }

    public static double iloscFarby(double powierzchnia, double dziesiec) {
        double liczbaPotrzebnychLitrowFarby = (powierzchnia / dziesiec) * 1.5;
        return liczbaPotrzebnychLitrowFarby;
    }

    public static double iloscGodzin(double powierzchnia, double dziesiec) {
        double czasPracy = (powierzchnia / dziesiec) * 8;
        return czasPracy;
    }
    public static double ileKosztujeFarba(double ilosc, double cena) {
        return ilosc * cena;
    }

    public static double ileKosztujeRobocizna(double kosztRobociznyZaGodzine, double iloscGodzin) {
        return kosztRobociznyZaGodzine * iloscGodzin;
    }
    public static double obliczLacznyKoszt(double kosztFarby, double kosztRobocizny) {
        return kosztFarby + kosztRobocizny;
    }
}
