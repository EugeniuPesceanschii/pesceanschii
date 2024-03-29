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

    public String esadecimale() {
        String b = binario();
        String e = "";
        int lunghezza = b.length() - 1;
        int pot = 0;
        int i = 0;
        int c = lunghezza;
        char lettera = 'A';

        while (i <= lunghezza) {
            char bin = b.charAt(c);
            pot += (int) (Math.pow(2, i) * (bin - 48));
            c--;
            i++;
        }

        if (pot < 10) {
            e = "" + pot;
        } else {
            lettera += pot - 10;
            e = "" + lettera;
        }

        return e;
    }

    public String baseX(int base) {
        String num = "";
        int cifra = 0;
        char lettera;
        int n1 = valore;

        while (n1 > 0) {
            cifra = n1 % base;
            if (cifra < 10) {
                num = cifra + num;
            } else {
                lettera = 'A';
                lettera += cifra - 10;
                num = lettera + num;
            }
            n1 /= base;
        }

        return num;
    }

    public String sommaBinario(String numBin) {
        String somma = "";
        String attrBin = "";
        int binTrasf = valore;
        int i = 0;

        while (binTrasf > 0) {
            attrBin = (binTrasf % 2) + attrBin;
            binTrasf /= 2;
        }

        while (i < attrBin.length() && i < numBin.length()) {
            char stringa1 = (char) (attrBin.charAt(i) - '0');
            char stringa2 = (char) (numBin.charAt(i) - '0');

            if (stringa1 + stringa2 == 2) {
                somma += "10";
            } else {
                somma += stringa1 + stringa2;
            }

            i++;
        }

        return somma;
    }
}
