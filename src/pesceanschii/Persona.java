package pesceanschii;

public class Persona {

    private String cognome;
    private String nome;
    private Data dataDiNascita;
    protected static int numeroIstanze;

    public Persona() {
        numeroIstanze++;
    }

    public Persona(String cognome, String nome, Data dataDiNascita) throws Exception {
        this();
        setCognome(cognome);
        setNome(nome);
        setDataDiNascita(dataDiNascita);
    }

    public void setCognome(String cognome) throws Exception {
        controlloNominativi(cognome);
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public final void setNome(String nome) throws Exception {
        controlloNominativi(nome);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataDiNascita(Data dataDiNascita) throws Exception {
        if (dataDiNascita == null) {
            throw new Exception("La data di nascita è nulla, cambiala");
        } else {
            this.dataDiNascita = dataDiNascita;
        }
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }

    public Boolean verificaOmonomia(Persona persona) {
        Boolean ris = false;
        if (nome.equals(persona.getNome()) && cognome.equals(persona.getCognome())) {
            ris = true;
        }
        return ris;
    }

    public Integer calcolaEta() throws Exception {
        Data dataOggi = new Data();

        return dataDiNascita.differenzaInAnni(dataDiNascita, dataOggi);
    }

    public String info() throws Exception {
        String t = "";
        try {
            t = "Cognome         :" + cognome
                    + "\nNome            :" + nome
                    + "\nData di nascita :" + dataDiNascita.toString();
        } catch (NullPointerException e) {
            throw new Exception("Almeno uno degli attributi è null, cambiali");
        }
        return t;
    }

    private void controlloNominativi(String nominativo) throws Exception {
        if (nominativo == null) {
            throw new NullPointerException("Il nominativo è nullo, cambialo");
        } else if (nominativo.isEmpty()) {
            throw new Exception("Il nominativo non può essere vuoto");
        } else {
            String[] split = nominativo.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (Character.isLowerCase(split[i].charAt(0))) {
                    throw new Exception("La prima lettera sia del primo che del secondo nome dev'essere maiuscola");
                } else {
                    for (int j = 0; j < split[i].length(); j++) {
                        if (!Character.isLetter(split[i].charAt(j))) {
                            throw new Exception("Il nominativo può essere composto solamente da lettere");
                        }
                    }
                }
            }
        }
    }
}
