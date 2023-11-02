package classeErrori;

public class ClasseTest {

    public static void main(String[] args) {
        try{
            Studente s = new Studente("Pesceanschii", "eugeniu");
            
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
