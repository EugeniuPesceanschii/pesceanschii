package prodottiNegozio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Alimentari extends Prodotti {

    LocalDate dataOdierna = LocalDate.now();
    String data = dataOdierna.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    private Data scadenza;
    private int sconto;
    private Prodotti[] prodotti;

    public Alimentari(String nome, double prezzo, int iva, double peso,
            double tara, int[] codiceBarre, int dimF, Data scadenza, int sconto,
            Prodotti[] prodotti) {
        super(nome, prezzo, iva, peso, tara, codiceBarre, dimF);
        this.scadenza = scadenza;
        this.sconto = sconto;
        this.prodotti = prodotti;
    }

    public String sconto50() {
        String t = "";

        return t;
    }

    public boolean isScaduto() {
        boolean ris = false;

        for (int i = 0; i < prodotti.length; i++) {

        }
        return ris;
    }

    @Override
    public String toString() {
        String t = "";
        for (int i = 0; i < prodotti.length; i++) {
            t += "\n" + prodotti[i].toString();
        }

        return "\nScadenza: " + scadenza.formattaData() + "\nSconto: " + sconto
                + "\nProdotti: " + t;
    }

}
