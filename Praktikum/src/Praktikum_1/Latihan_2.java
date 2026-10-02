package Praktikum_1;

import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[] args) {
        System.out.println("Program Menghitung Harga Total Tanah");
        
        Scanner scanner = new Scanner(System.in);
        Tanah tanah = new Tanah();
        int harga_tanah = 5000000;
       

        System.out.println("Masukkan Luas Tanah: ");
        tanah.luas = scanner.nextInt();

        double total_harga = tanah.luas * harga_tanah;
        
        System.out.println("Total harga adalah: " + total_harga);
    }
}