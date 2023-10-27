package classeErrori;

public class ClasseTest {

    public static void main(String[] args) {
        try{
            Studente s = new Studente("pesceanschii", "Eugeniu");
            
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
