package lettore;

public class eMail extends Lettore {
    
    private String mittente;
    private String oggetto;

    public eMail(String mittente, String oggetto, String testo) {
        super(testo);
        this.mittente = mittente;
        this.oggetto = oggetto;
    }

    @Override
    public String leggiTesto() {
        return "Il mittente è: " + mittente + "\nL'oggetto della mail è: " + oggetto
                + "\nIl testo dell'email è: " + getTesto();
    }

    @Override
    public String toString() {
        return "Il mittente è: " + mittente + "\nL'oggetto della mail è: " + oggetto;
    }
    
    
    
    
}
