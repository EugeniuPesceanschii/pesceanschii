package persona2;

import java.util.ArrayList;

public class StudenteTest {

    public static void main(String[] args) {
        ArrayList<Float> voti = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            voti.add(Float.valueOf(i));
        }
        
        try {
            Studente s = new Studente(voti);

            s.aggiungiVoto(Float.valueOf(7));
            System.out.println(s.info());
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }

}
