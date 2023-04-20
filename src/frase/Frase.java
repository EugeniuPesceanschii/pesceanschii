package frase;

public class Frase {

    private String[] parole;
    private int dimL;

    public Frase(String[] parole) {
        this.parole = copiaP(parole);
        dimL = this.parole.length;
    }

    public String[] getParole() {
        return copiaP(parole);
    }

    public boolean inserimento(String parola, int indice) {
        boolean risultato = false;

        if (indice >= 0 && indice < parole.length) {
            shiftDx(indice);
            parole[indice] = parola;
            risultato = true;
        }
        return risultato;
    }

    public boolean cancellazione(int indice) {
        boolean risultato = false;

        if (indice >= 0 && indice < parole.length) {
            parole[indice] = "";
            shiftSx(indice);
            risultato = true;
        }
        return risultato;
    }

    public boolean spostamento(int posP, int posA) {
        boolean risultato = false;

        if (posP >= 0 && posP < parole.length && posA >= 0 && posA < parole.length) {
            parole[posA] = parole[posP];
            parole[posP] = "";
            shiftSx(posP);
            risultato = true;
        }
        return risultato;
    }

    public int nParole() {
        return dimL;
    }

    public int nCaratteri() {
        int charTot = 0;

        for (int i = 0; i < parole.length; i++) {
            charTot += parole[i].length();
        }
        return charTot;
    }

    public String stampa() {
        String t = "";

        for (int i = 0; i < parole.length; i++) {
            t += "\nparole[" + i + "] = " + parole[i];
        }
        return t;
    }

    //Metodi private:
    private String[] copiaP(String[] arP) {
        String[] pCopia = new String[arP.length];
        for (int i = 0; i < arP.length; i++) {
            pCopia[i] = arP[i];
        }
        return pCopia;
    }

    private void shiftDx(int pos) {
        for (int i = dimL - 1; i > pos; i--) {
            parole[i] = parole[i - 1];
        }
    }

    private void shiftSx(int pos) {
        for (int i = pos; i < dimL - 1; i++) {
            parole[i] = parole[i + 1];
        }
    }
}
