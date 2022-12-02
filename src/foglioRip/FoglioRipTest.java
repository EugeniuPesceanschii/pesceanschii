package foglioRip;

import java.text.*;
import java.util.Locale;

public class FoglioRipTest {

    public static void main(String[] args) {

        FoglioRip f = new FoglioRip(3, 5, "verde");

        double area = f.calcArea();

        double diagonale = f.calcDiagonale();
        DecimalFormatSymbols formatysm_it = new DecimalFormatSymbols(Locale.ITALIAN);
        NumberFormat formatter_it = new DecimalFormat("###,###.##", formatysm_it);
        String str = formatter_it.format(diagonale);
        System.out.println(str);

        f.impostaAltezza(area);
        System.out.println(f.getAltezza());

        f.impostaBase(area);
        System.out.println(f.getBase());

        f.impostaColore("arancione");
        System.out.println(f.getColore());

        String s = f.stampa();
        System.out.println(s);
    }

}
