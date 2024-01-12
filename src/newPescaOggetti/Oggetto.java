package newPescaOggetti;

/**
 *
 * @author Eugeniu
 */
public abstract class Oggetto {

    private int punteggio;

    public Oggetto() {

    }

    public Oggetto(int punteggio) {
        this.punteggio = punteggio;
    }

    public abstract void setPunteggio(int punteggio);

    public abstract int getPunteggio();

    @Override
    public abstract String toString();

}
