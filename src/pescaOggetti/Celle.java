package pescaOggetti;

public class Celle extends Tabellone {

    private Boolean isLibera;
    private Oggetti oggetto;

    public Celle(Boolean isLibera, Oggetti oggetto) {
        super();
        this.isLibera = isLibera;
        this.oggetto = oggetto;
    }

    public Boolean getIsLibera() {
        return isLibera;
    }

    public void setIsLibera(Boolean isLibera) {
        this.isLibera = isLibera;
    }

    public Oggetti getOggetto() {
        return oggetto;
    }

    public void setOggetto(Oggetti oggetto) {
        this.oggetto = oggetto;
    }

    @Override
    public String toString() {
        return "è libera?" + isLibera + "\nOggetto: " + oggetto.toString();
    }

}
