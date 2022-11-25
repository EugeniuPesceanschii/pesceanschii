package lampadinaIf;

public class LampadinaIfTest {

    public static void main(String[] args) {

        LampadinaIf l = new LampadinaIf("Edison", "giallo", 30, 10, false);
        LampadinaIf g = new LampadinaIf("Shine", "blu", 40, 15, false);
        LampadinaIf m = new LampadinaIf("Osram", "verde", 35, 5, false);

        String accendi = g.accendi();
        System.out.println(accendi);

        g.spegni();
        
        String s = g.stampa();
        System.out.println(s);
    }

}
