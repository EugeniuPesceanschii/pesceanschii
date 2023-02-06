package countdown;

public class Countdown {

    private int numPartenza;

    public Countdown(int n) {
        setNumPartenza(n);
    }

    public String conta() {
        String t = "";
        int cont = numPartenza;

        while (cont >= 0) {
            t += decodificatore(cont);
            cont--;
        }
        return t;
    }

    private String decodificatore(int cont) {
        String t = "";
        switch (cont) {
            case 0:
                t = "  ***\n"
                  + " ** **\n"
                  + "**   **\n"
                  + "**   **\n"
                  + "**   **\n"
                  + " ** **\n"
                  + "  ***\n";
                break;
                
            case 1:
                t = "   ***\n"
                  + "  ****\n"
                  + " ** **\n"
                  + "**  **\n"
                  + "    **\n"
                  + "    **\n"
                  + "    **\n";
                break;
                        default:
                             
                        }
        t += "\n\n";
        return t;
    }

    public final void setNumPartenza(int n) {
        numPartenza = n;
    }

    public int getNumPartenza() {
        return numPartenza;
    }

    public String stampa() {
        String s;

        s = "Il numero di partenza è: " + numPartenza;

        return s;
    }
}
