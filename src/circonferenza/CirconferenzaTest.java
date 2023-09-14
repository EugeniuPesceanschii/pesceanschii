package circonferenza;

public class CirconferenzaTest {

    public static void main(String[] args) {
        
        Circonferenza c = new Circonferenza (2, 2, 1, 0);
        
        System.out.println(c.getRaggio());
        
        System.out.println(c.getPerimetro());
        
        System.out.println(c.getArea());
    
        System.out.println(c.stampa());
    }
    
}
