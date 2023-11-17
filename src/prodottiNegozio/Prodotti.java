package prodottiNegozio;

public class Prodotti {

    private String nome;
    private double prezzo;
    private int iva;
    private double peso;
    private double tara;
    private int[] codiceBarre;

    public Prodotti(String nome, double prezzo, int iva, double peso, double tara,
            int[] codiceBarre, int dimF) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.codiceBarre = new int[dimF];
        for (int i = 0; i < dimF; i++) {
            this.codiceBarre[i] = codiceBarre[i];
        }
    }

    public String getNome() {
        return nome;
    }

    public double prezzoIvato() {
        return prezzo / 100 * iva + prezzo;
    }

    public double pesoLordo() {
        return peso + tara;
    }

    public boolean controlloCodice() {
        boolean risultato = false;
        int resto = 0;
        shift();
        for (int i = 1; i < codiceBarre.length - 1; i++) {
            if ((i % 2) == 0) {
                resto += codiceBarre[i] * 1;
            } else {
                resto += codiceBarre[i] * 3;
            }
        }
        resto %= 10;
        if (resto == codiceBarre[13]) {
            risultato = true;
        }
        return risultato;
    }

    public String toString() {
        String t = "";
        for (int i = 0; i < codiceBarre.length; i++) {
            t += " " + codiceBarre[i];
        }

        return "Prezzo: " + prezzo + "\nIva: " + iva + "%" + "\nPeso: " + peso
                + "\nTara: " + tara + "\nDescrizione: " + nome
                + "\nCodice a barre: " + t;
    }

    private void shift() {
        for (int i = codiceBarre.length - 1; i > 0; i--) {
            codiceBarre[i] = codiceBarre[i - 1];
        }
    }
}
