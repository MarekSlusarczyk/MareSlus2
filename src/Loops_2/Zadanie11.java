package Loops_2;

public class Zadanie11 {
    public static void main(String[] args) {

        System.out.printf("%-10s %-10s\n", "Celsjusz", "Fahrenheit");
        for(int i = 0; i <= 20; i++) {
            double tempWClecjuszach = i;
            double tempWFahrenheitach = tempWClecjuszach * (9/5) + 32;
            System.out.printf("%-10s %-10s\n", tempWClecjuszach, tempWFahrenheitach);
        }

    }
}
