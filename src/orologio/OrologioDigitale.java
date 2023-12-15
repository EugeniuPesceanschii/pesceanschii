package orologio;

public class OrologioDigitale extends Orologio {

    private boolean espressOrario; //Se true, formato 12h, se false, formato 24h

    public OrologioDigitale(boolean espressOrario) {
        super(13, 30, 50);
        this.espressOrario = espressOrario;
    }

    public OrologioDigitale() {
        super(null);
    }
  
    public void setEspressOrario(boolean espressOrario) {
        this.espressOrario = espressOrario;
    }

    public String selezioneOrario() {
        String t = "";
        if (espressOrario) {
            if(getOra() <= 12){
            t = ritornaOrario() + " am";
            } else {
                t = ritornaOrario() + " pm";
            }
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
