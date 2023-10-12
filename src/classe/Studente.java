package classe;

public class Studente {
    private int matricola;
    private String cognomeNome;
    private int annoNascita;
    private String comuneResidenza;

    public Studente(int matricola, String cognomeNome, int annoNascita, String comuneResidenza) {
        this.matricola = matricola;
        this.cognomeNome = cognomeNome;
        this.annoNascita = annoNascita;
        this.comuneResidenza = comuneResidenza;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getCognomeNome() {
        return cognomeNome;
    }

    @Override
    public String toString() {
        return "\nMatricola: " + matricola + "\nCognome e Nome: " + cognomeNome + 
                "\nAnno della nascita: " + annoNascita + "\nComune di residenza: " + comuneResidenza;
    }
    
    
    
}
