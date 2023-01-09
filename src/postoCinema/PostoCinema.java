package postoCinema;

public class PostoCinema {

    private int posti;
    private int postiPren;

    public PostoCinema(int p, int pPren) {
        this.posti = p;
        this.postiPren = pPren;
    }

    public void setPosti(int p) {
        posti = p;
    }

    public int getPosti() {
        return posti;
    }

    public void setPostiPren(int pPren) {
        postiPren = pPren;
    }

    public int getPostiPren() {
        return postiPren;
    }

    public String prezzoPren(int gSettimana, boolean stud, int costo) {
        String p;
        costo = 5;

        if (stud == true && gSettimana == 4) {
            costo = 0;
        } else 
            if (stud == true && gSettimana >= 5 && gSettimana <= 7) {
                costo = 7;
            } else 
                if (stud == false && gSettimana >= 1 && gSettimana <= 3) {
                    costo = 7;
                } else 
                    if (stud == false && gSettimana == 4) {
                        costo = 3;
                    } else 
                        if (stud == false && gSettimana >= 5 && gSettimana <= 7) {
                            costo = 10;
                        }
        p = "Il costo della prenotazione è: " + costo;

        return p;
    }
}
