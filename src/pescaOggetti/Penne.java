package pescaOggetti;

public class Penne extends Oggetti {
    
    private String tipoPenna;

    public Penne(String tipoPenna, Integer punteggio) {
        super(4);
        this.tipoPenna = tipoPenna;
    }

    @Override
    public Integer getPunteggio() {
        return super.getPunteggio(); 
    }

    public String getTipoPenna() {
        return tipoPenna;
    }

    @Override
    public void setPunteggio(Integer punteggio) {
        super.setPunteggio(punteggio); 
    }

    public void setTipoPenna(String tipoPenna) {
        this.tipoPenna = tipoPenna;
    }

    @Override
    public String toString() {
        return "Tipologia di penna: " + tipoPenna + "\nPunteggio di questo oggetto: +" + getPunteggio();
    }

    
}
