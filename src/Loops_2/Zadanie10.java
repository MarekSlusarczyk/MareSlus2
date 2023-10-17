package Loops_2;

import java.util.Scanner;

public class Zadanie10 {
    public static int[] addNumber(int n, int arr[], int x)
    {

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int n = 0;
        int array[] = {0};
        System.out.println("Wpisuj liczby, wpisanie -99 zakończy wpisywanie liczb");
        int i = 0;
        while(i != -99) {
            System.out.println("Podaj liczbę");
            int liczba = klawiatura.nextInt();

            if (liczba != -99) {
                array = addNumber(n, array, liczba);
                i++;
                n++;
            } else {
                i = -99;
            }
        }

        int min = array[0];
        int max = array[array.length-1];
        for(int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
            if (array[j] > max) {
                max = array[j];
            }
        }

        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);
    }
}
