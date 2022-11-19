
package foglio;


public class FoglioProva {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Foglio f = new Foglio(5, 2, "rosso");
        
        double area = f.calcArea();
        System.out.println(area);
                
        double diagonale = f.calcDiagonale();
        System.out.println(diagonale);
        
        f.impostaAltezza(25);
        System.out.println(f.getAltezza());
        
        f.impostaBase(25);
        System.out.println(f.getBase());
        
        f.impostaColore("giallo");
        System.out.println(f.getColore());
        
        String s = f.stampa();
        System.out.println(s);
    }
    
}
