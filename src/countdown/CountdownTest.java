package countdown;

public class CountdownTest {

    public static void main(String[] args) {
        Countdown c = new Countdown(10);
        int numPart = 10;
        System.out.println("Countdown: " + c.conta());

        c.setNumPartenza(numPart);
        System.out.println(c.stampa());
    }

}
