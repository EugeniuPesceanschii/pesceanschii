package pesceanschii;

import data.Data;

public class Pesceanschii {

    public static void main(String[] args) throws Exception {
        Data nascita = new Data(28, 2, 2005);
        Persona p = new Persona("Rossi", "Marco", nascita);
        
        Studente s = new Studente(4, false, "Rossi", "Marco", nascita);
        
        s.aggiungiVoto(Float.valueOf(5));
        s.aggiungiVoto(Float.valueOf(7));
        s.aggiungiVoto(Float.valueOf(8));
        s.promuovi();
        System.out.println(p.info());
        System.out.println(s.info());
        
        System.out.println(p.calcolaEta());
    
        
    }
    
}
