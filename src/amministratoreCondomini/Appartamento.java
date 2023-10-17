package amministratoreCondomini;

public class Appartamento {
    private int nAppartamento;
    private String nomeProprietario;
    private double millesimi;

    public Appartamento(int nAppartamento, String nomeProprietario, double millesimi) {
        this.nAppartamento = nAppartamento;
        this.nomeProprietario = nomeProprietario;
        this.millesimi = millesimi;
    }

    public Appartamento(Appartamento a) {
        this.nAppartamento = a.nAppartamento;
        this.nomeProprietario = a.nomeProprietario;
        this.millesimi = a.millesimi;
    }

    public int getnAppartamento() {
        return nAppartamento;
    }

    public double getMillesimi() {
        return millesimi;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    @Override
    public String toString() {
        return "\nNumero appartamento: " + nAppartamento + "\nNome del proprietario: " +
                nomeProprietario + "\nMillesimi del appartamento: " + millesimi;
    }
}
