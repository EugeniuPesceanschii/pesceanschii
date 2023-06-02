package mazzo;

import java.util.Random;

public class Mazzo {

    private Carte[] mazzoCarte;
    private int dimL;

    public Mazzo(int seme, int numero) {
        this.mazzoCarte = new Carte[52];
        Random r = new Random();

        for (int i = 0; i < mazzoCarte.length; i++) {
            this.mazzoCarte[i] = new Carte(seme, numero);
            seme = r.nextInt(4) + 1;
            numero = r.nextInt(12) + 1;
            
            if (mazzoCarte[i].getSeme() == seme && mazzoCarte[i].getNumero() == numero) {
                seme = r.nextInt(4);
                numero = r.nextInt(13);
            }

        }
        dimL = mazzoCarte.length;
    }

    public int cartePresenti() {
        return dimL;
    }

    public String giraCarta() {
        return mazzoCarte[0].getSeme() + " " + mazzoCarte[0].getNumero();
    }

    public boolean eliminaCarta() {
        boolean ris = false;

        mazzoCarte[0] = null;
        shift(0);
        dimL--;
        ris = true;

        return ris;
    }

    public boolean estraiCarta(int pos) {
        boolean ris = false;

        mazzoCarte[pos] = null;
        shift(pos);
        dimL--;
        ris = true;

        return ris;
    }

    public String stampaMazzo() {
        String t = "\n";
        for (int i = 0; i < mazzoCarte.length; i++) {
            t += mazzoCarte[i].getSeme() + " " + mazzoCarte[i].getNumero() + "\n";
        }
        t += "\n";
        return t;
    }

    public int cercaCarta(int numCarta) {
        int i = 0;
        
        while(mazzoCarte[i].getNumero() != numCarta){
            i++;
        }
        return i;
    }

    public boolean mescolaCarte() {
        boolean ris = false;
        int i = 0;
        int pos = 0;

        while (i < 30) {
            Random r = new Random();
            pos = r.nextInt(dimL);
            mazzoCarte[pos] = mazzoCarte[pos + 10];
            i++;
        }
        return ris;
    }

    private void shift(int pos) {
        for (int i = pos; i < dimL - 1; i++) {
            mazzoCarte[i] = mazzoCarte[i + 1];
        }
    }
}
