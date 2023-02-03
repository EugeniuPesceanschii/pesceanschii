package countdown;

public class Countdown {

    private int numPartenza;

    public Countdown(int n) {
        this.numPartenza = n;
    }

    public String conta() {
        String t = "";

        while (numPartenza >= 0) {
            t += "\n" + numPartenza;
            numPartenza--;
        }
        return t;
    }

    public void setNumPartenza(int n) {
        numPartenza = n;
    }

    public int getNumPartenza() {
        return numPartenza;
    }

    public String stampa() {
        String s = "";

        s = "Il numero di partenza è: " + numPartenza;

        return s;
    }
}
