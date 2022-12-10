package abbonamentoMensile;

public class AbbonamentoMensile {

    private String meseCorr;

    public AbbonamentoMensile(String meseCorr) {
        this.meseCorr = meseCorr;
    }

    public String getMeseCorr() {
        return meseCorr;
    }

    public void setMeseCorr(String m) {
        meseCorr = m;
    }

    public String calcCosto(String nome, int eta, boolean sesso) {
        double costo = 0;
        String n = "";
        
        if (sesso == true) {
            if (eta > 10 && eta < 31) {
                costo = 10;
            } else if (eta > 30 && eta < 75) {
                costo = 18.50;
            }
        } else if (eta > 14 && eta < 31) {
            costo = 10;
        } else if (eta > 30 && eta < 70) {
            costo = 18.50;
        }

         n = "Nominativo: " + nome + "\nEtà: " + eta + "\nSesso: " + sesso
                + "\nNel mese di " + meseCorr + " il costo sarà di " + costo;
        return n;
    }

    public String stampa() {
        return "\nMese Corrente: " + meseCorr;
    }
}
