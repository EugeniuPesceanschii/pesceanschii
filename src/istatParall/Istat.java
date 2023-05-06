package istatParall;

public class Istat {

    private String[] regioni;
    private double[] pane;
    private double[] latte;

    public Istat(double[] latte, double[] pane, String[] regioni) {
        this.latte = copiaD(latte);
        this.pane = copiaD(pane);
        copiaS(regioni);
    }

    public String maxPane() {
        int indice = maxValore(pane);

        return "Costo del pane: " + pane[indice] + " Della regione: " + regioni[indice];
    }

    public String maxLatte() {
        int indice = maxValore(latte);

        return "Costo del latte: " + latte[indice] + " Della regione: " + regioni[indice];
    }

    public String maxBeni() {
        String testo = "Nessuna regione ha entrambi i prezzi più alti";
        int indice = maxValore(pane);

        if (indice == maxValore(latte)) {
            testo = regioni[indice] + " è la regione con entrambi i prezzi più alti\n";
        }
        return testo;
    }

    public String stampa() {
        String t = "";

         
        return t;
    }

    //Metodi private:
    private void copiaS(String[] regioni) {
        this.regioni = new String[regioni.length];

        for (int i = 0; i < regioni.length; i++) {
            this.regioni[i] = regioni[i];
        }
    }

    private double[] copiaD(double[] costo) {
        double[] array = new double[costo.length];

        for (int i = 0; i < costo.length; i++) {
            array[i] = costo[i];
        }
        return array;
    }

    private int maxValore(double[] costo) {
        double max = costo[0];
        int iReg = 0;

        for (int i = 1; i < costo.length; i++) {
            if (max < costo[i]) {
                max = costo[i];
                iReg = i;
            }
        }
        return iReg;
    }
}
