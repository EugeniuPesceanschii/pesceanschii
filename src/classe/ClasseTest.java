package classe;

public class ClasseTest {

    public static void main(String[] args) {
        Studente s = new Studente(15, "Pesceanschii Eugeniu", 2005, "Trento");
        
        Studente[] studenti = new Studente[20];
        for(int i = 0; i < studenti.length; i++){
            studenti[i] = new Studente(i + 1, "Cognome nome", 2005, "Trento");
        }
        studenti[15] = s;
        
        Classe c = new Classe(studenti);
        
        System.out.println(s.toString());
        
        System.out.println(c.toString());
    }
    
}
