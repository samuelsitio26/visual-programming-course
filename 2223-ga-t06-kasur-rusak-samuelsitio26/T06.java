// 12S22004 - Bethania Hasibuan
// 12S22032 - Samuel Sitio

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int posisi;
        
        posisi = 0;
        String huruf;
        
        huruf = input.nextLine();
        System.out.println(proses1(huruf, posisi));
    }
    
    public static String proses1(String huruf, int posisi) {
        String hasil;
        boolean palidrom;
        
        palidrom = true;
        while (posisi <= (double) huruf.length() / 2 - 1 && palidrom == true) {
            if (!String.valueOf(huruf.charAt(posisi)).equals(String.valueOf(huruf.charAt(huruf.length() - posisi - 1)))) {
                palidrom = false;
            }
            posisi = posisi + 1;
        }
        if (palidrom == true) {
            hasil = "YES";
        } else {
            hasil = "NO";
        }
        
        return hasil;
    }
}

