package Methods;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Swobodne spadanie obiektu: ");
        for(int i = 1; i <= 10; i++) {
            System.out.println("Odległość przebyta po " + i + " sekundach: " + fallingDistance(i));
        }

    }

    public static double fallingDistance(int time) {
        double gravitationalConstant = 9.8;
        double distance = 0.5 * (gravitationalConstant * Math.pow(time,2));
        return distance;
    }
}
