package pesceanschii;

import data.Data;
import java.util.Objects;

public class Studente extends Persona {

    final private String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente() {
        super();
    }

    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome,
            Data dataDiNascita) throws Exception {
        setClasse(classe);
        this.isRipetente = isRipetente;
        super.setCognome(cognome);
        super.setNome(nome);
        super.setDataDiNascita(dataDiNascita);

        voti = new Float[10];
        for (int i = 0; i < voti.length; i++) {
            voti[i] = Float.valueOf(0);
        }
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) throws Exception {
        if (classe != null && classe >= 1 && classe <= 5) {
            this.classe = classe;
        } else {
            throw new Exception("La classe inserita è sbagliata. Inserisci "
                    + "una classe tra 1 e 5");
        }
    }

    public Boolean getIsRipetente() {
        return isRipetente;
    }

    public Float[] getVoti() {
        return voti;
    }

    public void setVoti(Float[] voti) {
        this.voti = voti;
    }

    public Boolean verificaOmonimia(Studente studente) {
        Boolean ris = false;

        if (Objects.equals(studente.getClasse(), classe)
                && studente.getCognome().equals(super.getCognome())
                && studente.getNome().equals(super.getNome())) {
            ris = true;
        }

        return ris;
    }

    public void aggiungiVoto(Float voto) {
        if (voto != null) {
            voti[voti.length - voto.intValue()] = voto;
        }
    }

    public void rimuoviVoto(Integer posizione) {
        if (posizione != null) {
            voti[posizione] = null;
        }
    }

    public Boolean promuovi() {
        Boolean ris = false;
       
        if (classe < 5) {
            classe++;
            ris = true;
        }

        return ris;
    }

    public Boolean promuovi(Integer numeroClassi) {
        Boolean ris = false;

        if (numeroClassi != null && numeroClassi >= 1 && numeroClassi < 5) {
            classe += numeroClassi;
            ris = true;
        }
        return ris;
    }

    @Override
    public String info() {
        String t = "[";
        if (classe != null && isRipetente != null) {
            if (voti != null) {
                for (int i = 0; i < voti.length; i++) {
                    t += voti[i] + ", ";
                }
                t += "]";
            } else {
                t = "nessun voto presente";
            }
            return "Scuola: " + SCUOLA + "\nClasse: " + classe + "\nCognome: "
                    + super.getCognome() + "\nNome: " + super.getNome()
                    + "\nData di nascita: " + super.getDataDiNascita().toString()
                    + "\nRipetente: " + (isRipetente? "sì" : "no") + "\nVoti: " + t;
        }
        return "Gli attributi non sono stati inizializzati";
    }

}
