// 12S22032 - Samuel Sitio 
// 12S22004 - Bethania Hasibuan 

import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        double[] price = new double[3];
        int[] quantity = new int[3];
        
        System.out.println(toFixed(nilai(iSBN, price, quantity),2));
    }
    
    public static void keluaran(String[] iSBN, double[] price, int[] quantity) {
        System.out.println(toFixed(nilai(iSBN, price, quantity),2));
    }
    
    public static double nilai(String[] iSBN, double[] price, int[] quantity) {
        String tISBN;
        double tPrice, totalPrice;
        int tQuantity;
        int init, index, loop, position;
        
        position = 0;
        totalPrice = 0.00;
        for (init = 0; init <= 2; init++) {
            iSBN[init] = " ";
            price[init] = 0.00;
            quantity[init] = 0;
        }
        tISBN = input.nextLine();
        index = 0;
        while (!tISBN.equals("---")) {
            tPrice = Double.parseDouble(input.nextLine());
            tQuantity = Integer.parseInt(input.nextLine());
            boolean found;
            
            found = false;
            for (loop = 0; loop <= 2; loop++) {
                if (tISBN.equals(iSBN[loop])) {
                    found = true;
                    position = loop;
                }
            }
            if (found == true) {
                quantity[position] = quantity[position] + tQuantity;
            } else {
                iSBN[index] = tISBN;
                price[index] = tPrice;
                quantity[index] = tQuantity;
                index = index + 1;
            }
            tISBN = input.nextLine();
        }
        int isi;
        
        for (isi = 0; isi <= 2; isi++) {
            double tempPrice;
            
            if (quantity[isi] >= 20) {
                tempPrice = (price[isi] - price[isi] * 0.12) * quantity[isi];
            } else {
                if (quantity[isi] >= 10) {
                    tempPrice = (price[isi] - price[isi] * 0.05) * quantity[isi];
                } else {
                    if (quantity[isi] >= 5) {
                        tempPrice = (price[isi] - price[isi] * 0.02) * quantity[isi];
                    } else {
                        tempPrice = price[isi] * quantity[isi];
                    }
                }
            }
            totalPrice = totalPrice + tempPrice;
        }
        
        return totalPrice;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
