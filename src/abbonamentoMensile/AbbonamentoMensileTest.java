package abbonamentoMensile;

public class AbbonamentoMensileTest {

        public static void main(String[] args) {
        
            AbbonamentoMensile a = new AbbonamentoMensile ("Gennaio");
            
            System.out.println(a.calcCosto("Giovanni", 32, true));
            
            System.out.println(a.stampa());
    }
    
}
