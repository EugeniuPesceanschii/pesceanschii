package istatMattr;

public class IstatTest {

    public static void main(String[] args) {
        
        double[][] beni = new double[][] {{3.20, 2.10, 3.12}, {3.20, 2.00, 5.32}, {3.20, 1.10, 4.32}};
        
        String[] nomiBeni = new String[] {"Pane", "Latte", "Cereali"};
        
        String[] nome = new String[] {"Trentino", "Valle d'Aosta", "Calabria"};
        
        Istat i = new Istat(nome, nomiBeni, beni);
        
        System.out.println(i.maxBeneRegione(2));
        
        //System.out.println(i.stampa());
    }
    
}
