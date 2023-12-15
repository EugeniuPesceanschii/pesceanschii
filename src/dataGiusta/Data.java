package dataGiusta;

public class Data {
    
    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;

    public Data() {
    }
    
    public Data(String data){
        
    }
    
    public Data(String data, Integer giorno, Integer mese, Integer anno) {
        this.data = data;
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    
    public Data(Data data){
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) {
        this.giorno = giorno;
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) {
        this.mese = mese;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public String giornoDellaSettimana(){
        
    }
    
    public static Integer differenzaInGiorni(Data dataAntecedente, Data dataSuccessiva){
        
    }
    
    public static Integer differenzaInSettimane(Data dataAntecedente, Data dataSuccessiva){
        
    }
    
    public static Integer differenzaInMesi(Data dataAntecedente, Data dataSuccessiva){
        
    }
    
    public static Integer differenzaInAnni(Data dataAntecedente, Data dataSuccessiva){
        
    }
    
    public static Integer differenzaInGiorniMesiAnni(Data dataAntecedente, Data dataSuccessiva){
        
    }
    
    @Override
    public String toString() {
        return super.toString(); 
    }
}
