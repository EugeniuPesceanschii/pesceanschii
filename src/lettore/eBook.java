package lettore;

public class eBook extends Lettore{
    
    private String nome;
    private int nPagine;

    public eBook(String nome, int nPagine, String testo) {
        super(testo);
        this.nome = nome;
        this.nPagine = nPagine;
    }

    @Override
    public String leggiTesto() {
        return "Testo: " + getTesto();
    }

    @Override
    public String toString() {
        return "Nome del libro: " + nome + "\nIl libro ha " + nPagine + " pagine"
                + "\nTesto del libro: " + getTesto();
    }
    
    
}
