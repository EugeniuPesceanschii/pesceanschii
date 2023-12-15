package garage;

public class Posto extends Livello {
    
    private String codice;
    private double tariffa;

    public Posto() throws Exception {
    }

    public Posto(String codice, double tariffa) throws Exception {
        this.codice = codice;
        this.tariffa = tariffa;
    }

    public Posto(String codice, double tariffa, Posto[] posti, Livello[] livelli, int nPostiLiberi) throws Exception {
        super(posti, livelli, nPostiLiberi);
        this.codice = codice;
        this.tariffa = tariffa;
    }
    
    
}
