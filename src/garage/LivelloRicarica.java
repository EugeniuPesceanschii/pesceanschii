package garage;

public class LivelloRicarica  {

    private int centralineAtt;

    public LivelloRicarica() throws Exception {
        
    }

    public LivelloRicarica(int centralineAtt) {
        this.centralineAtt = centralineAtt;
    }

    public int getCentralineAtt() {
        return centralineAtt;
    }

    public void setCentralineAtt(int centralineAtt) {
        this.centralineAtt = centralineAtt;
    }

    @Override
    public String toString() {
        return "";
    }
}
