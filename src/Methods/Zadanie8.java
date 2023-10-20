package Methods;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        double velocity = velocity();
        int time = time();

        System.out.println("Przjeechana odległość to: " + distance(velocity, time)
                + " kilometrów");
    }

    public static double velocity() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj prędkość pojazdu (w km/h): ");
        double velocity = klawiatura.nextDouble();
        return velocity;
    }

    public static int time() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj czas (w minutach): ");
        int time = klawiatura.nextInt();
        return time;
    }

    public static double distance(double velocity, int time) {
        double dist = velocity * (double)time / 60;
        return dist;
    }
}
