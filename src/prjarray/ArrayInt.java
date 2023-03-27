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
        int minCapacity = dimL + add.length;
        boolean risultato = false;
        int c = 0;

        if (vett.length > add.length + dimL) {
            for (int i = dimL; c < add.length; i++) {
                vett[i] = add[c];
                c++;
            }
            risultato = true;
        } else {
            ensureCapacity(minCapacity);
            for (int i = dimL; i < minCapacity; i++) {
                vett[i] = add[c];
                c++;
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
            dimL++;
        }

        return risultato;
    }

    public boolean addPos(int elem, int pos) {
        boolean risultato = false;

        int[] vettore = new int[vett.length + 1];

        if (pos >= 0 && pos <= vett.length) {
            for (int i = 0; i < pos; i++) {
                vettore[i] = vett[i];
            }
            vettore[pos] = elem;

            for (int i = pos + 1; i < vett.length; i++) {
                vettore[i] = vett[i - 1];
            }
            risultato = true;
            vett = vettore;
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
