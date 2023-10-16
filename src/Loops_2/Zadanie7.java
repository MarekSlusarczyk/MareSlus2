package Loops_2;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ilość pięter");
        int liczbaPieter = klawiatura.nextInt();

        if (liczbaPieter < 1) {
            System.out.println("Ilość pięter musi być większa od 0");
            return;
        }

        int i = 1;
        int liczbaPokojow = 0;
        int liczbaZajetychPokojow = 0;
        int liczbaPustychPokojow = 0;
        double poziomOblozeniaWHotelu;
        while(i <= liczbaPieter) {
            boolean allOk = false;
            System.out.println("Podaj ilość pokoi na " + i + ". piętrze");
            int liczbaPokojowNaPietrze = klawiatura.nextInt();

            System.out.println("Podaj ilość zajętych pokoi na " + i + ". piętrze");
            int liczbaZajetychPokojowNaPietrze = klawiatura.nextInt();

            if (liczbaPokojowNaPietrze < 10 || liczbaZajetychPokojowNaPietrze < 0) {
                System.out.println("Liczba pokojów i zajętych pokojów nie może być ujemna." +
                        " Podaj jeszcze raz");
                i--;
            } else {
                allOk = true;
            }

            if (allOk) {
                liczbaPokojow += liczbaPokojowNaPietrze;
                liczbaZajetychPokojow += liczbaZajetychPokojowNaPietrze;
            }
            System.out.println(liczbaPokojow + "  " + "" + liczbaZajetychPokojow + " ");
            i++;
        }

        liczbaPustychPokojow = liczbaPokojow - liczbaZajetychPokojow;
        poziomOblozeniaWHotelu = liczbaZajetychPokojow * 100 / liczbaPokojow;
        System.out.println("Poziom obłożenia w hotelu: " + poziomOblozeniaWHotelu + "%");
        System.out.println("Liczba pokojów " + liczbaPokojow);
        System.out.println("Liczba pokojów zajętych " + liczbaZajetychPokojow);
        System.out.println("Liczba pokojów pustych " + liczbaPustychPokojow);



//        System.out.println("Podaj ilość pokoi na piętrze");
//        int liczbaPokoiNaPietrze = klawiatura.nextInt();
//
//        if (liczbaPokoiNaPietrze < 1) {
//            System.out.println("Ilość pokoi na piętrze musi być większa od 0");
//            return;
//        }





    }
}
