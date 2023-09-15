package pompaCarburante;

public class PompaCarburante {

    private String nomeDistributore;

    private double prezzoCarburante;

    private double capacitàCisterna;

    private double carburanteVenduto;

    public PompaCarburante(String nomeDistributore, double prezzoCarburante,
            double capacitàCisterna, double carburanteVenduto) {

        this.nomeDistributore = nomeDistributore;

        this.prezzoCarburante = prezzoCarburante;

        this.capacitàCisterna = capacitàCisterna;

        this.carburanteVenduto = carburanteVenduto;
    }

    public double riempiCisterna() {
        return capacitàCisterna;
    }

    public double carbRimasto() {
        return capacitàCisterna - carburanteVenduto;
    }

    public double valCarbRimasto() {
        return carbRimasto() * prezzoCarburante;
    }

    public double costoPieno() {
        return capacitàCisterna * prezzoCarburante;
    }
    
    public String stampa() {
        return "Nome del distributore: " + nomeDistributore + "\nPrezzo Carburante: "
                + prezzoCarburante + "\nCapacità della cisterna: " + capacitàCisterna
                + "\nCarburante venduto: " + carburanteVenduto;
    }
}
