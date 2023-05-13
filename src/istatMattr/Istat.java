package istatMattr;

public class Istat {
    
    private Regione[] regioni;
    
    public Istat(String[] nome, String[] nomiBeni, double[][] beni){
        regioni = new Regione[nome.length];
        
        for(int i = 0; i < regioni.length; i++){
            regioni[i] = new Regione(nome[i], beni[i], nomiBeni);
        }
    }
    
    public double maxBeneRegione(int iReg){
        
        return regioni[iReg].Max();
    }
    
    public String stampa(){
        String t = "\n";
        
        for(int i = 0; i < regioni.length; i++){
            t += regioni[i].stampa();
        }
        return t;
    }
}
