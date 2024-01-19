package persona2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Studente {

    private String SCUOLA = "I.T.T Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private ArrayList<Float> voti;

    public Studente() throws Exception {
    }

    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome) throws Exception {
        setClasse(classe);
        setIsRipetente(isRipetente);
        voti = new ArrayList<>();
        for(Float voto : voti){
            voti.add(voto);
        }
    }

    public final void setClasse(Integer classe) throws Exception {
        if (classe == null) {
            throw new Exception("La classe non può essere null");
        } else if (classe < 1 || classe > 5) {
            throw new Exception("La classe dev'esere compresa tra 1 e 5");
        }
        this.classe = classe;
    }

    public Integer getClasse() {
        return classe;
    }

    public final void setIsRipetente(Boolean isRipetente) throws Exception {
        if (isRipetente == null) {
            throw new Exception("L'attributo non può essere null");
        }
        this.isRipetente = isRipetente;
    }

    public void setVoti(ArrayList<Float> voti) throws Exception {
        if (voti == null) {
            throw new Exception("La lista di voti non può essere null");
        }
        for (int i = 0; i < voti.size(); i++) {
            if (voti.get(i) == null) {
                throw new Exception("I voti non possono essere null");
            } else {
                if (voti.get(i) < 0 || voti.get(i) > 10) {
                    throw new Exception("I voti devono essere compresi tra 0 e 10");
                } else {
                    this.voti.add(voti.get(i));
                }
            }
        }
    }

    /*public Boolean verifcaOmonomia(Studente studente) {
        Boolean ris = false;

        if (Objects.equals(studente.getClasse(), classe)
                && studente.getCognome().equals(super.getCognome())
                && studente.getNome().equals(super.getNome())) {
            ris = true;
        }

        return ris;
    }*/
    public void aggiungiVoto(Float voto) throws Exception {
        if (voto == null) {
            throw new Exception("Il voto non può essere nullo");
        } else if (voto < 0 || voto > 10) {
            throw new Exception("Il voto inserito non è valido");
        } else {
            voti.add(voto);
        }
    }

    public void rimuoviUltimoVoto() {
        voti.remove(voti.size() - 1);
    }

    public void rimuoviVoto(int posizione) throws Exception {
        voti.remove(posizione);

    }

    public void rimuoviVoto2(Float voto) throws Exception {
        if (voto == null) {
            throw new Exception("voto è null");
        } else {
            voti.remove(voto);
        }
    }

    public Float votoMinore() {
        Float votoMin = voti.get(0);

        for (int i = 1; i < voti.size(); i++) {
            if (voti.get(i) < votoMin) {
                votoMin = voti.get(i);
            }
        }
        return votoMin;
    }

    public Float votoMaggiore() {
        Float votoMagg = voti.get(0);

        for (int i = 1; i < voti.size(); i++) {
            if (voti.get(i) > votoMagg) {
                votoMagg = voti.get(i);
            }
        }
        return votoMagg;
    }

    public Float mediaVoti() {
        Float media = new Float(0);

        for (int i = 0; i < voti.size(); i++) {
            media += voti.get(i);
        }
        
        return media /= voti.size();
    }

    public void ordinaVotoCrescente() {
        Collections.sort(voti);
    }

    public void ordinaVotoDecrescente() {
        Collections.sort(voti, Collections.reverseOrder());
    }

    public Boolean promuovi() {
        Boolean ris = false;
        if (classe < 5) {
            isRipetente = false;
            classe++;
            ris = true;
        }
        return ris;
    }

    public Boolean promuovi(Integer numeroClassi) {
        Boolean ris = false;

        if (numeroClassi + classe <= 5) {
            isRipetente = false;
            classe += numeroClassi;
            ris = true;
        }
        return ris;
    }

    public String info() throws Exception {
        String t = "";
        try {
            t = "Scuola          :" + SCUOLA
                    + "\nClasse          :" + classe
                    + "\nRipetente       :" + (isRipetente ? "si" : "no");

            t += "\nvoti            :[";
            for (int i = 0; i < voti.size(); i++) {
                if (i == voti.size() - 1) {
                    t += voti.get(i) + "";

                } else {
                    t += voti.get(i) + ", ";
                }
            }
            t += "]";

        } catch (NullPointerException e) {
            throw new Exception("Gli attributi non possono essere null");

        }
        return t;
    }
}
