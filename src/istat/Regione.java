package istat;

public class Regione {
    
    private double pPane;
    private double pLatte;
    private String nome;
    
    public Regione(double pPane, double pLatte, String nome){
        this.pPane = pPane;
        this.pLatte = pLatte;
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

