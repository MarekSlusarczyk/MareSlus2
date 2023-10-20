package Methods;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj ilość firm");
        int countOfCompanies = klawiatura.nextInt();
        double together = 0;
        for(int i = 0; i < countOfCompanies; i++) {
            System.out.println("Podaj akcje dla " + (i+1) + " firmy");
            int countOfActions = countOfActions();
            double purchasePrice = purchasePrice();
            double purchaseCommission = purchaseCommission();
            double sellPrice = sellPrice();
            double sellCommission = sellCommission();

            double profit = profit(countOfActions, purchasePrice, purchaseCommission, sellPrice, sellCommission);
            together += profit;
        }
        log(together);
    }

    public static int countOfActions() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj ilość akcji: ");
        int countOfActions = klawiatura.nextInt();
        return countOfActions;
    }

    public static double purchasePrice() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cenę zakupu akcji: ");
        double purchasePrice = klawiatura.nextDouble();
        return purchasePrice;
    }

    public static double purchaseCommission() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj kwotę prowizji przy zakupie akcji: ");
        double purchaseCommission = klawiatura.nextDouble();
        return purchaseCommission;
    }

    public static double sellPrice() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cenę sprzedaży akcji: ");
        double sellPrice = klawiatura.nextDouble();
        return sellPrice;
    }

    public static double sellCommission() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj kwotę prowizji przy sprzedaży akcji: ");
        double sellCommission = klawiatura.nextDouble();
        return sellCommission;
    }


    public static double profit(int countOfActions, double purchasePrice, double purchaseCommission, double sellPrice, double sellCommission) {
        double profit = (((double)countOfActions * sellPrice) - sellCommission) - (((double)countOfActions * purchasePrice) + purchaseCommission);
        return profit;
    }

    public static void log(double together) {
        if (together < 0) {
            System.out.println("Na sprzedaży akcji straciłeś. Strata wynosi: " + together + " zł");
        } else {
            System.out.println("Zysk ze sprzedaży akcji wyniósł: " + together + " zł");
        }
    }
}
