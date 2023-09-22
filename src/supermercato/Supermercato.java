package supermercato;

public class Supermercato {

    private String nome;
    private String indirizzo;
    private Prodotto[] prodotti;
    private int diml;

    public Supermercato(String nome, String indirizzo, Prodotto[] prodotti, int diml) {

        this.prodotti = copia(prodotti, prodotti.length);
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.diml = prodotti.length;
    }

    public String prezzoAlto() {
        double prezzo = 0;
        String t = "";
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i].prezzoIvato() > prezzo) {
                prezzo = prodotti[i].prezzoIvato();
                t = prodotti[i].getDescrizione();
            }
        }
        return t;
    }

    public double valoreMerce() {
        double valore = 0;
        for (int i = 0; i < prodotti.length; i++) {
            valore += prodotti[i].getPrezzo();
        }
        return valore;
    }

    public String pesoMinore() {
        String t = "";
        double peso = 0;
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i].getPeso() < peso) {
                peso = prodotti[i].getPeso();
                t = prodotti[i].getDescrizione();
            }
        }
        return t;
    }

    public String merciSopraMedia() {
        String t = "";
        double media = 0;
        for (int i = 0; i < prodotti.length; i++) {
            media += prodotti[i].getPrezzo();
        }
        media /= prodotti.length;

        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i].getPrezzo() > media) {
                t += "\n" + prodotti[i].getDescrizione();
            }
        }
        return t;
    }

    public void addProdotto(Prodotto pAdd) {
        if (diml == this.prodotti.length) {
            prodotti = copia(prodotti, prodotti.length + 10);
        }

        prodotti[diml] = pAdd;
        diml++;
    }

    public void addProdotto(double prezzo, int iva, double peso, double tara,
            String descrizione, String codiceBarre) {
        Prodotto p = new Prodotto(prezzo, iva, peso, tara, descrizione, codiceBarre);
        addProdotto(p);
    }

    public boolean cancProdotto(String nome){
        boolean ris = false;
        Prodotto[] temp = new Prodotto[prodotti.length - 1];

        for(int i = 0; i < temp.length; i++){
            if(nome == prodotti[i].getDescrizione()){
                temp[i] = prodotti[i + 1];
                diml--;
                ris = true;
            } else {
                temp[i] = prodotti[i];
            }
        }
        prodotti = temp;
        return ris;
    }
    
    public String stampa() {
        String t = "";
        for (int i = 0; i < prodotti.length; i++) {
            t += prodotti[i].stampa() + "\n" + "\n";
        }
        return t;
    }

    private void reSize(){
        Prodotto[] temp = new Prodotto[prodotti.length +(prodotti.length / 100 * 20)];
        for(int i = 0; i < prodotti.length; i++){
            temp[i] = prodotti[i];
        }
        prodotti = temp;
    }
    
    private Prodotto[] copia(Prodotto[] prodotti, int lungFisica) {
        Prodotto[] temp = new Prodotto[lungFisica];
        for (int i = 0; i < prodotti.length; i++) {
            temp[i] = prodotti[i];
        }
        return temp;
    }
}
