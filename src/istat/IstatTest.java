package istat;

public class IstatTest {

    public static void main(String[] args) {
        String[] regione = new String[] {"Abruzzo", "Basilicata",
            "Calabria", "Campania", "Emilia Romagna", "Friuli Venezia Giulia", 
            "Lazio", "Liguria", "Lombardia", "Marche", "Molise", "Piemonte",
            "Puglia", "Sardegna", "Sicilia", "Toscana", "Trentino-Alto Adige",
            "Umbria", "Valle d'Aosta", "Veneto"};
        
        double[] pPane = new double[] {3.20, 2.10, 3.32, 4.10, 5.00, 1.67, 4.21,
            4.56, 1.34, 2.34, 3.43, 3.50, 2.50, 1.50, 1.34, 1.20, 2.50, 2.70,
            3.00, 4.50};
        
        double[] pLatte = new double[] {3.20, 2.10, 3.32, 4.10, 5.00, 1.67, 4.21,
            4.56, 1.34, 2.34, 3.43, 3.50, 2.50, 1.50, 1.34, 1.20, 2.50, 2.70,
            3.00, 4.50};
        
        Istat i = new Istat(regione, pLatte, pPane);
        
        System.out.println(i.prezzoMaggiore());
        
        System.out.println(i.stampa());
        }
    }

