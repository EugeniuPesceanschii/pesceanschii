package provaVett;

import java.util.Random;

public class ProvaVett {

    private int[] vett;
    private int dimL;

    public int[] getVett() {
        int[] vettore = new int[vett.length];
        for (int i = 0; i < vett.length; i++) {
            vettore[i] = vett[i];
        }
        return vett;
    }

    public void setVett(int[] vett) {
        this.vett = new int[vett.length];
        for (int i = 0; i < vett.length; i++) {
            this.vett[i] = vett[i];
        }
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    public ProvaVett(int[] vett) {
        setVett(vett);
    }

    public void caricamentoRandom(int min, int max) {
        Random r = new Random();
        for (int i = 0; i < vett.length; i++) {
            int numRandom = r.nextInt(max);
            while (numRandom < min) {
                numRandom = r.nextInt(max);
            }
            vett[i] = numRandom;
        }
    }

    public boolean scambioElementi(int posOrigine, int posDest) {
        boolean risultato = false;
        int scambio = 0;
        if (posOrigine >= 0 && posDest < vett.length) {
            scambio = vett[posDest];
            vett[posDest] = vett[posOrigine];
            vett[posOrigine] = scambio;
            risultato = true;
        }
        return risultato;
    }

    public boolean modificaElemento(int posizione, int valore) {
        boolean risultato = false;
        if (posizione >= 0 && posizione < vett.length) {
            vett[posizione] = valore;
            risultato = true;
        }
        return risultato;
    }

    public boolean cancellaElemento(int posizione) {
        boolean risultato = false;
        if (posizione >= 0 && posizione < vett.length) {
            int[] vettore = new int[vett.length - 1];

            for (int i = 0; i < vett.length; i++) {
                if (i < posizione) {
                    vettore[i] = vett[i];
                } else {
                    vettore[i] = vett[i + 1];
                }
            }
            vett = vettore;
            risultato = true;
        }
        return risultato;
    }

    public boolean cancellaElementoContrario(int posizione) {
        boolean risultato = false;
        if (posizione >= 0 && posizione < vett.length) {
            int[] vettore = new int[vett.length - 1];

            for (int i = 0; i < vett.length; i++) {
                if (i < posizione) {
                    vettore[i] = vett[i];
                } else {
                    if (i > posizione) {
                        vettore[i - 1] = vett[i];
                    }
                }
            }
            vett = vettore;
            risultato = true;
        }
        return risultato;
    }

    public int cercaElemento(int valore) {
        int c = 0;
        for (int i = 0; i < vett.length; i++) {
            if (vett[i] == valore) {
                c++;
            }
        }
        if (c == 0) {
            c = -1;
        }
        return c;
    }

    public int sommaElementi() {
        int somma = 0;
        for (int i = 0; i < vett.length; i++) {
            somma += vett[i];
        }
        return somma;
    }

    public int sommaElementiDaVettore(int[] elementi) {
        int somma = 0;
        for (int i = 0; i < elementi.length; i++) {
            somma += vett[elementi[i]];
        }
        return somma;
    }

    public boolean aggiungiElemento(int posizione, int valore) {
        boolean risultato = false;

        int[] vettore = new int[vett.length];
//posto per shift? metodo private che faccia lo shift
        if (posizione < 0 || posizione < vett.length) {
            for (int i = 0; i < vett.length; i++) {
                vettore[i] = vett[i];
                if (i == posizione) {
                    vettore[i] = valore;
                    risultato = true;
                }
            }
            vett = vettore;

        }
        return risultato;
    }

    public String stampa() {
        String testo = "";
        for (int i = 0; i < vett.length; i++) {
            testo += vett[i] + " ";
        }
        return testo;
    }
}
