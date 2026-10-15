package Tugas02;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pinBenar = "252310043";

        String pin;
        long saldo = 1000000;
        int pilihan;

        do {
            System.out.print("Masukkan PIN: ");
            pin = input.next();
        } while (!pin.equals(pinBenar));

        System.out.println("PIN benar.");

        do {
            System.out.println("\nMenu ATM");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Jumlah setor: Rp ");
                    long setor = input.nextLong();

                    if (setor > 0) {
                        saldo += setor;
                        System.out.println("Setor tunai berhasil.");
                    } else {
                        System.out.println("Jumlah tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Jumlah tarik: Rp ");
                    long tarik = input.nextLong();

                    if (tarik > 0 && tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil.");
                    } else {
                        System.out.println(
                            "Saldo tidak cukup atau jumlah tidak valid."
                        );
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
