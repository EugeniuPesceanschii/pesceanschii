package pescaOggetti;

public class Partita {

    private Giocatori[] giocatori;

    public Partita(Giocatori[] giocatori) {
        this.giocatori = giocatori;
    }

    public Giocatori[] getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(Giocatori[] giocatori) {
        this.giocatori = giocatori;
    }

    public void trovaEStampaFattoriSimili(int prodotto) {
        System.out.println("Fattori simili di " + prodotto + ":");

        for (int fattore1 = 1; fattore1 <= prodotto; fattore1++) {
            if (prodotto % fattore1 == 0) {
                int fattore2 = prodotto / fattore1;
                if (fattore1 <= fattore2) {
                    System.out.println(fattore1 + " e " + fattore2);
                }
            }
        }
    }

    @Override
    public String toString() {
        String t = "";
        for (int i = 0; i < giocatori.length; i++) {
            t += "Giocatore " + i + 1 + ": " + giocatori[i].toString() + "\n";
        }

        return t;
    }

}
