package prjarray;

public class ArrayIntTest {

    public static void main(String[] args) {
        int[] add = {1, 2, 3, 4, 5, 6, 7};
        
        ArrayInt a = new ArrayInt(7);
        
        System.out.println(a.add(6));
       
        System.out.println(a.addAll(add));
        
        System.out.println(a.addFirst(8));
        
        System.out.println(a.addPos(55, 4));
        
        System.out.print(a.stampa());
    }
    
}
