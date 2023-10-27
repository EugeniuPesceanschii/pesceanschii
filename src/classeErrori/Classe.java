package classeErrori;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) {
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

    public void invertiAttributi(){
        
    }
    
    @Override
    public String toString() {
        String t = "";
        
        for(int i = 0; i < studenti.length; i++){
            t += "\n" + studenti[i].toString();
        }
        return "\nCapo classe: " + capoClasse + "\nStudenti: " + t;
    }
    
    private void controllo(){
        
    }
}
