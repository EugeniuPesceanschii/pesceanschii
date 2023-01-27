package numero;

public class Numero {

    private int val1;

    public Numero(int val1) {
        this.val1 = val1;
    }

    public void setVal1(int v) {
        val1 = v;
    }

    public int getVal1() {
        return val1;
    }

    public String somma(int val2) {
        String s;
        int somma = 0;

        somma = val1 + val2;

        s = "La somma dei due valori è: " + somma;
        return s;
    }

    public String compareInt(int val2) {
        String b = "";

        if (val1 > val2) {
            b = "Il primo valore è maggiore";
        } else if (val1 < val2) {
            b = "Il secondo valore è maggiore";
        } else if (val1 == val2) {
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

        while (moltiplicatore * val1 != risultato) {
            risultato += val1;
        }
        return "il risultato è: " + risultato;
    }

    public String tabellina() {
        String t = "";
        int multiplo = 0;
        
        while(multiplo != val1 * 10) {
            multiplo += val1;
            t += "\nMultiplo: " + multiplo;
        }
        return t;
    }
    
    public String stampa() {
        String s;

        s = "Il valore 1 vale: " + val1;
        return s;
    }
}