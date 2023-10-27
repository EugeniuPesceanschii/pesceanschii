package classeErrori;

public class Studente {

    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) throws Exception {
        this.cognome = cognome;
        this.nome = nome;
    }

    public Studente(Studente studente) throws Exception {
        cognome = studente.cognome;
        nome = studente.nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) throws Exception{
        controllo();
    }

    public void setNome(String nome) throws Exception{
         controllo();
    }

    @Override
    public String toString() {
        return "\nCognome e nome: " + cognome + " " + nome;
    }

    private void controllo() throws Exception {
        try {
            if (!Character.isLowerCase(cognome.charAt(0))) {
                throw new Exception("Iniziale del cognome minuscola, deve essere maiuscola");
            }
            
            if (!Character.isLowerCase(nome.charAt(0))) {
                throw new Exception("Iniziale del nome minuscola, deve essere maiuscola");
            }
        } catch (Exception e) {
            throw new Exception("Cognome scritto in modo errato");
        }
    }
}
