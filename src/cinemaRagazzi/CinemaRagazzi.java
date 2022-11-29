package cinemaRagazzi;

public class CinemaRagazzi {

    private double costo;

    public CinemaRagazzi(double costo) {
        this.costo = costo;
    }

    public void setCosto(double c) {
        costo = c;
    }

    public double getCosto() {
        return costo;
    }

    public double calcCosto(int nRagazzi) {
        double cTotale = 0;
        if (nRagazzi < 4) {
            cTotale = (costo * nRagazzi * 95 / 100);
        } else if (nRagazzi >= 4 && nRagazzi <= 8) {
            cTotale = (costo * nRagazzi * 90 / 100);
        } else if (nRagazzi > 12) {
            cTotale = (costo * nRagazzi * 85 / 100);
        }
        return cTotale;
    }

    public double costoStud(int nRagazzi, double cTotale) {
        double cStud = 0;
        cStud = (cTotale / nRagazzi);
        return cStud;
    }

    public String stampa() {
        String s;
        s = "costo: " + costo;
        return s;
    }
}
