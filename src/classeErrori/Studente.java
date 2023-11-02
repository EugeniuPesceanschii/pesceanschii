package classeErrori;

import java.io.CharConversionException;

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
        controllo(cognome);
    }

    public void setNome(String nome) throws Exception {
        controllo(nome);
    }

    @Override
    public String toString() {
        return "\nCognome e nome: " + cognome + " " + nome;
    }

    private void controllo(String nomeOcognome) throws Exception {
        try {
            if (Character.isLowerCase(nomeOcognome.charAt(0))) {
                throw new Exception("Iniziale del cognome minuscola, deve essere maiuscola");
            } else {
                this.cognome = nomeOcognome;
            }

            if (Character.isLowerCase(nomeOcognome.charAt(0))) {
                throw new Exception("Iniziale del nome minuscola, deve essere maiuscola");
            } else {
                this.nome = nomeOcognome;
            }
        } catch (CharConversionException e) {
            throw new CharConversionException("Cognome o nome scritto in modo errato");
        } 
    }
}
