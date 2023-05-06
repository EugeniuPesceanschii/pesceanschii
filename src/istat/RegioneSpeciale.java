package istat;

public class RegioneSpeciale {
   
    private double[] costo;
    private String[] beni;
    private String nome;
    
    public RegioneSpeciale(double[] costo, String[] beni, String nome){
         this.beni = beni;
        
        this.nome = nome;
    }
    
    public double getPPane(){
        return pPane;
    }
    
    public double getPLatte(){
        return pLatte;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String stampa(){
        String testo = "";
        
        testo = "Nome regione: " + nome + "\nPrezzo pane: " + pPane 
                + "\nPrezzo latte: " + pLatte;
        
        return testo;
    }
}
