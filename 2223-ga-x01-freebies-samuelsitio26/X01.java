// 12S22032 - Samuel Janring Sitio 
// 12S22028 - Tennov Pakpahan
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargaBuku, total, hargaBukuTermurah;
        int buku;
        
        total = 0;
        hargaBuku = input.nextDouble();
        hargaBukuTermurah = hargaBuku;
        while (hargaBuku != 0) {
            if (hargaBuku < hargaBukuTermurah) {
                hargaBukuTermurah = hargaBuku;
            }
            total = total + hargaBuku;
            hargaBuku = input.nextDouble();
        }
        if (total > 100) {
            total = total - hargaBukuTermurah;
        } else {
            total = total;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
