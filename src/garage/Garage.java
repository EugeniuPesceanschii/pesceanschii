package garage;

public class Garage {

    private Livello[] livelli;
    private int nPostiLiberi;

    public Garage() {
    }

    public Garage(Livello[] livelli, int nPostiLiberi) throws Exception {
        setLivelli(livelli);
        this.nPostiLiberi = nPostiLiberi;
    }

    public Livello[] getLivelli() {
        return livelli;
    }

    public int getnPostiLiberi() {
        return nPostiLiberi;
    }

    public void setLivelli(Livello[] livelli) throws Exception {
        if (livelli != null) {
            this.livelli = new Livello[livelli.length];

            for (int i = 0; i < livelli.length; i++) {
                this.livelli[i] = livelli[i];
            }
        }
        throw new Exception("Il parametro deve essere inizializzato!");
    }

    public void setnPostiLiberi(int nPostiLiberi) {
        this.nPostiLiberi = nPostiLiberi;
    }

    public Boolean entrataAuto() {
        nPostiLiberi--;
        return true;
    }

    public Boolean uscitaAuto() {
        nPostiLiberi++;
        return true;
    }

    @Override
    public String toString() {
        String t = "";

        for (int i = 0; i < livelli.length; i++) {
            t += livelli[i].toString();
        }
        return "Livelli: " + t + "\nNumero posti liberi: " + nPostiLiberi;

    }
}
