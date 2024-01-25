package ordinaOggetti;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) throws Exception {
        ArrayList<Data> listaOggetti = new ArrayList<>();

        listaOggetti.add(new Data(15, 2, 2020));
        listaOggetti.add(new Data(11, 6, 2020));
        listaOggetti.add(new Data(25, 3, 2020));
        
        Collections.sort(listaOggetti);
        
        for(Data data : listaOggetti){
            System.out.println(data.getGiorno());
        }
    }

}
