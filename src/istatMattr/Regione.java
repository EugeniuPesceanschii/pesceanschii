package istatMattr;

public class Regione {

    private String nome;
    private double[] beni;
    private String[] nomiBeni;

    public Regione(String nome, double[] beni, String[] nomiBeni) {
        this.nome = nome;

        this.beni = new double[beni.length];
        for (int i = 0; i < beni.length; i++) {
            this.beni = beni;
        }

        copiaS(nomiBeni);
    }

    public String getNome() {
        return nome;
    }

    public double getBene(String nome) {
        int iBene = 0;
        int i = 0;

        while (i >= 0) {
            if (nome.equals(nomiBeni[i])) {
                iBene = i;
                i = -1;
            } else {
                i++;
            }
        }

        return beni[iBene];
    }

    public double Max() {
        int i = maxValore(beni);

        return beni[i];
    }
    
    public String beneMax() {
        int i = maxValore(beni);

        return "Bene: " + nomiBeni[i] + " Costo: " + beni[i];
    }

    public String stampa() {
        String t = "";

        t = "nome Regione: " + nome;
        for (int i = 0; i < beni.length; i++) {
            t += "\nBene: " + nomiBeni[i] + " Costo: " + beni[i];
        }
        return t;
    }

    //Metodi private:
    private void copiaS(String[] descr) {
        this.nomiBeni = new String[descr.length];

        for (int i = 0; i < descr.length; i++) {
            this.nomiBeni[i] = descr[i];
        }
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
