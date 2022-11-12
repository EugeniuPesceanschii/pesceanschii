package indovinaNumero;

public class IndovinaNumeroTest {

    public static void main(String[] args) {
        int n = 15;
       
        String testoDaStampare;
        
        IndovinaNumero n1 = new IndovinaNumero(n);
    
        testoDaStampare = n1.stampa();
    
        System.out.println(testoDaStampare);
    }
    
}
