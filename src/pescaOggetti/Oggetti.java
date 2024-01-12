package pescaOggetti;

public class Oggetti {
    //aggregazione stretta
    private Integer punteggio;    
    
    public Oggetti(Integer punteggio) {
        this.punteggio = punteggio;
    }

    public void setPunteggio(Integer punteggio) {
        this.punteggio = punteggio;
    }

    public Integer getPunteggio() {
        return punteggio;
    }

    @Override
    public String toString() {
        return "Il punteggio è: " + punteggio;
    }
    
    
}
