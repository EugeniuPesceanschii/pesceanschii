package lettore;

public abstract class Lettore {
    
    private String testo;

    public Lettore(String testo) {
        this.testo = testo;
    }
    
    public abstract String leggiTesto();

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Il testo da leggere è: " + testo;
    }
    
    
}
