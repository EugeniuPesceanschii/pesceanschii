package orologio;

public class OrologioTest {

    public static void main(String[] args) {
        
        Orologio o = new Orologio(23, 50, 50);
        
        OrologioDigitale od = new OrologioDigitale(true);
        
        OrologioCuCu oc = new OrologioCuCu();
        
        System.out.println(o.dammiOrario());
        
        System.out.println(od.selezioneOrario());
        
        System.out.println(oc.AccCarillon());
    }
    
}
