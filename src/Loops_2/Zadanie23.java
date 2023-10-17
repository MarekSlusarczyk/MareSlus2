package Loops_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) throws IOException {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoje imię i nazwisko");
        String imieNazwisko = klawiatura.nextLine();


        System.out.println("Opisz siebie");
        String opis = klawiatura.nextLine();

        FileWriter fw = new FileWriter("index.html",true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("<html>");

        pw.println("<head>");
        pw.println("</head>");

        pw.println("<body>");

        pw.println("<center>");
        pw.println("<h1>" + imieNazwisko + "</h1>");
        pw.println("</center>");

        pw.println("<hr />");
        pw.println(opis);
        pw.println("<hr />");

        pw.println("</body>");

        pw.println("</html>");

        pw.close();
    }
}
