/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipAddress;

/**
 *
 * @author eugeniu.pesceanschii
 */
public class NumeroBinario {

    private String num;

    public NumeroBinario(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public int digit(int pos) {
        int ris = 0;
        if (num.length() > pos) {
            if (num.charAt(pos) == '1') {
                ris = 1;
            }
        }
        return ris;
    }

    public String decimale(String num) {
        int dimF = num.length();
        int valore = 0;
        num = "";

        for (int i = 0; i < dimF; i++) {
            if (num.charAt(dimF - i - 1) == '1') {
                valore += Math.pow(2, i);
                num += valore;
            }
        }
        return num;
    }

    public String sottrazione(String sottr) {
        sottr = aggiungiZeri(sottr);
        String ris = "";
        int riporto = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            int num1 = Character.getNumericValue(num.charAt(i));
            int num2 = Character.getNumericValue(sottr.charAt(i));
            int diff = 0;
            diff = num1 - num2 - riporto;

            if (diff < 0) {
                riporto = 1;
                diff += 2;
            } else {
                riporto = 0;
            }
            ris = diff + ris;
        }
        return ris;
    }

    public String somma(String add) {
        add = aggiungiZeri(add);

        String ris = "";
        int riporto = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            int num1 = Character.getNumericValue(num.charAt(i));
            int num2 = Character.getNumericValue(add.charAt(i));
            int somm = num1 + num2 + riporto;

            if (somm > 1) {
                riporto = 1;
                somm -= 2;
            } else {
                riporto = 0;
            }
            ris = somm + ris;

        }
        if (riporto == 1) {
            ris = riporto + ris;
        }
        return ris;
    }

    public String stampa() {
        return "Numero: " + num;
    }
    //Metodi private:

    private String aggiungiZeri(String n) {
        while (num.length() > n.length()) {
            n = "0" + n;
        }
        return n;
    }

}
