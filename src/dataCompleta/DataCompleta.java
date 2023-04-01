package dataCompleta;

public class DataCompleta {

    private int anno;
    private int mese;
    private int giorno;
    private int[] giorniMese;

    public DataCompleta(int g, int m, int a) {
        anno = a;
        mese = m;
        giorno = g;
        setGiorniMese();
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }
    
    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    } 
   
    public void setGiorniMese() {
        giorniMese = new int[13];
        for (int i = 0; i < 13; i++) {
            switch (i) {
                case 2:
                    if (isBisestile() == true) {
                        giorniMese[i] = 29;
                    } else {
                        giorniMese[i] = 28;
                    }
                    break;
                case 4:
                    giorniMese[i] = 30;
                    break;
                case 6:
                    giorniMese[i] = 30;
                    break;
                case 9:
                    giorniMese[i] = 30;
                    break;
                case 11:
                    giorniMese[i] = 30;
                    break;
                default:
                    giorniMese[i] = 31;
                    break;
            }
        }
    }

    public String aggiungiGiorni(int giorni) {
        String nuovaData = "";
        int gg = giorno;
        int m = mese;
        int a = anno;

        gg += giorni;

        while (gg > giorniMese[m]) {
            gg -= giorniMese[m];
            m++;
            if (m > 12) {
                m = 1;
                a++;
            }
            if (bisestile(a) == true) {
                giorniMese[2] = 29;
            } else {
                giorniMese[2] = 28;
            }
        }

        nuovaData = gg + "/" + m + "/" + a;
        return nuovaData;
    }

    public int diffData(DataCompleta data){
        int differenza = 0;
        int gg = data.getGiorno();
        int m = data.getMese();
        int a = data.getAnno();
        
        
        return differenza;
    }
    
    public String domani() {
        String giornoDopo = "";
        int gg = giorno;
        int m = mese;
        int a = anno;

        if (mese == 12 && giorno == giorniMese[mese]) {
            a++;
            m = 1;
            gg = 1;
        } else if (giorno == giorniMese[mese]) {
            gg = 1;
            m++;
        } else {
            gg++;
        }
        giornoDopo = gg + "/" + m + "/" + a;
        return giornoDopo;
    }

    public String ieri() {
        String giornoPrima = "";
        int gg = giorno;
        int m = mese;
        int a = anno;

        if (mese == 1 && giorno == 1) {
            a--;
            m = 12;
            gg = giorniMese[m];
        } else if (giorno == 1) {
            m--;
            gg = giorniMese[m];
        } else {
            gg--;
        }
        giornoPrima = gg + "/" + m + "/" + a;
        return giornoPrima;
    }

    private boolean bisestile(int anno) {
        boolean bisestile = false;

        if ((anno % 400) == 0) {
            bisestile = true;
        } else if ((anno % 4) == 0 && (anno % 100) != 0) {
            bisestile = true;
        }

        return bisestile;
    }

    public boolean isBisestile() {

        return bisestile(anno);
    }

    public String formattaData() {
        String data = "";

        data = giorno + "/" + mese + "/" + anno;
        return data;
    }
}
