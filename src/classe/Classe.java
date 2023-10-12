package classe;

public class Classe {

    private Studente[] studenti;
    private int nStudenti;
    private int capienza;

    public Classe(Studente[] s) {
        this.studenti = s;
        this.nStudenti = s.length;
        this.capienza = s.length;
    }

    public void addStudente(Studente s) {
        if (nStudenti < capienza) {
            studenti[nStudenti] = s;
            nStudenti++;
        }
    }

    public void cancStudente(Studente s) {
        for (int i = 0; i < studenti.length && nStudenti != nStudenti - 1; i++) {
            if (s == studenti[i]) {
                shift(i);
                nStudenti--;
            }
        }
    }

    public int totStudenti() {
        return studenti.length;
    }

    public Studente trovaStudente(int matricola) { //Trova lo studente per matricola e restituisce tutte le sue informazioni
        return studenti[cercaStudente(matricola)];
    }

    @Override
    public String toString() {
        String t = "";
        for (int i = 0; i < studenti.length; i++) {
            t += "\n" + studenti[i].toString();
        }
        return "\nStudenti: " + t + "\nNumero studenti: " + nStudenti
                + "\nNumero massimo studenti: " + capienza;
    }

    private int cercaStudente(int matricola) { //Trova lo studente per matricola e restituisce la sua posizione nell'array di studenti
        int pos = 0;
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i].getMatricola() == matricola) {
                pos = i;
            }
        }
        return pos;
    }

    private void shift(int indice) {
        for (int i = indice; i < studenti.length; i++) {
            studenti[i] = studenti[i + 1];
        }
    }
}
