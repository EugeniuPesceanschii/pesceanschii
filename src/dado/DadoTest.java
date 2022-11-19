package dado;

import java.util.Random;

public class DadoTest {

    public static void main(String[] args) {
        Dado d = new Dado(6);

        Random r = new Random();
        int n = r.nextInt(5) + 1;
        System.out.println("Il numero uscito dopo il lancio del dado è: " + n);

        String s = d.stampa();
        System.out.println(s);
    }

}
