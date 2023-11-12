package classeErrori;

public class Classe {

    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) throws Exception {
        this.capoClasse = capoClasse;
        this.studenti = studenti;
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public void invertiAttributi() throws Exception {
        String s = "";

        for (int i = 0; i < studenti.length; i++) {
            s = studenti[i].getCognome();
            studenti[i].setCognome(studenti[i].getNome());
            studenti[i].setNome(s);
        }
    }

    public void ordinaPerNome() throws Exception {
        for(int i = 0; i < studenti.length; i++){
            studenti[i].getNome().charAt(0);
        }
    }

    @Override
    public String toString() {
        String t = "";

        for (int i = 0; i < studenti.length; i++) {
            t += "\n" + studenti[i].toString();
        }
        return "\nCapo classe: " + capoClasse + "\nStudenti: " + t;
    }
    
    private void shift(int pos){
        for(int i = pos; i < studenti.length; i++){
            studenti[i] = studenti[i + 1];
        }
    }
}
