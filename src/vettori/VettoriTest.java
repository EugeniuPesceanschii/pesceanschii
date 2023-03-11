package vettori;

import java.util.Scanner;
import java.util.Random;

public class VettoriTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] a = new String[10];

        for (int i = 0; i < a.length; i++) {
           // a[i] = String.valueOf(i + 1) + " ";
            System.out.print("Inserisci il valore dell'elemento n. " + (i + 1) + ": ");
           a[i] = scanner.next();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

        System.out.println("");

        Vettori v = new Vettori(a);

        System.out.print(v.stampa());

        System.out.println("");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
