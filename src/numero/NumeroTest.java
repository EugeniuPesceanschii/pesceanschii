package numero;

public class NumeroTest {

      public static void main(String[] args) {
        
          int val2 = 4;
          int somma = -1;
          Numero n = new Numero(5);
          
          System.out.println(n.somma(val2));
          
          System.out.println(n.compareInt(val2));
          
          System.out.println(n.pariDispari(somma));
          
          System.out.println(n.isNegativo(somma));
          
          System.out.println(n.moltiplicazionePerSomma(3));
          
          System.out.println(n.tabellina());
          
          System.out.println(n.stampa());
          
          System.out.println(n.tavolaPitagorica());
    } 
}