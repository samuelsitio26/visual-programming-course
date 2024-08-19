// 12S22032-Samuel Sitio
import java.util.*;



public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn;
        String judul;
        String penulis;
        String tahunterbit;
        String penerbit;
        String formatbuku;
        double hargapembelian;
        double minmargin;
        int stok;
        double rating;
        
        kodeisbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargapembelian = input.nextDouble();
        minmargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minmargin + "|" + stok + "|" + rating);
    }
}
