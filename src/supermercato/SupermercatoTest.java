package supermercato;

public class SupermercatoTest {

    public static void main(String[] args) {
        double[] prezzi = new double[] {2.30, 3.10, 1.90, 399.99, 20};
        int[] iva = new int[] {5, 10, 7, 15, 8};
        double[] peso = new double[] {5.30, 4, 1.50, 10, 40};
        double[] tara = new double[] {1.20, 0.30, 5, 4, 3.15};
        String[] nomi = new String[] {"Pane", "Caramelle", "Cioccolato", "Scheda madre"
                        + "Spinner"};
        int[] codiceBarre = 80337451505960;
       
        Supermercato s = new Supermercato("Poli", "CasaMia 12", 5, prezzi, iva, peso, 
                    tara, nomi, codiceBarre);
        
        System.out.println(s.merciSopraMedia());
    }
    
}
