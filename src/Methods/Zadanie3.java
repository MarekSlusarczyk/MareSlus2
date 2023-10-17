package Methods;

import java.util.Scanner;

public class Zadanie3 {
//    static int malarz(int iloscLitrowfarby, int iloscGodzinPracy, double kossztFarby, double kosztRobocizny, doub) {
//
//    }
    static double iloscFarby(double powierzchnia, double dziesiec) {
        double liczbaPotrzebnychLitrowFarby = (powierzchnia / dziesiec) * 1.5;
        return liczbaPotrzebnychLitrowFarby;
    }

    static double iloscGodzin(double powierzchnia, double dziesiec) {
        double czasPracy = (powierzchnia * dziesiec) * 8;
        return czasPracy;
    }
//
//    static double kosztFarby(double kosztFarba) {
//
//    }
//
//    static double kosztRobocizny(double kosztRobocizna) {
//
//    }
//
//    static double lacznyKoszt(double kosztLaczny) {
//
//    }

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Ile pokojów chcesz pomalować?");
        int iloscPokojow = klawiatura.nextInt();

        double powierzchnia = 0;
        for(int i = 1; i <= iloscPokojow; i++) {
            System.out.println("Podaj powierzchnię " + i + ". pokoju w m2");
            powierzchnia += klawiatura.nextDouble();
        }

        double zaKazde10m = 10;
        double farbaWLitrach = iloscFarby(powierzchnia, zaKazde10m);
        double godziny = iloscGodzin(powierzchnia, zaKazde10m);
        System.out.println("Potrzeba: " + farbaWLitrach + " litrów farby");
        System.out.println("Ilość godzin pracy: " + godziny);
    }
}
