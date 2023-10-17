package Loops_2;

import java.util.Random;

public class Zadanie21 {
    public static void main(String[] args) {

        int[] komputer = new int [9];
        int[] uzytkownik = new int [9];
        for(int i = 0; i < 9; i++) {
            komputer[i] = (int)(Math.random() * 6) + 1;
            uzytkownik[i] = (int)(Math.random() * 6) + 1;
        }


        int sumaOczekKomputer = 0;
        int sumaOczekUzytkownik = 0;
        for(int i = 0; i < komputer.length; i++) {
            sumaOczekKomputer += komputer[i];
            sumaOczekUzytkownik += uzytkownik[i];
        }

        if (sumaOczekUzytkownik > sumaOczekKomputer) {
            System.out.println("Wygrał użytkownik");
        } else {
            System.out.println("Wygrał komputer");
        }
    }
}
