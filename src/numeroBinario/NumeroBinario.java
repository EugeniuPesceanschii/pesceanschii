package numeroBinario;

public class NumeroBinario {

    private String nBin;

    public NumeroBinario(String num) {
        int numInt = 0;
        nBin = "";
        
        numInt = Integer.valueOf(num);

        while (numInt > 0) {
            nBin = (numInt % 2) + nBin;
            numInt /= 2;
        }
    }

    public int decimale() {
        int numDec = 0;
        int i = 0;
        int c = nBin.length() - 1;

        while (i < nBin.length()) {
            char bin = nBin.charAt(c);
            numDec += (int) (Math.pow(2, i) * (bin - 48));
            c--;
            i++;
        }

        return numDec;
    }

    public int digit(int pos) {
        int cifra = 0;

        if (pos < nBin.length()) {
            cifra = nBin.charAt(pos) - 48;
        } else {
            cifra = -1;
        }
        return cifra;
    }
}
