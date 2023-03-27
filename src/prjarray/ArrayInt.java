package prjarray;

public class ArrayInt {

    private int[] vett;
    private int dimL;

    public ArrayInt(int dimF) {
        this.vett = new int[dimF];
    }

    public boolean add(int add) {
        boolean risultato = false;
        dimL = 0;

        if (dimL < vett.length) {
            vett[dimL] = add;
            risultato = true;
            dimL++;
        }
        return risultato;
    }

    public boolean addAll(int[] add) {
        int minCapacity = dimL + add.length + 1;
        boolean risultato;
        int c = 0;

        if (vett.length > add.length + dimL) {
            for (int i = dimL; c < add.length; i++, c++) {
                vett[i] = add[c];
            }
            risultato = true;
        } else {
            ensureCapacity(minCapacity);
            for (int i = dimL; i < minCapacity - 1; i++, c++) {
                vett[i] = add[c];
            }
            risultato = true;
        }
        return risultato;
    }

    public boolean addFirst(int add) {
        boolean risultato = false;

        if (dimL == 0) {
            vett[0] = add;
            risultato = true;
        } else if (dimL < vett.length) {
            shiftDx();
            vett[0] = add;
            risultato = true;
        }
        dimL++;
        return risultato;
    }

    public boolean addPos(int elem, int pos) {
        boolean risultato = false;

        if (pos >= 0 && pos < vett.length) {

            for (int i = vett.length - 1; i > pos; i--) {
                vett[i] = vett[i - 1];
            }
            vett[pos] = elem;
            risultato = true;
        }
        return risultato;
    }

    public int[] cloneArray() {
        int[] vettore = new int[vett.length];

        copiaVett();
        return vettore;
    }

    public void ensureCapacity(int minCapacity) {
        int[] vettore = new int[minCapacity];

        copiaVett();
        vett = vettore;
    }

    public String stampa() {
        String testo = "";
        for (int i = 0; i < vett.length; i++) {
            testo += "\nvett = [" + i + "] = " + vett[i];
        }
        testo += "\n";
        return testo;
    }
//Metodi private:
    private void shiftDx() {
        for (int i = dimL; i < dimL + 1; i++) {
            vett[i] = vett[i - 1];
        }
    }

    private void copiaVett() {
        int[] vettore = new int[vett.length];

        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = vett[i];
        }
    }
}
