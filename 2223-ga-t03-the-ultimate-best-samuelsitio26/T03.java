// 12S22028 - Tennov Pakpahan
// 12S22032 - Samuel Sitio

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn;
        String judul;
        String penulis;
        int tahunterbit;
        String penerbit;
        String formatbuku;
        double hargapembelian;
        double margin;
        int stok;
        double rating;
        String kategori;
        String result;
        String finalresult;
        
        kodeisbn = input.nextLine();
        while (!kodeisbn.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunterbit = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            formatbuku = input.nextLine();
            hargapembelian = Double.parseDouble(input.nextLine());
            margin = Double.parseDouble(input.nextLine());
            if (margin / hargapembelian < -0.4) {
                result = "Once in a lifetime";
            } else {
                if (margin / hargapembelian < -0.2) {
                    result = "Never come twice";
                } else {
                    if (margin / hargapembelian <= 0) {
                        result = "No regret";
                    } else {
                        result = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (result.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                finalresult = "The ultimate best";
            } else {
                finalresult = "---";
            }
            System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + margin + "|" + stok + "|" + rating + "|" + kategori + "|" + result + "|" + finalresult);
            kodeisbn = input.nextLine();
        }
    }
}
