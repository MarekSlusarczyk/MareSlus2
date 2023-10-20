package Methods;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        double mass = mass();
        double velocity = velocity();
        log(kineticEnergy(mass, velocity));
    }

    public static double mass() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj masę obiektu: ");
        double mass = klawiatura.nextDouble();
        return mass;
    }

    public static double velocity() {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj szybkość obiektu w metrach na sekundę: ");
        double velocity = klawiatura.nextDouble();
        return velocity;
    }

    public static double kineticEnergy(double mass, double velocity) {
        double kineticEnergy = 0.5 * mass * Math.pow(velocity, 2);
        return kineticEnergy;
    }

    public static void log(double kineticEnergy) {
        System.out.println("Energia kinetyczna wynosi: " + kineticEnergy);
    }
}
