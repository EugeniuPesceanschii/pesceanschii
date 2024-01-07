package pescaOggetti;

public class Gomme extends Oggetti {

    private String tipoDurezza;

    public Gomme() {
        super(2);
    }

    public Gomme(String tipoDurezza, Integer punteggio) {
        super(2);
        this.tipoDurezza = tipoDurezza;
    }

    @Override
    public Integer getPunteggio() {
        return super.getPunteggio();
    }

    public String getTipoDurezza() {
        return tipoDurezza;
    }

    @Override
    public void setPunteggio(Integer punteggio) {
        super.setPunteggio(punteggio);
    }

    public void setTipoDurezza(String tipoDurezza) {
        this.tipoDurezza = tipoDurezza;
    }

    @Override
    public String toString() {
        return "Gomma" + "\nLa durezza della gomma: " + tipoDurezza + "\nPunteggio di questo "
                + "oggetto è: +" + getPunteggio();
    }
}
