package ristorante;

public class Tavolo {
    private int capienza;
    private int nPersone;
    private int nTavolo;
    private boolean prenotato;

    public Tavolo(Tavolo t) {
        this.capienza = t.capienza;
        this.nPersone = t.nPersone;
        this.nTavolo = t.nTavolo;
        this.prenotato = t.prenotato;
    }

    public int getCapienza() {
        return capienza;
    }

    public int getnPersone() {
        return nPersone;
    }
    
    public int getnTavolo() {
        return nTavolo;
    }

    public boolean isPrenotato() {
        return prenotato;
    }
     
    public void setnPersone(int nPersone) {
        this.nPersone = nPersone;
    }

    public void setPrenotato(boolean prenotato) {
        this.prenotato = prenotato;
    }
    
    public void siedi(int nP){
        if(nPersone == 0 && capienza >= nP){
            setnPersone(nP);
        }
    }
    
    public void alzati(){
        setnPersone(0);
    }

    public void prenotazione(int nPers){
        if(nPers <= capienza){
            prenotato = !prenotato;
        }
    }
    
    public void disdici(){
        if(prenotato){
            prenotato = !prenotato;
        }
    }
    
    @Override
    public String toString() {
        return "\nCapienza: " + capienza + "\nNumero persone sedute: " + nPersone +
                "\nNumero del tavolo: " + nTavolo + "\nE' stato prenotato? " + prenotato;
    }
    
    
}
