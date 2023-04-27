package frase1;

public class FraseTest {

    public static void main(String[] args) {
        
        String[] parole = new String[] {"oggi", "ho", "fatto", "la", "verifica"};
        
        Frase1 f = new Frase1(parole);
        
        System.out.println(f.inserimento("EUGII", 2));
        
        System.out.println(f.cancellazione(4));
        
        System.out.println(f.spostamento(0, 3));
        
        System.out.println(f.nParole());
        
        System.out.println(f.nCaratteri());
       
        System.out.println(f.stampa());
    }
    
}
