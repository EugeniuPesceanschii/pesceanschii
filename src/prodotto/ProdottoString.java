package prodotto;

public class ProdottoString {

    private double prezzo;
    private int iva;
    private double peso;
    private double tara;
    private String descrizione;
    private String codiceBarre;

    public ProdottoString(double prezzo, int iva, double peso, double tara,
            String descrizione, String codiceBarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceBarre = codiceBarre;
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
}
