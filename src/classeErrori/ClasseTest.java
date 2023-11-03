package classeErrori;

public class ClasseTest {

    public static void main(String[] args) {

        try {
            Studente s = new Studente("Pesceanschii", "Eugeniu");
            Studente s1 = new Studente("Ciriu", "George");
            Studente s2 = new Studente("Tomaq", "Paolo");
            Studente s3 = new Studente("Vener", "Davide");
            Studente s4 = new Studente("Rondi", "Andrea");
            Studente s5 = new Studente("Yurus", "Andrei");
            Studente s6 = new Studente("Ionki", "Ambra");
//     System.out.println(s.toString());
            Studente[] stud = new Studente[7];

            stud[0] = s;
            stud[1] = s1;
            stud[2] = s2;
            stud[3] = s3;
            stud[4] = s4;
            stud[5] = s5;
            stud[6] = s6;

            Classe c = new Classe(s, stud);

            c.invertiAttributi();
            System.out.println(c.toString());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
