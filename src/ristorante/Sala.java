package ristorante;

public class Sala {
    private int capienza;
    private Tavolo[] tavoli;     
    private int dimlTav;
    
    public Sala(Tavolo[] t){
        tavoli = new Tavolo[t.length];
        for(int i = 0; i < t.length; i++){
            tavoli[i] = t[i];
        }    
        this.capienza = t.length;
        this.dimlTav = t.length;
    }
    
    public void addTavolo(Tavolo t){
        if(dimlTav < capienza){
            tavoli[dimlTav] = t;
        }
    }
    
    public void cancTavolo(int indice){
        shift(indice, tavoli);
    }
    
    public int persSedute(){
        int nPersone = 0;
        
        for(int i = 0; i < tavoli.length; i++){
            nPersone += tavoli[i].getnPersone();
        }
        return nPersone;
    }
    
    public void disdireTav(int nTav){
        int i = 0;
        while(i < tavoli.length && tavoli[i].isPrenotato()){
            if(nTav == tavoli[i].getnTavolo()){
                tavoli[i].disdici();
            }
            i++;
        }
    }
    
    //fare toString()
    
    private void shift(int indice, Tavolo[] temp){
        for(int i = indice; i < tavoli.length; i++){
            temp[i] = temp[i + 1];
        }
    }
    
   /* private int cercaTav(int indice){
        
        while(indice < t.length){
            
        }
        return indice;
    }*/
}
    
    

