package pescaOggetti;

public class Forbici extends Oggetti {

    private String tipoPunta;

    public Forbici() {
        super(1);
    }

    public Forbici(String tipoPunta) {
        super(1);
        this.tipoPunta = tipoPunta;
    }

    @Override
    public Integer getPunteggio() {
        return super.getPunteggio();
    }

    public String getTipoPunta() {
        return tipoPunta;
    }

    @Override
    public void setPunteggio(Integer punteggio) {
        super.setPunteggio(punteggio);
    }

    public void setTipoPunta(String tipoPunta) {
        this.tipoPunta = tipoPunta;
    }

    @Override
    public String toString() {
        return "Forbici" + "\nIl tipo di punta è: " + tipoPunta + "\nPunteggio di questo oggetto: "
                + "+1" + " per il giocatore che ha pescato, -1 per gli altri";
    }

}
