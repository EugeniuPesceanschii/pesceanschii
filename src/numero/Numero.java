package numero;

public class Numero {

    private int valore;

    public Numero(int valore) {
        this.valore = valore;
    }

    public void setVal1(int v) {
        valore = v;
    }

    public int getVal1() {
        return valore;
    }

    public String somma(int val2) {
        String s;
        int somma = 0;

        somma = valore + val2;

        s = "La somma dei due valori è: " + somma;
        return s;
    }

    public String compareInt(int val2) {
        String b = "";

        if (valore > val2) {
            b = "Il primo valore è maggiore";
        } else if (valore < val2) {
            b = "Il secondo valore è maggiore";
        } else if (valore == val2) {
            b = "I due valori sono uguali";
        }
        return b;
    }

    public boolean pariDispari(int somma) {
        boolean p = false;

        if ((somma % 2) == 0) {
            p = true;
        }
        return p;
    }

    public boolean isNegativo(int somma) {
        boolean n = true;

        if (somma >= 0) {
            n = false;
        }
        return n;
    }

    public String moltiplicazionePerSomma(int moltiplicatore) {
        int risultato = 0;

        while (moltiplicatore * valore != risultato) {
            risultato += valore;
        }
        return "il risultato è: " + risultato;
    }

    public String stampa() {
        String s;

        s = "Il valore 1 vale: " + valore;
        return s;
    }

    public String tabellina() {
        String t = " ";
        int multiplo = 0;

        while (multiplo != valore * 10) {
            multiplo += valore;
            t += "\nMultiplo: " + multiplo;
        }
        return t;
    }

    public String tavolaPitagorica() {
        String testo = "";
        int cont1 = 1; //colonne

        while (cont1 <= valore) {
            int cont2 = 1; //righe
            while (cont2 <= valore) {
                testo += (cont1 * cont2) + " ";
                cont2++;
            }
            testo += "\n";
            cont1++;
        }
        return testo;
    }
}