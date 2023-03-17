package costruttoreCopia;

public class CostruttoreCopia {
    private String[] vett;
    
    public CostruttoreCopia(String[] vett) {
        this.vett = vett;
    }
    
    public String[] getVettString() {
        return vett;
    }
    
    public void setVett(){
        String[] vettCopia = new String[vett.length]; 
        
        for(int i = 0; i<vettCopia.length; i++)
            vettCopia[i] = vett[i];
        
        this.vett = vettCopia;
    }
    
    public String stampa(){
        String testo = "";
        
        for(int i = 0; i < vett.length; i++){
            testo += " " + vett[i];
        }
        
        return testo;
    }
}