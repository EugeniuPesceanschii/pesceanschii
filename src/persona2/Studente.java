package persona2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import pesceanschii.Data;
import pesceanschii.Persona;

public class Studente extends Persona {

    private String SCUOLA = "I.T.T Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private ArrayList<Float> voti;

    public Studente(ArrayList<Float> v) throws Exception {
        setVoti(v);
        numeroIstanze++;
    }

    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome, Data dataDiNascita) throws Exception {
        super(cognome, nome, dataDiNascita);
        setClasse(classe);
        setIsRipetente(isRipetente);
        numeroIstanze++;
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

    public void rimuoviVoto(Float posizione) throws Exception {
        if (posizione == null) {
            throw new Exception("La posizione non può essere null");
        } else if (posizione < 0 || posizione >= voti.size()) {
            throw new Exception("La posizione inserita non è corretta");
        } else {
            voti.remove(posizione);
        }
    }

    public void rimuoviVoto2(Float voto) throws Exception {
        if (voto == null) {
            throw new Exception("voto è null");
        } else {
            int i = 0;
            while (i < voti.size()) {
                if (voto.equals(voti.get(i))) {
                    voti.remove(i);
                    i = voti.size();
                }
                i++;
            }
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
        media /= voti.size();
        return media;
    }
    
    public void ordinaVotoCrescente(){
        Float f = new Float(0);
        for(int i = 0; i < voti.size(); i++){
            if(voti.get(i) > voti.get(i + 1)){
                f = voti.get(i);
                voti.remove(i);
                voti.add(i, voti.get(i + 1));
                voti.add(i + 1, f);
            }
        }
    }
    
    public void ordinaVotoDecrescente(){
        Float f = new Float(0);
        for(int i = 0; i < voti.size(); i++){
            if(voti.get(i) < voti.get(i + 1)){
                f = voti.get(i);
                voti.remove(i);
                voti.add(i, voti.get(i + 1));
                voti.add(i + 1, f);
            }
        }
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

    @Override
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
