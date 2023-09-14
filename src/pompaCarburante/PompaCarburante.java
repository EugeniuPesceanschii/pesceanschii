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
        double cRimasto = 0;

        cRimasto = capacitàCisterna - carburanteVenduto;

        return cRimasto;
    }

    public double valCarbRimasto() {
        double valore = 0;

        valore = carbRimasto() * prezzoCarburante;

        return valore;
    }

    public double costoPieno() {
        double costo = 0;
        
        costo = capacitàCisterna * prezzoCarburante;
        
        return costo;
    }
    
    public String stampa() {
        return "Nome del distributore: " + nomeDistributore + "\nPrezzo Carburante: "
                + prezzoCarburante + "\nCapacità della cisterna: " + capacitàCisterna
                + "\nCarburante venduto: " + carburanteVenduto;
    }
}
