package amministratoreCondomini;

public class AmministratoreTest {

    public static void main(String[] args) {
        Appartamento a = new Appartamento(1, "Giuseppe Giorgetti", 101.35);
        Appartamento[] aa = new Appartamento[10];
        for(int i = 0; i < aa.length; i++){
            aa[i] = new Appartamento(a);
        }
        
        Condominio c = new Condominio(aa, "Fiori", "Corso Nonni");
        
        Condominio[] cc = new Condominio[10];
        for(int i = 0; i < cc.length; i++){
            cc[i] = new Condominio(aa, "Cose", "Altre cose");
        }
        
        Amministrazione am = new Amministrazione(5, cc);
    }
    
}
