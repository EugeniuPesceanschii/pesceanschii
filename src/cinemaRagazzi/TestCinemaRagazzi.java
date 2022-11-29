package cinemaRagazzi;

import java.text.*;
import java.util.Locale;

public class TestCinemaRagazzi {

    public static void main(String[] args) {
        
        CinemaRagazzi c = new CinemaRagazzi(7);
        
        double cTotale = c.calcCosto(8);
        DecimalFormatSymbols formatysm_it = new DecimalFormatSymbols(Locale.ITALIAN);
        NumberFormat formatter_it = new DecimalFormat("###,###.##", formatysm_it);
        String str = formatter_it.format(cTotale);
        System.out.println(str);
        
        double cStud = c.costoStud(8, cTotale);
        DecimalFormatSymbols formatism_it = new DecimalFormatSymbols(Locale.ITALIAN);
        NumberFormat formater_it = new DecimalFormat("###,###.##", formatism_it);
        String sr = formater_it.format(cStud);
        System.out.println(sr);
    }
}
