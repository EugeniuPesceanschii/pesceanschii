package pescaOggetti;

import java.util.Scanner;
import java.util.Random;

public class PescaOggettiMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nel gioco del pesca oggetti!"
                + "\nPer iniziare, dovrai scegliere il numero di celle per il "
                + "tabellone. Questo dovrà essere positivo e pari");
        System.out.println("Scegli il numero di celle per il tabellone: ");
        int n = scanner.nextInt();
        int num = n * 14/100;
        
        Forbici[] forbici = new Forbici[n * 14 / 100];
        GommaRossa gommaRossa = new GommaRossa();
        Gomme[] gomme = new Gomme[n * 14 / 100];
        Matite[] matite = new Matite[n * 14 / 100];
        Penne[] penne = new Penne[n * 14 / 100];
        Stilografica stilografica = new Stilografica();

        Oggetti[] oggetti = new Oggetti[num * 4];
        for (int i = 0; i < num; i++) {
            forbici[i] = new Forbici("arrotondata");
            oggetti[i] = forbici[i];

        }
        for (int i = num, j = 0; i < num * 2; i++, j++) {
            gomme[j] = new Gomme("Dura", 2);
            oggetti[i] = gomme[j];

        }
        for (int i = num * 2, j = 0; i < num * 3; i++, j++) {
            matite[j] = new Matite("B");
            oggetti[i] = matite[j];

        }
        for (int i = num * 3, j = 0; i < num * 4; i++, j++) {
            penne[j] = new Penne("Bic", 4);
            oggetti[i] = penne[j];

        }

        for (int i = 0; i < num * 4; i++) {
            System.out.println(oggetti[i].toString());
        }
        /*
        
      
        int fat1 = 0;
        if (n > 0 && (n % 2) == 0) {

            int fattore2 = 0;
            for (int fattore1 = 1; fattore1 <= n; fattore1++) {
                if (n % fattore1 == 0) {
                    fattore2 = n / fattore1;
                    if (fattore1 <= fattore2) {
                        System.out.println(fattore1 + " e " + fattore2);
                    }
                }
                fat1 = fattore1;

            }
            Celle[] c1 = new Celle[fat1 + fattore2];

            Celle[][] c = new Celle[fat1][fattore2];
            for (int i = 0; i < fat1; i++) {
                for (int j = 0; j < fattore2; j++) {
                    c[i][j] =;
                }
            }
            Tabellone tabellone = new Tabellone(c);
            Giocatori[] g = new Giocatori[1];
            Partita p = new Partita(g, tabellone);

        }*/

    }
}
