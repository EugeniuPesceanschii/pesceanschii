package pescaOggetti;

public class Stilografica extends Penne {

    public Stilografica() {
        super("Stilografica", 5);
    }

    @Override
    public Integer getPunteggio() {
        return super.getPunteggio();
    }

    @Override
    public String getTipoPenna() {
        return super.getTipoPenna();
    }

    @Override
    public void setPunteggio(Integer punteggio) {
        super.setPunteggio(punteggio);
    }

    @Override
    public void setTipoPenna(String tipoPenna) {
        super.setTipoPenna(tipoPenna);
    }

    @Override
    public String toString() {
        return "Tipo di penna: " + getTipoPenna() + "\nOggetto speciale! Punteggio: +" + getPunteggio();
    }

}
