package prodotto;

public class ProdottoTest {

    public static void main(String[] args) {
        int[] array = new int[]{8, 0, 3, 3 ,7, 4, 5, 1, 5, 0, 5, 9, 6, 0};
        
        Prodotto p = new Prodotto(10, 10, 5, 2, "Gallette", array, 14);
      /*  
        System.out.println(p.prezzoIvato());
        
        System.out.println(p.pesoLordo());
        
        System.out.println(p.controlloCodice());
        
        System.out.println(p.stampa());
    */
        ProdottoString s = new ProdottoString(10, 10, 5, 2, "Gallette", "08033745150596");
        
        System.out.println(s.controlloCodice());
    }
    
}
