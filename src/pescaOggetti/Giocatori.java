package pescaOggetti;

public class Giocatori {
    //aggregazione lasca
    private String nome;
    private Integer punteggio;
    private Oggetti[] oggettiPescati;

    public Giocatori() {
        
    }

    public Giocatori(String nome, Integer punteggio, Oggetti[] oggettiPescati) {
        this.nome = nome;
        this.punteggio = punteggio;
        this.oggettiPescati = oggettiPescati;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Oggetti[] getOggettiPescati() {
        return oggettiPescati;
    }

    public void setOggettiPescati(Oggetti[] oggettiPescati) {
        this.oggettiPescati = oggettiPescati;
    }

    public Integer getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(Integer punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
}
