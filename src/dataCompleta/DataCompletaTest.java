package dataCompleta;

public class DataCompletaTest {

    public static void main(String[] args) {
        DataCompleta d = new DataCompleta(1, 1, 2024);
        
        System.out.println(d.aggiungiGiorni(1096));
        
        System.out.println(d.diffData());
        
        /*System.out.println(d.domani());
        
        System.out.println(d.ieri());
        
        System.out.println(d.isBisestile());
        
        System.out.println(d.formattaData());*/
    }  
}
