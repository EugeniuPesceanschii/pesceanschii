package setteMezzo;

public class Carta {
     private String seme;
    private int numero;
    
    public Carta(String seme, int numero){
        this.seme = seme;
        this.numero = numero;
    }

    public String getSeme() {
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
