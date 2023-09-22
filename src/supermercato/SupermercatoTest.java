package supermercato;

public class SupermercatoTest {

    public static void main(String[] args) {
        double[] prezzi = new double[] {2.30, 3.10, 1.90, 399.99, 20};
        int[] iva = new int[] {5, 10, 7, 15, 8};
        double[] peso = new double[] {5.30, 4, 1.50, 10, 40};
        double[] tara = new double[] {1.20, 0.30, 5, 4, 3.15};
        String[] nomi = new String[] {"Pane", "Caramelle", "Cioccolato", "Scheda madre"
                        , "Spinner"};
        String[] codiceBarre = new String[] {"8033745150596", "8033745150596", 
                        "8033745150596", "8033745150596", "8033745150596"};
       
        Prodotto[] p = new Prodotto[iva.length];
        
        for(int i = 0; i < p.length; i++){
            p[i] = new Prodotto(prezzi[i], iva[i], peso[i], tara[i], nomi[i], 
                    codiceBarre[i]); 
        }
        
        Supermercato s = new Supermercato("Poli", "CasaMia 12", p, 4);
        
        System.out.println(s.cancProdotto("Cioccolato"));
        
//        System.out.println(s.merciSopraMedia());
        System.out.println(s.stampa());
    }
    
}
