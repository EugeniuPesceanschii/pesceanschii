package lettore;

public class Whatsapp extends Lettore {

    public Whatsapp(String testo) {
        super(testo);
    }

    @Override
    public String leggiTesto() {
        return getTesto();
    }

    @Override
    public String toString() {
        return "Il messaggio Whatsapp da leggere è: " + leggiTesto();
    }
    
    private String convertEmoji(char emoji){
        String t = "";
        
        return t;
    }
    
    
    
    
}
