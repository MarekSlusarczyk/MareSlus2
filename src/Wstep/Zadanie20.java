package Wstep;

import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double szklankiCukru = 1.5;
        double szklankaMasla = 1.0;
        double szklankiMaki = 2.75;
        int iloscCiastek = 48;

        double iloscSzklanekCukruNaJednoCiastko = szklankiCukru / iloscCiastek;
        double iloscSzklanekMaslaNaJednoCiastko = szklankaMasla / iloscCiastek;
        double iloscSzklanekMakiNaJednoCiastko = szklankiMaki / iloscCiastek;

        System.out.print("Podaj ilość ciastek, które chcesz upiec ");
        double iloscCiastekDoUpieczenia = klawiatura.nextInt();

        double iloscPotrzebnychSzklanekCukru = iloscCiastekDoUpieczenia
                * iloscSzklanekCukruNaJednoCiastko;

        double iloscPotrzebnychSzklanekMasla = iloscCiastekDoUpieczenia
                * iloscSzklanekMaslaNaJednoCiastko;

        double iloscPotrzebnychSzklanekMaki = iloscCiastekDoUpieczenia
                * iloscSzklanekMakiNaJednoCiastko;

        System.out.println("--- Lista składników do upieczenia "
                + iloscCiastekDoUpieczenia + " ciastek ---");
        System.out.println("Ilość potrzebnych szklanek cukru: "
                + iloscPotrzebnychSzklanekCukru);

        System.out.println("Ilość potrzebnych szklanek masła: "
                + iloscPotrzebnychSzklanekMasla);

        System.out.println("Ilość potrzebnych szklanek mąki: "
                + iloscPotrzebnychSzklanekMaki);
    }
}
