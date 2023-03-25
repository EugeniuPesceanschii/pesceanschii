package prjarray;

public class ArrayInt {
    private int[] vett;
    private int dimL;

    public ArrayInt(int dimF) {  
        this.vett = new int[dimF];
    }
    
    public boolean add(int add){
        boolean risultato = false;
        dimL = 0;
        
        if(dimL < vett.length){
            vett[dimL] = add;
            risultato = true;
            dimL++;
        }
        return risultato;
    }
    
    public boolean addAll(int[] add){
        boolean risultato = false;
        int c = 0;
        
        for(int i = dimL; i < vett.length; i++){
            vett[i] = add[c];
            c++;
        }
        
        if(c == add.length){
            risultato = true;
        }
        else{
            //creare il metodo ensureCapacity
        }
        return risultato;
    }
    
    public void ensureCapacity(int minCapacity){
        int[] vettore = new int[minCapacity];
        
        for(int i = 0; i < vettore.length; i++){
            vettore[i] = vett[i];
        }
        vett = vettore;
    }
    
    public String stampa(){
        String testo = "";
        for(int i = 0; i < vett.length; i++){
            testo += "\nvett = [" + i + "] = " + vett[i];
        }
        testo += "\n";
        return testo;
    }
}
