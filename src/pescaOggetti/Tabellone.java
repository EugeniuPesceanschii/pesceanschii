package pescaOggetti;

public class Tabellone {

    //aggregazione stretta
    private Celle[][] celle;

    public Tabellone() {

    }

    public Tabellone(Celle[][] celle) {
        int nRighe = celle.length;
        int nColonne = celle[0].length;

        for (int i = 0; i < nRighe; i++) {
            for (int j = 0; j < nColonne; j++) {
                this.celle[i][j] = celle[i][j];
            }
        }
    }

    public Celle[][] getCelle() {
        return celle;
    }

    public void setCelle(Celle[][] celle) {
        this.celle = celle;
    }

    @Override
    public String toString() {
        int nRighe = celle.length;
        int nColonne = celle[0].length;
        String t = "";

        for (int i = 0; i < nRighe; i++) {
            for (int j = 0; j < nColonne; j++) {
                t += "(" + i + ")" + "(" + j + "): " + celle[i][j].toString() + "\t";
            }
            t += "\n";
        }
        return t;
    }
}
