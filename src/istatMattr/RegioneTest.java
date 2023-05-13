package istatMattr;

public class RegioneTest {

    public static void main(String[] args) {
        
        double[] beni = new double[] {3.20, 2.10, 3.32};
        
        String[] nomiBeni = new String[] {"Pane", "Latte", "Cereali"};
        
        Regione r = new Regione("Calabria", beni, nomiBeni);
        
        System.out.println(r.getBene("Pane"));
        
        System.out.println(r.beneMax());
        
        System.out.println(r.stampa());
        
    }
}
