package supermercato;

public class Azienda {
    
    private String nome;
    private String sedeLegale;
    private Supermercato[] supermercati;
    private int diml;
    
    public Azienda(String nome, String sede, Supermercato[] supermercati){
        this.nome = nome;
        this.sedeLegale = sede;
        this.supermercati = copia(supermercati, supermercati.length);
    }
    
    public void addProd(Prodotto pAdd, int indice){
        
        supermercati[indice].addProdotto(pAdd);
    }
    
    private void reSize(){
        Supermercato[] temp = new Supermercato[supermercati.length + 
                                                supermercati.length / 100 * 20];
        for(int i = 0; i < temp.length; i++){
            temp[i] = supermercati[i];
        }
        supermercati = temp;
    }
    
    private Supermercato[] copia(Supermercato[] array, int dimF){
        Supermercato[] temp = new Supermercato[dimF];
        for(int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        return temp;
    }
}
