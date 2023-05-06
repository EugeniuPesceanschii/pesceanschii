package ipAddress;

import java.util.regex.Pattern;

public class IpAddress {

    private NumeroBinario[] numBin;
    private NumeroBinario[] subMask;

    public IpAddress(String ip, String sott) {
        String[] ipArray = ip.split(Pattern.quote("."));
        for (int i = 0; i < ipArray.length; i++) {
            this.numBin[i] = new NumeroBinario(ipArray[i]);
        }

        String[] sottArray = sott.split(Pattern.quote("."));
        for (int i = 0; i < sottArray.length; i++) {
            this.subMask[i] = new NumeroBinario(sottArray[i]);
        }
    }

    public String stampaIp() {
        String testo = "ip: ";
        for (int i = 0; i <= this.numBin.length - 1; i++) {
            testo += numBin[i].stampa() + ".";
        }

        testo += "\nsottomascera: ";
        for (int i = 0; i <= this.subMask.length - 1; i++) {
            testo += subMask[i].stampa() + ".";
        }
        return testo;
    }

    public String classe() {
        String ris = "A";
        if (numBin[0].digit(0) == 1) {
            if (numBin[0].digit(1) == 1 && numBin[1].digit(1) == 1) {
                ris = "C";
            } else {
                ris = "B";
            }
        }
        return ris;
    }

    public String broadcast() {
        int c = 0;
        String broad = "";
        String ris = "";
        for (int i = 0; i <= subMask.length - 1; i++) {
            c = 0;
            while (c <= subMask[i].getNum().length() - 1) {
                if (subMask[i].digit(c) == 1) {
                    if (numBin[i].digit(c) != -1) {
                        broad = broad + numBin[i].digit(c);
                    } else {
                        broad = broad + "0";
                    }
                } else {
                    broad = broad + 1;
                }
                c++;
            }
            ris += decimale(broad) + ".";
        }
        return ris;
    }

    public String rete() {
        int j = 0;
        String ris = "";
        String net = "";
        for (int i = 0; i <= subMask.length - 1; i++) {
            j = 0;
            while (j <= subMask[i].getNum().length() - 1) {
                if (subMask[i].digit(j) == 1) {
                    if (numBin[i].digit(j) != -1) {
                        net = net + numBin[i].digit(j);
                    } else {
                        net += "0";
                    }
                } else {
                    net += 0;
                }
                j++;
            }
            ris += decimale(net) + ".";;
        }
        return ris;
    }

    public String stampa() {
        String testo = "";

        testo = "ip: " + numBin;
        testo += "\nmaschera: " + subMask;

        return testo;
    }

    private String decimale(String num) {
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

}
