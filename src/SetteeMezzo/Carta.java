package SetteeMezzo;

public class Carta {
     private int seme;
    private int numero;
    
    public Carta(int seme, int numero){
        this.seme = seme;
        this.numero = numero;
    }

    public int getSeme() {
        return seme;
    }

    public int getNumero() {
        return numero;
    }

    public String stampa(){
        String t = "";
        
        t = "Seme: " + seme + " Numero: " + numero;
        
        return t;
    }
}
