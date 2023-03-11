package vettori;

public class Vettori {

    private String[] vettString;

    public Vettori(String[] vettString) {
        this.vettString = vettString;
    }

    public String[] getVettString() {
        return vettString;
    }

    public void setVettString(String[] vettString) {
        String[] vettTemp = new String[vettString.length];
        
        for(int i = 0; i<vettTemp.length; i++)
            vettTemp[i] = vettString[i];
        
        this.vettString = vettTemp;
    }

    public String stampa() {
        String testo = "";

        for (int i = 0; i < vettString.length; i++) 
            testo += " " + vettString[i];        

        return testo;
    }

}
