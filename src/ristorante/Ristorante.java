package ristorante;

public class Ristorante {
    private int capienza;
    private Tavolo[] tavoli;
    private Tavolo[] magazzino;
    private int nTavoli;
    private int dimlMag;
    private int dimlTav;
    
    public Ristorante(Tavolo[] t){
        this.tavoli = t;
        this.magazzino = new Tavolo[t.length];
        this.capienza = t.length;
        this.dimlMag = 0;
        this.dimlTav = t.length;
    }
    
    public void addTavolo(){
        if(dimlTav < capienza){
            tavoli[dimlTav] = magazzino[dimlMag - 1];
            shift(dimlMag - 1, magazzino);
            dimlMag--;
            dimlTav++;
        }
    }
    
    public void cancTavolo(){
        magazzino[dimlMag] = tavoli[dimlTav - 1];
        shift(dimlTav - 1, tavoli);
        dimlMag++;
        dimlTav--;
    }
    
    public int persSedute(){
        int nPersone = 0;
        
        for(int i = 0; i < tavoli.length; i++){
            nPersone += tavoli[i].getnPersone();
        }
        return nPersone;
    }
    
    public void disdireTav(int nTav){
        for(int i = 0; i < tavoli.length; i++){
            if(nTav == tavoli[i].getnTavolo()){
                tavoli[i].setPrenotato(!tavoli[i].isPrenotato());
            }
        }
    }
    
    @Override
    public String toString() {
        return super.toString(); 
    }
    
    private void shift(int indice, Tavolo[] temp){
        for(int i = indice; i < tavoli.length; i++){
            temp[i] = temp[i + 1];
        }
    }
}
