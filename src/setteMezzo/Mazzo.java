package setteMezzo;

import java.util.Random;

public class Mazzo {

    private Carta[] mazzoCarte;
    private int dimL;

    public Mazzo(String[] desc, int nCarte) {
        mazzoCarte = new Carta[nCarte * desc.length];
        caricaCarte(desc.length, nCarte, desc);
    }

    private void caricaCarte(int nSemi, int nCarte, String[] desc) {
        boolean[][] controllo = new boolean[nSemi][nCarte];
        Random rand = new Random();
        int seme = 0;
        int carta = 0;
        
        while (dimL < nCarte * nSemi) {
            carta = 1 + rand.nextInt(nCarte);
            seme = rand.nextInt(nSemi);
            
            if (!controllo[seme][carta - 1]) {
                controllo[seme][carta - 1] = true;
                mazzoCarte[dimL] = new Carta(desc[seme], carta);
                dimL++;
            }
        }
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

        while (mazzoCarte[i].getNumero() != numCarta) {
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
