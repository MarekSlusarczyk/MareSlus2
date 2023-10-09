package Wstep;

import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj długość rzędu w metrach");
        double dlugoscRzedu = klawiatura.nextDouble(); // (r)

        System.out.println("Podaj ilość miejsca zajmowanego przez + " +
                "okratowanie w metrach");
        double okratowanie = klawiatura.nextDouble(); // (e)

        System.out.println("Podaj odległość między sadzonkami w metrach");
        double odlegloscMiedzySadzonkami = klawiatura.nextDouble(); // (s)

        double liczbaSadzonek = (dlugoscRzedu - 2 * okratowanie)
                / odlegloscMiedzySadzonkami;

        System.out.println("Liczba sadzonek które można umieścić w rzędzie to: "
                + liczbaSadzonek);

    }
}
