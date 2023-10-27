package tryCatch;

public class Id {

    private String id;

    public Id(String id) throws Exception {
        setId(id);
    }

    public void setId(String id) throws Exception {
        char[] idchar = new char[2];
        String idnum;
        try {
            if (!id.isEmpty()) {
                if(id.length() == 4){
                    idchar = id.substring(0, 2).toCharArray();
                    idnum = id.substring(2);
                    Integer.parseInt(idnum);
                    for(int i = 0; i < 2; i++){
                        if(!Character.isLetter(idchar[i])){
                            throw new Exception("L'id non è valido");
                        }
                    }
                } else {
                    throw new Exception("L'id non è da 4 caratteri");
                }
                    this.id = id;
                
            } else {
                throw new Exception("Errore generico");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Inserire due lettere e due cifre");
        }
    }

}
