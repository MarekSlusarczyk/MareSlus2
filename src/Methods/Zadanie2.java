package Methods;

import java.util.Scanner;

public class Zadanie2 {
    static double calculateRetail(double cenaHurtowa, double marza) {
        double cenaProduktu = cenaHurtowa + (cenaHurtowa * marza);
        return cenaProduktu;
    }

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cenę hurtową produktu: ");
        double cena = klawiatura.nextDouble();

        System.out.println("Podaj wysokość marży (w %)");
        double marza = klawiatura.nextDouble();
        marza = marza / 100;
        System.out.println(calculateRetail(cena, marza));
    }
}
