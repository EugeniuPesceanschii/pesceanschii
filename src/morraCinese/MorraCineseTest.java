package morraCinese;

public class MorraCineseTest {

    public static void main(String[] args) {
        MorraCinese mc = new MorraCinese("Computer", "Eugeniu");
        
        System.out.println(mc.stampa());
        
        System.out.println(mc.gioca(1));
        
        System.out.println(mc.gioca(2));
        
        System.out.println(mc.gioca(3));
    }
}
