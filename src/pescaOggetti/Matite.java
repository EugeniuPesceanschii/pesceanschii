package pescaOggetti;

public class Matite extends Oggetti {

    private String tipoMatita;

    public Matite(String tipo) {
        super(1);
        this.tipoMatita = tipo;
    }

    @Override
    public Integer getPunteggio() {
        return super.getPunteggio();
    }

    @Override
    public void setPunteggio(Integer punteggio) {
        super.setPunteggio(punteggio);
    }

    @Override
    public String toString() {
        return "Tipo della matita: " + tipoMatita + "\nAumenta il punteggio di: +" + getPunteggio();
    }

}
