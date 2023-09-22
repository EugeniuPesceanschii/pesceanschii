package supermercato;

public class Prodotto {
    
    private double prezzo;
    private int iva;
    private double peso;
    private double tara;
    private String descrizione;
    private String codiceBarre;

    public Prodotto(double prezzo, int iva, double peso, double tara,
            String descrizione, String codiceBarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceBarre = codiceBarre;
    }

    public Prodotto(Prodotto prod){
        this.prezzo = prod.prezzo;
        this.iva = prod.iva;
        this.peso = prod.peso;
        this.tara = prod.tara;
        this.descrizione = prod.descrizione;
        this.codiceBarre = prod.codiceBarre;
    }
    
    public String getDescrizione() {
        return descrizione;
    }

    public int getIva() {
        return iva;
    }

    public double getTara() {
        return tara;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getPeso() {
        return peso;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
       
    public double prezzoIvato() {
        return prezzo / 100 * iva + prezzo;
    }

    public double pesoLordo() {
        return peso + tara;
    }

    public boolean controlloCodice() {
        boolean ris = false;
        int i = 1;
        int resto = 0;

        while (i < codiceBarre.length() - 1) {
            if ((i % 2) == 1) {
                resto += (codiceBarre.charAt(i) - '0') * 3;
            } else {
                resto += codiceBarre.charAt(i) - '0';
            }
            i += 2;
        }

        resto %= 10;
        if (resto == codiceBarre.charAt(13) - '0') {
            ris = true;
        }
        return ris;
    }

    public String stampa() {
        String t = "";        

        return "Prezzo: " + prezzo + "\nIva: " + iva + "%" + "\nPeso: " + peso
                + "\nTara: " + tara + "\nDescrizione: " + descrizione
                + "\nCodice a barre: " + codiceBarre;
    }   
}
