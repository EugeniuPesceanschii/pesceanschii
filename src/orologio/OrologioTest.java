package orologio;

public class OrologioTest {

    public static void main(String[] args) {
        
        Orologio o = new Orologio(23, 50, 50);
        
        OrologioDigitale od = new OrologioDigitale(true);
        
        OrologioCuCu oc = new OrologioCuCu();              
        
        Orologio[] orologi = new Orologio[] {o, od, oc};
        
        System.out.println(od.selezioneOrario());
       /*     
        System.out.println(o.toString());
        
        System.out.println(od.toString());
        
        System.out.println(oc.toString());
        
        o.aggiungiOre(5);
       
        System.out.println(o.toString());
        
        System.out.println(od.toString());
        
        System.out.println(oc.toString());*/
        
       
       
       
    }
    
}
