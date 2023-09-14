package pompaCarburante;

public class PompaCarburanteTest {

  
    public static void main(String[] args) {
        
        PompaCarburante p = new PompaCarburante("PompaCarburante1", 1.9, 10, 20);
        
        PompaCarburante c = new PompaCarburante("PompaCarburante2", 1.7, 10, 10);
        
        PompaCarburante r = new PompaCarburante("PompaCarburante3", 2.0, 10, 0);
        
        System.out.println(p.costoPieno());
        
        System.out.println(c.costoPieno());
        
        System.out.println(r.costoPieno());
        
        System.out.println(p.stampa());
        
        System.out.println(c.stampa());
        
        System.out.println(r.stampa());
    }
    
}
