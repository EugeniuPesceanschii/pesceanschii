package supermercato;

public class Prodotto {
    
    private double prezzo;
    private int iva;
    private double peso;
    private double tara;
    private String descrizione;
    private int[] codiceBarre;

    public Prodotto(double prezzo, int iva, double peso, double tara,
            String descrizione, int[] codiceBarre, int dimF) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceBarre = new int[dimF];
        for (int i = 0; i < dimF; i++) {
            this.codiceBarre[i] = codiceBarre[i];
        }
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getPeso() {
        return peso;
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

    public String stampa() {
        String t = "";
        for (int i = 0; i < codiceBarre.length; i++) {
            t += " " + codiceBarre[i];
        }

        return "Prezzo: " + prezzo + "\nIva: " + iva + "%" + "\nPeso: " + peso
                + "\nTara: " + tara + "\nDescrizione: " + descrizione
                + "\nCodice a barre: " + t;
    }

    private void shift() {
        for (int i = codiceBarre.length - 1; i > 0; i--) {
            codiceBarre[i] = codiceBarre[i - 1];
        }
    }
}
