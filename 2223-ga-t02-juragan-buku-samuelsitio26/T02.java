// 12S22032 - Samuel Sitio 
// 12S22028 - Tennov Pakpahan 
import java.util.*;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn;
        String judul;
        String penulis;
        String tahun;
        String penerbit;
        String selfPublished;
        String harga;
        String diskon;
        String stok;
        double rating;
        String kualitas;
        
        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahun = input.nextLine();
        penerbit = input.nextLine();
        selfPublished = input.nextLine();
        harga = input.nextLine();
        diskon = input.nextLine();
        stok = input.nextLine();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            kualitas = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kualitas = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kualitas = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kualitas = "Average";
                    } else {
                        kualitas = "Low";
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + selfPublished + "|" + harga + "|" + diskon + "|" + stok + "|" + rating + "|" + kualitas);
    }
}
