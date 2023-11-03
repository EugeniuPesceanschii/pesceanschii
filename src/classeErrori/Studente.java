package classeErrori;

public class Studente {

    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) throws Exception {
        setCognome(cognome);
        setNome(nome);
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

    public void setCognome(String cognome) throws Exception {
        controlloCognome(cognome);
    }

    public void setNome(String nome) throws Exception {
        controlloNome(nome);
    }

    @Override
    public String toString() {
        return "\nCognome e nome: " + cognome + " " + nome;
    }

    private void controlloNome(String nome) throws Exception {
        this.nome = nome;

        try {
            if (this.nome == null) {
                throw new Exception("Nome non è stato scritto");
            }
            if (Character.isLowerCase(nome.charAt(0))) {
                throw new Exception("Iniziale del nome minuscola, deve essere maiuscola");
            }
            if (Character.isDigit(nome.charAt(0))) {
                throw new Exception("Il nome non può contenere numeri");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("Il nome non è stato scritto");
        } catch (StringIndexOutOfBoundsException e){
            throw new StringIndexOutOfBoundsException("Nome non è stato scritto");
        }
    }

    private void controlloCognome(String cognome) throws Exception {
        this.cognome = cognome;
        try {
            if (this.cognome == null) {
                throw new Exception("Cognome non è stato scritto");
            }
            if (Character.isLowerCase(cognome.charAt(0))) {
                throw new Exception("Iniziale del cognome minuscola, deve essere maiuscola");
            }

            if (Character.isDigit(cognome.charAt(0))) {
                throw new Exception("Il cognome non può contenere numeri");
            }

        } catch (NullPointerException e) {
            throw new NullPointerException("Il cognome non è stato scritto");
        } catch (StringIndexOutOfBoundsException e){
            throw new StringIndexOutOfBoundsException("Cognome non è stato scritto");
        }
    }
}
