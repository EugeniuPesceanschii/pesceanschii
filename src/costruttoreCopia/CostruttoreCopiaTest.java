package costruttoreCopia;

public class CostruttoreCopiaTest {

    public static void main(String[] args) {
        
        String[] s = new String[9];
        CostruttoreCopia c = new CostruttoreCopia(s);
        
        System.out.println(c.stampa());    
    }
}