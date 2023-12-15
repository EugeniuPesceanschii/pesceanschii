package pesceanschii;

import data.Data;

public class Persona {

    private String cognome;
    private String nome;
    private Data dataDiNascita;
    protected static int numeroIstanze;

    public Persona() {
        numeroIstanze++;
    }

    public Persona(String cognome, String nome, Data dataDiNascita) {
        this();
        this.cognome = cognome;
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    final public void setDataDiNascita(Data dataDiNascita) throws Exception{
        if (dataDiNascita != null) {
            Data data = new Data(dataDiNascita);

            Data dataOdierna = new Data();

            if (Data.differenzaInAnni(data, dataOdierna) >= 0) {
                this.dataDiNascita = data;
            } else {
                throw new Exception ("La data di nascita non può essere successiva"
                        + " a quella attuale");
            }
        } else {
            
        }
    }

    public Boolean verificaOmonimia(Persona persona) {
        Boolean ris = false;

        if (persona.getCognome().equals(cognome)
                && persona.getNome().equals(nome)) {
            ris = true;
        }

        return ris;
    }

    public Integer calcolaEta() throws Exception {
        Data data = new Data();

        return Data.differenzaInAnni(dataDiNascita, data);
    }

    public String info() {
        return "Cognome        : " + cognome + "\nNome           : " + nome
                + "\nData di nascita: " + dataDiNascita.toString();
    }

    private void controlloNominativi(String nominativo) throws Exception {
        if (nominativo == null || nominativo.isEmpty()) {
            throw new Exception("La stringa non è inizializzata");
        }
        char c = nominativo.charAt(0);
        if (Character.isLowerCase(c)) {
            throw new Exception("Il nominativo non può iniziare con la minuscola");
        }

    }

}
