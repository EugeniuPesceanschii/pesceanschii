package prodottiNegozio;

public class NonAlimentari extends Prodotti{
    
    private Prodotti[] prodotti;
    private boolean plastica;   
    
    public NonAlimentari(String nome, double prezzo, int iva, double peso,
            double tara, int[] codiceBarre, int dimF) {
        super(nome, prezzo, iva, peso, tara, codiceBarre, dimF);
        
    }
    
    public String toString() {
        String t = "";
        for(int i = 0; i < prodotti.length; i++){
            t += "\n" + prodotti[i].toString();
        }
        
        return  "\nC'è la plastica?" + plastica + "\nProdotti: " + t;
    }
}
