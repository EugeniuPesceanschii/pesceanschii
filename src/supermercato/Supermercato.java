package supermercato;

public class Supermercato {
    
    private String nome;
    private String indirizzo;
    private Prodotto[] prodotti;

    public Supermercato(String nome, String indirizzo, int nProdotti, double[] prezzi,
        int[] iva, double[] peso, double[] tara, String[] nomi, int[] codiceBarre) {
        prodotti = new Prodotto[nProdotti];
        this.nome = nome;
        this.indirizzo = indirizzo;
        
        for(int i = 0; i < prodotti.length; i++){
            prodotti[i] = new Prodotto(prezzi[i], iva[i], peso[i], tara[i], nomi[i],
            codiceBarre[i]);
        }
    }
    
    public String prezzoAlto(){
        double prezzo = 0;
        String t = "";
        for(int i = 0; i < prodotti.length; i++){
            if(prodotti[i].prezzoIvato() > prezzo){
                prezzo = prodotti[i].prezzoIvato();
                t = prodotti[i].getDescrizione();
            }
        }
        return t;
    }
   
    public double valoreMerce(){
        double valore = 0;
        for(int i = 0; i < prodotti.length; i++){
            valore += prodotti[i].getPrezzo();
        }
        return valore;
    }
    
    public String pesoMinore(){
        String t = "";
        double peso = 0;
        for(int i = 0; i < prodotti.length; i++){
            if(prodotti[i].getPeso() < peso){
                peso = prodotti[i].getPeso();
                t = prodotti[i].getDescrizione();
            }
        }
        return t;
    }
    
    public String merciSopraMedia(){
        String t = "";
        double media = 0;
        for(int i = 0; i < prodotti.length; i++){
            media += prodotti[i].getPrezzo();
        }
        media/= prodotti.length;
        
        for(int i = 0; i < prodotti.length; i++){
            if(prodotti[i].getPrezzo() > media){
                t += "\n" + prodotti[i].getDescrizione();
            }
        }
        return t;
    }
    
    public String stampa(){
        String t = "";
        for(int i = 0; i < prodotti.length; i++){
            t += prodotti[i].stampa();
        }
        return t;
    }
}
