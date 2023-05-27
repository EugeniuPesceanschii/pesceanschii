package mazzo;

public class Carte {
     private int seme;
    private int numero;
    
    public Carte(int seme, int numero){
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
