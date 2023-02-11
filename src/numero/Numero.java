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
        String e = "";
        String nbin = binario();
        int lungbin = nbin.length();

        e = conversione(e);
        e += aggiungiZeri(zero);
        return e;
    }

    private String aggiungiZeri(String zero) {
        
    }

    private String conversione(String e) {

        switch (e) {
            case "0":
                e = "0000";
                break;
            case "1":
                e = "0001";
                break;
            case "2":
                e = "0010";
                break;
            case "3":
                e = "0011";
                break;
            case "4":
                e = "0100";
                break;
            case "5":
                e = "0101";
                break;
            case "6":
                e = "0110";
                break;
            case "7":
                e = "0111";
                break;
            case "8":
                e = "1000";
                break;
            case "9":
                e = "1001";
                break;
            case "A":
                e = "1010";
                break;
            case "B":
                e = "1011";
                break;
            case "C":
                e = "1100";
                break;
            case "D":
                e = "1101";
                break;
            case "E":
                e = "1110";
                break;
            case "F":
                e = "1111";
                break;
            default:
                e = "";
        }
        return e;
    }
}
