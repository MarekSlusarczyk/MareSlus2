package Methods;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        double futureValue = futureValue();
        double annualInterestRate = annualInterestRate();
        int countOfyears = countOfYears();

        presentValue(futureValue, annualInterestRate, countOfyears);
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

    public static double countOfYears() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj przez ile lat planujesz pozostawić pieniądze na koncie");
        int countOfyears = klawiatura.nextInt();
        return countOfyears;
    }

    public static double presentValue(double futureValue, double annualInterestRate, int countOfyears) {
        double presentValue = (futureValue / Math.pow((1 + annualInterestRate), countOfyears));
        return presentValue;
    }
}
