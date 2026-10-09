package pembelajaran;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final String NAMA_PRODUK = "ROTI ENAK";
        final double HARGA = 6300;

        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = input.nextInt();

        double total = qty * HARGA;

        double diskon = 0;

        if (qty % 3 == 0) {
            diskon = total * 0.05;
        }

        double subTotal = total - diskon;

        LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println();
        System.out.println("==================================================");
        System.out.println("              TOKO SERBAGUNA IBIK");
        System.out.println("==================================================");
        System.out.println("Masukan jumlah produk yang dibeli : " + qty);
        System.out.println();
        System.out.println(sekarang.format(format));

        System.out.println("ITEM                 QTY       HARGA       TOTAL");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-9d Rp %-8.0f Rp %.0f%n",
                NAMA_PRODUK, qty, HARGA, total);

        System.out.println("--------------------------------------------------");
        if (diskon > 0) {
        	System.out.println("Diskon : 5%");
        } else {
        	System.out.println("Diskon : 0%");
        }

        System.out.printf("Sub Total : Rp %.0f%n", subTotal);

        System.out.println("==================================================");

        input.close();
    }
}