package amministratoreCondomini;

public class Amministrazione {
    private Condominio[] condomini;
    private int nCondomini;

    public Amministrazione(int nCond, Condominio[] c) {
        copia(c);
        this.nCondomini = nCond;       
    }
    
    public String condMaggiore(){
        int nAppartamenti = 0;
        int indice = 0;
        
        for(int i = 0; i < condomini.length; i++){
            if(nAppartamenti < condomini[i].getnAppartamenti()){
                nAppartamenti = condomini[i].getnAppartamenti();
                indice = i;
            }
        }
        return condomini[indice].toString();
    }
    
    public String maxMillesimi(){
        String t = "";
        for(int i = 0; i < condomini.length; i++){
            t += "Condominio " + i + ": " + condomini[i].millesimiMagg();
        }
        return t;
    }

    @Override
    public String toString() {
        String t = "";
        for(int i = 0; i < condomini.length; i++){
            t += "\n" + condomini[i].toString();
        }
        return "\nCondomini: " + t + "\nNumero condomini: " + nCondomini;
    }
    
    private void copia(Condominio[] c){
        this.condomini = new Condominio[c.length];
        
        for(int i = 0; i < c.length; i++){
            condomini[i] = c[i];
        }
    }
}
