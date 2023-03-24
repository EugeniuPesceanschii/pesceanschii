package provaVett;

public class ProvaVettTest {

    public static void main(String args[]) {

        int[] vett = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ProvaVett v = new ProvaVett(vett);
        
       /* System.out.println(v.cancellaElemento(0));
        
        System.out.println(v.cercaElemento(5));
        
        System.out.println(v.modificaElemento(0, 6));
        
        System.out.println(v.scambioElementi(3, 8));
        
        System.out.println(v.sommaElementi()); 
   */     
        System.out.println(v.aggiungiElemento(3, 12));
        
        System.out.println(v.numeroElementi());

        System.out.println(v.stampa());

}
    
}
