package numero;

public class NumeroTest {

      public static void main(String[] args) {
        
          Numero n = new Numero(-5);
          
          System.out.println(n.somma(4));
          
          System.out.println(n.compareInt(4));
          
          System.out.println(n.pariDispari(-1));
          
          System.out.println(n.isNegativo(-1));
          
          System.out.println(n.stampa());
    } 
}
