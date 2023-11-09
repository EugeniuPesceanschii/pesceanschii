package orologio;

public class OrologioDigitale extends Orologio {

    private boolean espressOrario;

    public OrologioDigitale(boolean espressOrario) {
        super(11, 30, 50);
        this.espressOrario = espressOrario;
    }

    public void setEspressOrario(boolean espressOrario) {
        this.espressOrario = espressOrario;
    }

    public String selezioneOrario() {
        String t = "";
        if (espressOrario) {
            t = ritornaOrario() + " am";
        } else {
            t = dammiOrario();
        }

        return t;
    }

    public String ritornaOrario() {
        String t = "";

        while (getSecondi() > 60) {
            setSecondi(getSecondi() - 60);
            setMinuti(getMinuti() + 1);
        }
        while (getMinuti() > 60) {
            setMinuti(getMinuti() - 60);
            setOra(getOra() + 1);
        }
        while (getOra() > 12) {
            setOra(getOra() - 12);
        }

        if (getOra() == 12) {
            setOra(0);
        }

        t = getOra() + ":" + getMinuti() + ":" + getSecondi();

        return t;
    }

}
