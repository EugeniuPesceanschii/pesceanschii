package dado;

public class Dado {
    private int nFacce;

    public Dado(int nFacce) {
        this.nFacce = nFacce;
    }

    public void setNFacce(int n) {
        nFacce = n;
    }

    public int getNFacce() {
        return nFacce;
    }

    public String stampa() {
        String s;
        s = "nFacce: " + nFacce;
        return s;
    }
}
