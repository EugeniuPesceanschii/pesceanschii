package testo;

public class Testo {

    private String mess;

    public Testo(String mess) {
        this.mess = mess;
    }

    public String codifica() {
        String testo = "";
        int i = 0;
        char carat = 'a';

        while (i < mess.length()) {
            carat = (char) (mess.charAt(i) + 1);

            if (carat == 'a' || carat == 'e' || carat == 'i' || carat == 'o' || carat == 'u') {
                carat++;
            }
            switch (mess.charAt(i)) {
                case 'A':
                    carat = 'E';
                    break;
                case 'a':
                    carat = 'e';
                    break;
                case 'E':
                    carat = 'I';
                    break;
                case 'e':
                    carat = 'i';
                    break;
                case 'I':
                    carat = 'O';
                    break;
                case 'i':
                    carat = 'o';
                    break;
                case 'O':
                    carat = 'U';
                    break;
                case 'o':
                    carat = 'u';
                    break;
                case 'U':
                    carat = 'A';
                    break;
                case 'u':
                    carat = 'a';
                    break;
                case ' ':
                    carat = ' ';
                    break;
                case '9':
                    carat = '0';
                    break;
                case '-':
                    carat = '-';
                    break;
                case '\'':
                    carat = '\'';
                    break;
                default:
                    break;
            }
            testo += carat;
            i++;
        }

        return testo;
    }

    public String stampa() {
        return "Messaggio: " + mess;
    }
}
