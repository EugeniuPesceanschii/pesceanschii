package pescaOggetti;

public class GommaRossa extends Gomme {

    public GommaRossa() {
        super("Dura", 1);
    }

    
    public GommaRossa(String tipoDurezza) {
        super(tipoDurezza, 1);
    }

    @Override
    public Integer getPunteggio() {
        return super.getPunteggio();
    }

    @Override
    public String getTipoDurezza() {
        return super.getTipoDurezza();
    }

    @Override
    public void setPunteggio(Integer punteggio) {
        super.setPunteggio(punteggio);
    }

    @Override
    public void setTipoDurezza(String tipoDurezza) {
        super.setTipoDurezza(tipoDurezza);
    }

    @Override
    public String toString() {
        return "Gomma Rossa" + "\nQuesta è una gomma rossa, quindi il punteggio non sarà +2 ma +1\n";
    }

}
