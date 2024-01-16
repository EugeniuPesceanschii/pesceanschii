package persona2;

import java.util.ArrayList;

public class StudenteTest {

    public static void main(String[] args) {
        ArrayList<Float> voti = new ArrayList<>();
        try {
            Studente s = new Studente();

            s.aggiungiVoto(Float.valueOf(6));
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }

}
