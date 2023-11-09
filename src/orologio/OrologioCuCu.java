package orologio;

public class OrologioCuCu extends Orologio {

    public OrologioCuCu() {
        super(0, 0, 0);
    }

    public String AccCarillon() {
        boolean acceso = false;
        String t = "";

        if (getMinuti() == 0 && getSecondi() == 0) {
            acceso = true;
        }
        if (acceso) {
            t = "Il carillon è acceso";
        } else {
            t = "Il carillon è spento";
        }
        return t;
    }

}
