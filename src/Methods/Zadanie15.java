package Methods;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        double futureValue = futureValue();
        double annualInterestRate = annualInterestRate();
        int countOfYears = countOfYears();

        double presentValue = presentValue(futureValue, annualInterestRate, countOfYears);
        log(presentValue, countOfYears, futureValue);
    }

    public static double futureValue() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj kwotę którą chcesz uzyskać na koncie");
        double futureValue = klawiatura.nextDouble();
        return futureValue;
    }

    public static double annualInterestRate() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj roczną stopę oprocentowania");
        double annualInterestRate = klawiatura.nextDouble();
        return annualInterestRate;
    }

    public static int countOfYears() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj przez ile lat planujesz pozostawić pieniądze na koncie");
        int countOfYears = klawiatura.nextInt();
        return countOfYears;
    }

    public static double presentValue(double futureValue, double annualInterestRate, int countOfYears) {
        double presentValue = (futureValue / Math.pow((1 + annualInterestRate), countOfYears));
        return presentValue;
    }

    public static void log(double presentValue, int years, double futureValue) {
//        System.out.println("Obecnie musisz mieć na koncie " + presentValue + ", aby w ciągu " + years
//                + " lat mieć na koncie " + futureValue);

        System.out.printf("Obecnie musisz mieć na koncie %.2f zł", presentValue);
        System.out.print(", aby w ciągu " +years+ " lat mieć na koncie " + futureValue + " zł");
    }
}
