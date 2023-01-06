package morraCinese;

import java.util.Random;

public class MorraCinese {

    private String nome1;
    private String nome2;

    public MorraCinese(String nome1, String nome2) {
        this.nome1 = nome1;
        this.nome2 = nome2;
    }

    public void setNome1(String n) {
        nome1 = n;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome2(String n) {
        nome2 = n;
    }

    public String getNome2() {
        return nome2;
    }

    public String gioca(int giocata1, int giocata2) {
        Random r = new Random();
        int n = r.nextInt(3) + 1;
        //int m = r.nextInt(3) + 1;
        giocata1 = n;
        //giocata2 = m;
        String g = "";

        if (giocata1 == 1 && giocata2 == 1 || giocata1 == 2 && giocata2 == 2
                || giocata1 == 3 && giocata2 == 3) {
            g = "Pareggio, i giocatori hanno giocato la stessa mano";
        } else if (giocata1 == 1 && giocata2 == 2) {
            g = "Vince " + nome2 + ", ha giocato sasso contro forbici";
        } else if (giocata1 == 1 && giocata2 == 3) {
            g = "Vince " + nome1 + ", ha giocato forbici contro carta";
        } else if (giocata1 == 2 && giocata2 == 1) {
            g = "Vince " + nome1 + ", ha giocato sasso contro forbici";
        } else if (giocata1 == 2 && giocata2 == 3) {
            g = "Vince " + nome2 + ", ha giocato carta contro sasso";
        } else if (giocata1 == 3 && giocata2 == 1) {
            g = "Vince " + nome2 + ", ha giocato forbici contro carta";
        } else if (giocata1 == 3 && giocata2 == 2) {
            g = "Vince " + nome1 + ", ha giocato carta contro sasso";
        }

        return g;
    }

    public String stampa() {
        String s = "\nNome del primo giocatore: " + nome1 + "\nNome del secondo "
                + "giocatore: " + nome2;
        return s;
    }
}
