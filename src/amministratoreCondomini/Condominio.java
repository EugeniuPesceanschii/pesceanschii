package amministratoreCondomini;

public class Condominio {
    private String nome;
    private String indirizzo;
    private Appartamento[] appartamenti;
    private int nAppartamenti;

    public Condominio(Appartamento[] a, String nome, String indirizzo) {       
        copia(a);
        this.nAppartamenti = a.length;
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public int getnAppartamenti() {
        return nAppartamenti;
    }
        
    public String millesimiMagg(){
        String t = "";
        double millMag = 0;
        for(int i = 0; i < appartamenti.length; i++){
            if(millMag < appartamenti[i].getMillesimi()){
                millMag = appartamenti[i].getMillesimi();
                t = appartamenti[i].getNomeProprietario();
            }
        }
        return t;
    }

    @Override
    public String toString() {
        String t = "";
        for(int i = 0; i < appartamenti.length; i++){
            t += "\n" + appartamenti[i].toString();
        }
        return "\nAppartamenti: " + t + "\nNome condominio: " + nome + "Indirizzo: " +
                indirizzo + "\nNumero appartamenti nel condominio: " + nAppartamenti;
    }

    private void copia(Appartamento[] a){
        this.appartamenti = new Appartamento[a.length];
        
        for(int i = 0; i < a.length; i++){
            appartamenti[i] = a[i];
        }
    }
}
