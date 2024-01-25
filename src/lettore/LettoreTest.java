package lettore;

public class LettoreTest {

    public static void main(String[] args) {
        eMail e = new eMail("Io", "Tu", "Ciao");

        System.out.println(e.leggiTesto());
    }

}
