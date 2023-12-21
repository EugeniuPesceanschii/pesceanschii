package pesceanschii;

public class personaProva {

    public static void main(String[] args) {
        try {
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
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
