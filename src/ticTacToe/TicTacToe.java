package ticTacToe;

public class TicTacToe {
    
    private String[] g;
    private char[] simbolo;
    private char[] griglia;
    private int turno;
    
    public TicTacToe(String[] g, char[] simbolo){
        g = new String[2];
        simbolo = new char[2];
        simbolo[0] = 'X';
        simbolo[1] = 'O';
    }
    
    private boolean hasVinto(){
        boolean win = false;
            
            
        return win;
    }
    
    public boolean faiMossa(int posizione){
        boolean mossa = false;
        
        return mossa;
    }
    
    private String stampaGriglia(){
        String stGriglia = "";
        int c = 1;
        
        griglia = new char[10];
        for(int i = 0; i < griglia.length; i++){
            griglia[i] = 1;
        }
        
        while(c < 10){
            stGriglia += griglia[1] + "|";
            if((c % 3) == 0) {
                stGriglia += "\n";
            }
        }       
        return stGriglia;
    }    
    
    public String stampaLegenda(){
        String legenda = "";
        
        return legenda;
    }
    
    public String inserisciGiocatore(){
        String giocatore = "";
            
        
        return giocatore;
    }
    
    public String stampa(){
        String t = "";
        
        t = "Griglia: \n" + (stampaGriglia());
        return t;
    }
}
