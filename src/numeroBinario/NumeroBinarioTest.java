package numeroBinario;

public class NumeroBinarioTest {

    public static void main(String[] args) {
        
        NumeroBinario n = new NumeroBinario("00001010");
        
        System.out.println(n.decimale());
        
        System.out.println(n.digit(4));
       
        System.out.println(n.somma("101"));
        
        System.out.println(n.sottrazione("100"));
        
        System.out.println(n.stampa());
    }
    
}
