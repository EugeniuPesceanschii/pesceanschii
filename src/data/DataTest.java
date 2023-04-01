package data;

public class DataTest {

    public static void main(String[] args) {
        Data d = new Data(1, 1, 2022);
        
        System.out.println(d.domani());
        
        System.out.println(d.ieri());
        
        System.out.println(d.isBisestile());
        
        System.out.println(d.formattaData());

    }
    
}
