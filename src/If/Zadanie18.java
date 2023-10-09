package If;

import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        boolean wegetarianskie = false;
        boolean weganskie = false;
        boolean bezglutenowe = false;

        String tak = "tak";
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?");
        String wege = klawiatura.nextLine();

        System.out.println("Czy któraś z osób jest na diecie wegańskiej?");
        String wegan = klawiatura.nextLine();

        System.out.println("Czy któraś z osób jest na diecie wegańskiej?");
        String bezgluten = klawiatura.nextLine();

        if (wege.equalsIgnoreCase(tak)) {
            wegetarianskie = true;
        }

        if (wegan.equalsIgnoreCase(tak)) {
            weganskie = true;
        }

        if (bezgluten.equalsIgnoreCase(tak)) {
            bezglutenowe = true;
        }

        System.out.println("Możecie się wybrać do następujących restauracji:");

//        System.out.println("Pizzeria przy Dworcowej");
//        System.out.println("Kwiarnia na Rogu");
//        System.out.println("Włoskie Specjały");
//        System.out.println("Kuchnia u szefa");
//
//        if (!wegetarianskie && !weganskie && !bezglutenowe) {
//            System.out.println("Luksusowe Burgery u Jarka");
//        }
//        if (wegetarianskie && weganskie) {
//            System.out.println("Pizzeria przy Dworcowej");
//        }
//        if (wegetarianskie && weganskie && bezglutenowe) {
//            System.out.println("Kwiarnia na Rogu");
//        }

        Zadanie18 obj[] = new Zadanie18[5];
    }
}
