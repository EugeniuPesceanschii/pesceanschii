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

    public boolean invertiAttributi() throws Exception {
        Studente s;
        for (int i = 0; i < studenti.length; i++) {
            s = studenti[i];
            studenti[i].setCognome(studenti[i].getNome());
            studenti[i].setNome(s.getCognome());
        }
        return true;
    }

    public void ordinaPerNome() {

    }

    @Override
    public String toString() {
        String t = "";

        for (int i = 0; i < studenti.length; i++) {
            t += "\n" + studenti[i].toString();
        }
        return "\nCapo classe: " + capoClasse + "\nStudenti: " + t;
    }

    private void controllo() {

    }
}
