package setteMezzo;

import java.util.Random;

public class Gioco {

    private Giocatore[] giocatori;
    private Mazzo mazzo;
    private int nPartite;

    public Gioco(int nGiocatori, String[] nomi, int nCarte, int nPartite) {
        giocatori = new Giocatore[nGiocatori + 1];

        for (int i = 0; i < giocatori.length; i++) {
            giocatori[i] = new Giocatore(nomi[i], 0);
        }

        String[] desc = new String[]{"Bastoni", "Denari", "Coppe", "Spade"};
        this.mazzo = new Mazzo(desc, nCarte);
        this.nPartite = nPartite;
    }

    public String giraCarta(){
        return mazzo.giraCarta();
    }
    
    
    
}
