package orologio;

public class Orologio {

    private int ora;
    private int minuti;
    private int secondi;

    public Orologio(int ora, int minuti, int secondi) {
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public Orologio(Orologio o) {
        this.ora = o.ora;
        this.minuti = o.minuti;
        this.secondi = o.secondi;
    }
    
    public int getOra() {
        return ora;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    public String dammiOrario() {
        String t = "";

        controlloTempo();

        t = ora + ":" + minuti + ":" + secondi;

        return t;
    }

    public void aggiungiOre(int ore){
        setOra(ora + ore);
        
        controlloTempo();
    }
    
    @Override
    public String toString() {
        return "\nOra: " + ora + "\nMinuti: " + minuti + "\nSecondi: " + secondi;
    }

    private void controlloTempo(){
        if (ora == 24) {
            ora = 0;
        }

        while (ora > 24) {
            ora -= 24;
        }

        while (minuti > 60) {
            minuti -= 60;
            ora++;
        }

        while (secondi > 60) {
            secondi -= 60;
            minuti++;
        }
    }
}
