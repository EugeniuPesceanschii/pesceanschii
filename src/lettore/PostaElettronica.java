package lettore;

public class PostaElettronica implements LetturaMessaggio {
    
    private String testo;
    private String mittente;
    private String oggetto;

    public PostaElettronica(String testo, String mittente, String oggetto) {
        this.testo = testo;
        this.mittente = mittente;
        this.oggetto = oggetto;
    }

    @Override
    public String getTesto() {
        return testo;
    }
    
    @Override
    public String leggiTesto(){
        return "Il mittente è: " + mittente + "\n"
             + "L'oggetto è: " + oggetto + "\n"
             + getTesto();
    }

    @Override
    public String toString() {
        return "Mittente: " + mittente + "\nOggetto: " + oggetto + "\nTesto dell'email: " + testo;
    }
}
