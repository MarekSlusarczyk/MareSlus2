package Methods;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {

        String[] tablica = {"Kamień", "Papier", "Nożyce"};

        int wyborKomputera = (int)(Math.random() * 3) + 1;
        int wyborUzytkownika = menu(tablica);

        wyswietlWyborKomputera(wyborKomputera, tablica);
        wybierzZwyciezce(wyborKomputera, wyborUzytkownika, tablica);
    }

    public static int menu(String[] tablica) {
        Scanner klawiatura = new Scanner(System.in);
        int wybor;
        System.out.println("Podaj co wybierasz");
        for(int i = 0; i < tablica.length; i++) {
            System.out.println((i+1) + ". " + tablica[i]);
        }
        wybor = klawiatura.nextInt();
        return wybor;
    }

    public static void wyswietlWyborKomputera(int wyborKomputera, String[] tablica) {
        System.out.println("Wybór komputera to: " + tablica[wyborKomputera-1]);
    }

    public static void wybierzZwyciezce(int wyborKomputera, int wyborUzytkownika, String[] tablica) {
//        if (wyborUzytkownika == 1 && wyborKomputera == 3) {
//            System.out.println("Wygrywasz! (kamień tępi nożyce)");
//        } else if (wyborUzytkownika == 3 && wyborKomputera == 2) {
//            System.out.println("Wygrywasz! (nożyce tną papier)");
//        } else if (wyborUzytkownika == 2 && wyborKomputera == 1) {
//            System.out.println("Wygrywasz! (papier ściera kamień)");
//        } else if (wyborKomputera == 1 && wyborUzytkownika == 3) {
//            System.out.println("Przegrywasz! (kamień tępi nożyce)");
//        } else if (wyborKomputera == 3 && wyborUzytkownika == 2) {
//            System.out.println("Przegrywasz! (nożyce tną papier)");
//        } else if (wyborKomputera == 2 && wyborUzytkownika == 1) {
//            System.out.println("Przegrywasz! (papier ściera kamień)");
//        } else {
//            System.out.println("Grę należy powtórzyć!");
//        }

        if (wyborKomputera == wyborUzytkownika) {
            System.out.println("Grę należy powtórzyć!");
        } else if ((tablica[wyborKomputera-1].equalsIgnoreCase("Nożyce") && wyborUzytkownika == 1)) {
            System.out.println("Wygrałeś wybierając " + tablica[wyborUzytkownika-1]);
        } else if ((wyborKomputera > wyborUzytkownika)) {
            System.out.println("Przegrałeś wybierając " + tablica[wyborUzytkownika-1] + ", wygrał komputer wybierając " + tablica[wyborKomputera-1]);
        } else {
            System.out.println("Wygrałeś wybierając " + tablica[wyborUzytkownika-1]);
        }
    }
}
