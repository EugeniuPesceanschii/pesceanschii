package garage;

public class Livello extends Garage {

    private Posto[] posti;

    public Livello() throws Exception {
        super(null, 0);
    }

    public Livello(Posto[] posti, Livello[] livelli, int nPostiLiberi) throws Exception {
        super(livelli, nPostiLiberi);
        this.posti = posti;
    }

    public Posto[] getPosti() {
        return posti;
    }

    public void setPosti(Posto[] posti) throws Exception {
        if (posti != null) {
            this.posti = new Posto[posti.length];

            for (int i = 0; i < posti.length; i++) {
                this.posti[i] = posti[i];
            }
        }
        throw new Exception("Il parametro deve essere inizializzato!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
