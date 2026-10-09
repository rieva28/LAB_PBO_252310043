package pembelajaran;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Students myBio = new Students();

        // Input data member
        System.out.print("Masukkan NPM Member: ");
        int npm = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Nama Member: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Class Name: ");
        String className = input.nextLine();

        System.out.print("Masukkan Semester: ");
        int semester = input.nextInt();

        System.out.print("Masukkan GPA: ");
        float gpa = input.nextFloat();

        myBio.getNPM(npm);
        myBio.getFullname(nama);
        myBio.getClassName(className);
        myBio.getSemester(semester);
        myBio.getGPA(gpa);

        // Input produk
        System.out.print("Masukkan jumlah produk yang dibeli: ");
        int qty = input.nextInt();

        final String PRODUK = "ROTI ENAK";
        final double HARGA = 6300;

        double total = qty * HARGA;

        double diskon = 0;

        if (qty % 3 == 0) {
            diskon = total * 0.05;
        }

        double subTotal = total - diskon;

        LocalDateTime sekarang = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        // Cetak kwitansi
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
                PRODUK, qty, HARGA, total);

        System.out.println("--------------------------------------------------");

        System.out.println("Member Name : " + myBio.getFullname());

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