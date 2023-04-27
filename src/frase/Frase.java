package frase;

import java.util.regex.Pattern;

public class Frase {
    private Parola[] arrParole;
    private int dimL;

    public Frase(String testo) {
        String[] temp = testo.split(Pattern.quote("$"));
        arrParole = new Parola[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arrParole[i] = new Parola(temp[i]);
        }
        dimL = temp.length;
    }

    public String stampaFrase() {
        String testo = "";
        for (int i = 0; i < dimL; i++)
            testo += arrParole[i].getTesto() + " ";
        return testo;
    }

    public int nParole() {
        return dimL;
    }

    public int nCaratteri() {
        int numeroCaratteri = 0;
        for (int i = 0; i < dimL; i++) {
            numeroCaratteri += arrParole[i].nCaratteri();
        }
        return numeroCaratteri;
    }
   
    public void spostaParola(int posP, int posA) {
        Parola parola = arrParole[posP];
        if (posP < posA) {
            shiftSx(posP, posA);
        } else {
            shiftDx(posA, posP);
        }
        arrParole[posA] = parola;

    }

    public void inserisciParola(String parola, int indice) {
        if (isFull()) {
            ingrandisciArray();
        }
        shiftDx(indice, dimL);
        arrParole[indice] = new Parola(parola);
        dimL++;
    }
    
    //Metodi private:
    private void shiftDx(int posP, int posA) {
        for (int i = posA; i > posP; i--)
            arrParole[i] = arrParole[i - 1];
    }

    private void shiftSx(int posP, int posA) {
        for (int i = posP; i < posA; i++)
            arrParole[i] = arrParole[i + 1];
    }
    
    private void ingrandisciArray() {
        Parola[] arrayIngrandito = new Parola[arrParole.length + 4];
        for (int i = 0; i < arrParole.length; i++)
            arrayIngrandito[i] = arrParole[i];
        arrParole = arrayIngrandito;
    }

    private boolean isFull() {
        return dimL == arrParole.length;
    }
}

