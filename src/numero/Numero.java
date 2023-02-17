package numero;

public class Numero {

    private int valore;

    public Numero(int valore) {
        this.valore = valore;
    }

    public void setValore(int v) {
        valore = v;
    }

    public int getValore() {
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
        int cont1 = 1;

        while (cont1 <= valore) {
            int cont2 = 1;
            while (cont2 <= valore) {
                testo += (cont1 * cont2) + " ";
                cont2++;
            }
            testo += "\n";
            cont1++;
        }
        return testo;
    }

    public String sequenzaFibonacci() {
        int n1 = 1;
        int n2 = 0;
        int n3 = 0;
        String t = "Sequenza di Fibonacci: ";
        int c = 1;

        while (valore >= c) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            t += " " + n3;

            c++;
        }
        return t;
    }

    public int fattoriale() {
        int c = 1;
        int n1 = 1;

        while (c <= valore) {
            n1 *= c;
            c++;
        }
        Numero m = new Numero(n1);
        return m.getValore();
    }

    public String binario() {
        String b = "";
        int n = valore;

        while (n > 0) {
            b = (n % 2) + b;
            n /= 2;
        }
        return b;
    }

    public String baseX(int base) {
        String num = "";
        int cifra = 0;
        char lettera;

        while (valore > 0) {
            cifra = valore % base;
            if (cifra < 10) {
                num = cifra + num;
            } else {
                lettera = (char) ('A' + cifra - 10);
                num = lettera + num;
            }
            valore /= base;
        }

        return num;
    }
}
