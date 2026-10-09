package pembelajaran;

import java.util.Scanner;

public class Latihan08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("NPM           : ");
        String npm = input.nextLine();

        System.out.print("Nama Lengkap  : ");
        String nama = input.nextLine();

        System.out.print("Nama Kelas    : ");
        String kelas = input.nextLine();

        System.out.print("Semester      : ");
        int semester = input.nextInt();

        System.out.print("IPK           : ");
        float ipk = input.nextFloat();

        System.out.println();
        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("NPM          : " + npm);
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Nama Kelas   : " + kelas);
        System.out.println("Semester     : " + semester);
        System.out.println("IPK          : " + ipk);

        input.close();
    }
}