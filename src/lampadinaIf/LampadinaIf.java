package lampadinaIf;

public class LampadinaIf {

    private String marca;
    private String coloreLuce;
    private int nMaxAccensioni;
    private int nVolteAccesa;
    private boolean stato;

    public LampadinaIf(String marca, String coloreLuce, int nMaxAccensioni,
            int nVolteAccesa, boolean stato) {
        this.marca = marca;
        this.coloreLuce = coloreLuce;
        this.nMaxAccensioni = nMaxAccensioni;
        this.nVolteAccesa = nVolteAccesa;
        this.stato = stato;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setColoreLuce(String c) {
        coloreLuce = c;
    }

    public String getColoreLuce() {
        return coloreLuce;
    }

    public void setNMaxAccensioni(int nma) {
        nMaxAccensioni = nma;
    }

    public int getNMaxAccensioni() {
        return nMaxAccensioni;
    }

    public void setNVolteAccesa(int nva) {
        nVolteAccesa = nva;
    }

    public int getNVolteAccesa() {
        return nVolteAccesa;
    }

    public void setStato(boolean s) {
        stato = s;
    }

    public boolean getStato() {
        return stato;
    }

    public String accendi() {
        String a = "";
        if (stato == false && nVolteAccesa < nMaxAccensioni) {

            stato = true;
            nVolteAccesa++;

            if (nVolteAccesa >= nMaxAccensioni - 10) {
                a = "La lampadina è stata accesa, potrà essere accesa altre "
                        + (nMaxAccensioni - nVolteAccesa)
                        + " volte prima di raggiungere il numero massimo\n di"
                        + " accensioni.";
            }
        } else //not (stato == false && nVolteAccesa < nMaxAccensioni) 
        {
            if (nVolteAccesa == nMaxAccensioni) {
                a = "La lampadina non può essere accesa perché ha raggiunto "
                        + "il numero massimo di accensioni";
            }
        }
        return a;
    }

    public void spegni() {
        stato = false;
    }

    public String stampa() {
        String s;
        s = "\nmarca: " + marca + "\ncoloreLuce: " + coloreLuce
                + "\nnMaxAccensioni: " + nMaxAccensioni + "\nnVolteAccesa: "
                + nVolteAccesa + "\nstato: " + stato;
        return s;
    }
}
