package prjarray;

public class ArrayIntTest {

    public static void main(String[] args) {
        int[] add = {1, 2, 3};
        
        ArrayInt a = new ArrayInt(4);
        
        System.out.println(a.add(6));
        
        System.out.println(a.addAll(add));
        
        System.out.print(a.stampa());
    }
    
}
