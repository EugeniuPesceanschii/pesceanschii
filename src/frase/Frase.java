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

        dimL++;
        ingrandisci(dimL);
        shiftDx(indice, dimL);
        parole[indice] = parola;
        risultato = true;

        return risultato;
    }

    public boolean cancellazione(int indice) {
        boolean risultato = false;

        parole[indice] = "";
        dimL--;
        shiftSx(indice, dimL);
        risultato = true;

        return risultato;
    }

    public boolean spostamento(int posP, int posA) {
        boolean risultato = false;
        String salva = parole[posP];
        
        if (posP < posA) {
            shiftSx(posP, posA);         
        } else {
            shiftDx(posA, posP);          
        }
        parole[posA] = salva;
        risultato = true;

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

    private void shiftDx(int posP, int posA) {
        for (int i = posA - 1; i > posP; i--) {
            parole[i] = parole[i - 1];
        }
    }

    private void shiftSx(int posP, int posA) {
        for (int i = posP; i < posA; i++) {
            parole[i] = parole[i + 1];
        }
    }

    private void ingrandisci(int dimensione) {

        String[] arrayC = new String[dimensione];
        for (int i = 0; i < dimensione - 1; i++) {
            arrayC[i] = parole[i];
        }
        parole = arrayC;
    }
}
