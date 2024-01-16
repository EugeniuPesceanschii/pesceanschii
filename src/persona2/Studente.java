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

    public Studente() {
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
        for (Float voto : voti) {
            if (voto == null) {
                throw new Exception("I voti non possono essere null");
            }
            if (voto < 0 || voto > 10) {
                throw new Exception("I voti devono essere compresi tra 0 e 10");
            }
        }
    }

    public Boolean verifcaOmonomia(Studente studente) {
        Boolean ris = false;

        if (Objects.equals(studente.getClasse(), classe)
                && studente.getCognome().equals(super.getCognome())
                && studente.getNome().equals(super.getNome())) {
            ris = true;
        }

        return ris;
    }

    public void aggiungiVoto(Float voto) throws Exception {
        if (voto == null) {
            throw new Exception("Il voto non può essere nullo");
        } else if (voto < 0 || voto > 10) {
            throw new Exception("Il voto inserito non è valido");
        } else {
            voti.add(voto);
        }
    }

    /*public void rimuoviVoto(Integer posizione) throws Exception {
        if (posizione == null) {
            throw new Exception("La posizione non può essere null");
        } else if (posizione < 0 || posizione >= voti.length) {
            throw new Exception("La posizione inserita non è corretta");
        } else {
            Float[] temp = new Float[voti.length - 1];
            for (int i = 0; i < temp.length; i++) {
                if (i >= posizione) {
                    temp[i] = voti[i + 1];
                } else {
                    temp[i] = voti[i];
                }
            }
            voti = temp;
        }
    }*/
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
       // try {
            t = "Scuola          :" + SCUOLA
                    + "\nClasse          :" + classe
                    + "\n" + super.info()
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
            
       /* } catch (NullPointerException e) {
            throw new Exception("Gli attributi non possono essere null");
        }*/
        return t;
    }
}
