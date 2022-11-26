package lampadinaIf;

public class LampadinaIfTest {

    public static void main(String[] args) {

        LampadinaIf l = new LampadinaIf("Edison", "giallo", 35, 10, false);
        LampadinaIf g = new LampadinaIf("Shine", "blu", 35, 25, false);
        LampadinaIf m = new LampadinaIf("Osram", "verde", 40, 35, false);

        int nVolteAccesa1 = l.getNVolteAccesa();
        int nVolteAccesa2 = g.getNVolteAccesa();
        int nVolteAccesa3 = m.getNVolteAccesa();
        
        if (nVolteAccesa1 > nVolteAccesa2 && nVolteAccesa1 > nVolteAccesa3) {
            System.out.println(l.accendi() + " \nLampadina 1");
        }
        else {
            // not (nVolteAccesa1 > nVolteAccesa2 && nVolteAccesa1 > nVolteAccesa3)
            // nVolteAccesa1 <- nVolteAccesa2 || nVolteAccesa1 <- nVolteAccesa3)
            if (nVolteAccesa2 > nVolteAccesa1 && nVolteAccesa2 > nVolteAccesa3) {
                System.out.println(g.accendi() + " \nLampadina 2");
            }
            else {
                // nVolteAccesa2 <- nVolteAccesa3
                System.out.println(m.accendi() + " \nLampadina 3");
            }
        }
        if (nVolteAccesa1 == nVolteAccesa2 && nVolteAccesa1 == nVolteAccesa3){
            System.out.println("Tutte le lampadina sono uguali");
        }
        else if (nVolteAccesa1 == nVolteAccesa2) {
                System.out.println("Lampadina 1 è uguale a Lampadina 2");
            }
        else if (nVolteAccesa1 == nVolteAccesa3){
            System.out.println("Lampadina 1 è uguale alla Lampadina 3");
        }
        
        else if (nVolteAccesa2 == nVolteAccesa3) {
            System.out.println("Lampadina 2 è uguale alla Lampadina 3");
        }
        
        
            }
        }      
    

