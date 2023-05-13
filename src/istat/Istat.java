
package istat;

public class Istat {
    
    private Regione[] egionir;
    
    public Istat(String[] nome, double[] pLatte, double[] pPane){             
        regioni = new Regione[nome.length];
        for(int i = 0; i < regioni.length; i++){
            regioni[i] = new Regione(beni[i], nome);
        }
    }
    
    public String maxPane() {
        int indice = mPane();
        
        return "Costo del pane: " + regioni[indice].getPPane() + " Della regione: " + regioni[indice];
    }
    
    public String maxLatte() {
        int indice = mLatte(); 
        
        return "Costo del latte: " + regioni[indice].getPLatte() + " Della regione: " + regioni[indice];
    }
    
    public String maxBeni() {
        String testo = "Nessuna regione ha entrambi i prezzi più alti";
        int indice1 = mPane();
        int indice2 = mLatte();
        
        if(indice1 == indice2){
            testo = regioni[indice1].getNome() + "  è la regione con entrambi i costi più alti";
        }
        
        return testo;
    }
    
    /*
    public String prezzoMaggiore(){
        String ris = "";
        double cPaneMagg = 0.0;
        double cLatteMagg = 0.0;
        String nomeRegP = "";
        String nomeRegL = "";
        
        for(int i = 0; i < 20; i++){                       
            if(cPaneMagg < regioni[i].getPPane()){
                cPaneMagg = regioni[i].getPPane();
                nomeRegP = regioni[i].getNome();
            }            
            if(cLatteMagg < regioni[i].getPLatte()){
                cLatteMagg = regioni[i].getPLatte();
                nomeRegL = regioni[i].getNome();
            }
        }
        ris = "Costo del pane più elevato: " + cPaneMagg + " nella regione: " 
                + nomeRegP + 
             "\nCosto del latte più elevato: " + cLatteMagg + " nella regione: " 
                + nomeRegL;
        
        return ris;
    }
    */
    public String stampa(){
        String testo = "";
        
        for(int i = 0; i < 20; i++){
            testo += "\nRegione[" + i + "]: " + regioni[i].stampa();
        }
        
        return testo;
    }
    
    private int mPane() {
        int iMax = 0;
        
        for(int i = 1; i < regioni.length; i++){                       
            if(regioni[iMax].getPPane() < regioni[i].getPPane()){     
                iMax = i;
            }
            
        }  
        return iMax;
    }
    
    private int mLatte() {
        int indice = 0;
        
        for(int i = 1; i < regioni.length; i++){                       
            if(regioni[indice].getPLatte() < regioni[i].getPLatte()){     
                indice = i;
            } 
        }  
        return indice;
    }
}

