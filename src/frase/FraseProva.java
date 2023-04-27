package frase;

public class FraseProva {

    public static void main(String[] args) {
        
        Frase f = new Frase ("scrittura$di$un$testo.$");
        
        System.out.println(f.stampaFrase());
        
        System.out.println(f.nParole());
        
        System.out.println(f.nCaratteri());
    }
    
}
