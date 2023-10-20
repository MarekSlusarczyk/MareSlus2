package Methods;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s\n", "Fahrenheity", "Celsjusze");
        for(int i = 0; i <= 20; i++) {
//            System.out.println(celsius(i));
            System.out.printf("%-10s %-10.1f\n", i, celsius(i));
        }
    }

    public static double celsius(int tempFahrenheit) {
        double tempCelsius = (tempFahrenheit - 32.0) * ((double)5/(double)9);
        return tempCelsius;
    }
}
