
package foglio;

import java.text.*;
import java.util.*;

public class FoglioProva {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Foglio f = new Foglio(5, 2, "rosso");
        
        double area = f.calcArea();
        System.out.println(area);
         
        //Per stampare un numero con solo 2 numeri dopo la virgola
        double diagonale = f.calcDiagonale();
DecimalFormatSymbols formatysm_it = new DecimalFormatSymbols(Locale.ITALIAN);
        NumberFormat formatter_it = new DecimalFormat ("###,###.##", formatysm_it);
        String str = formatter_it.format(diagonale);
                System.out.println(str);
        
        f.impostaAltezza(25);
        System.out.println(f.getAltezza());
        
        f.impostaBase(25);
        System.out.println(f.getBase());
        
        f.impostaColore("giallo");
        System.out.println(f.getColore());
        
        String s = f.stampa();
        System.out.println(s);
    
        //Per fare random:
        Random r = new Random();
        int n = r.nextInt(10)+1;
        System.out.println(n);
    }
    
}
