package frase;

public class FraseTest {

    public static void main(String[] args) {
        
        String[] parole = new String[] {"oggi", "ho", "fatto", "la", "verifica"};
        
        Frase f = new Frase(parole);
        
        System.out.println(f.nParole());
        
        System.out.println(f.nCaratteri());
        
        System.out.println(f.stampa());
    }
    
}
