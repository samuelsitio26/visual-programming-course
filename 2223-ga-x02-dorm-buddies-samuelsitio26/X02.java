// 12S22032 - Samuel Sitio 
// 12S22004 - Bethania Hasibuan 

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] data = new String[4];
        int n;
        
        n = 0;
        inisialisasi(n, data);
        addroom(n, data);
        menampilkanroom(n, data);
    }
    
    public static void addroom(int n, String[] data) {
        for (n = 0; n <= 3; n++) {
            data[n] = input.nextLine();
            if (!data[n].equals("---")) {
            } else {
                n = 4;
            }
        }
    }
    
    public static void inisialisasi(int n, String[] data) {
        for (n = 0; n <= 3; n++) {
            data[n] = "";
        }
    }
    
    public static void menampilkanroom(int n, String[] data) {
        for (n = 0; n <= 3; n++) {
            if (!data[n].equals("---")) {
                System.out.println(data[n]);
            } else {
                n = n + 1;
            }
        }
    }
}
