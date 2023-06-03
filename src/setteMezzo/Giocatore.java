package setteMezzo;

public class Giocatore {

    private String nome;
    private int partVinte;

    public Giocatore(String nome, int partVinte){
        this.nome = nome;
        this.partVinte = partVinte;
    }
    
    public String getNome() {
        return nome;
    }

    public int getPartiteVinte() {
        return partVinte;
    }

    public void vittoria() {
        partVinte++;
    }

    public String stampa() {
        String t = "";

        t = "Nome: " + nome + " Ha vinto: " + partVinte + " volte";

        return t;
    }

}
