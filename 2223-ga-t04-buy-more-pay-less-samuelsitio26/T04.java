// 12S22032 - Samuel Sitio  
// 12S22028 - Tennov Pakpahan

import java.util.*;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn;
        double harga;
        int kuantitas;
        String[] coISBN = new String[3];
        double[] coHarga = new double[3];
        int[] coKuantitas = new int[3];
        int vBuku;
        
        vBuku = 3;
        int index;
        double sumHarga;
        boolean run;
        boolean work;
        int e;
        
        for (e = 0; e <= vBuku - 1; e++) {
            coISBN[e] = " ";
            coHarga[e] = 0;
            coKuantitas[e] = 0;
        }
        sumHarga = 0;
        boolean choice;
        
        choice = true;
        do {
            isbn = input.nextLine();
            if (!isbn.equals("---")) {
                harga = Double.parseDouble(input.nextLine());
                kuantitas = Integer.parseInt(input.nextLine());
                work = false;
                e = 0;
                do {
                    if (coISBN[e].equals(isbn)) {
                        coKuantitas[e] = coKuantitas[e] + kuantitas;
                        work = true;
                    } else {
                        e = e + 1;
                    }
                } while (!work && e < vBuku);
                if (!work) {
                    run = false;
                    index = 0;
                    do {
                        if (coKuantitas[index] == 0) {
                            run = true;
                        } else {
                            index = index + 1;
                        }
                    } while (!run && index < vBuku);
                    coISBN[index] = isbn;
                    coHarga[index] = harga;
                    coKuantitas[index] = kuantitas;
                    index = index + 1;
                }
            } else {
                choice = false;
            }
        } while (choice);
        for (e = 0; e <= vBuku - 1; e++) {
            double hargaTerbaru;
            
            hargaTerbaru = coHarga[e];
            if (coKuantitas[e] >= 20) {
                hargaTerbaru = coHarga[e] - coHarga[e] * 0.12;
            } else {
                if (coKuantitas[e] >= 10) {
                    hargaTerbaru = coHarga[e] - coHarga[e] * 0.05;
                } else {
                    if (coKuantitas[e] >= 5) {
                        hargaTerbaru = coHarga[e] - coHarga[e] * 0.02;
                    }
                }
            }
            sumHarga = sumHarga + hargaTerbaru * coKuantitas[e];
        }
        System.out.println(toFixed(sumHarga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
