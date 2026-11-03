package Tugas04;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {

    public static void main(String[] args) {

        ArrayList<Integer> nilai = new ArrayList<Integer>();

        int jumlah = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Masukkan jumlah array:"
            )
        );

        for (int i = 0; i < jumlah; i++) {

            int angka = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan angka:"
                )
            );

            nilai.add(angka);
        }

        int terbesar = nilai.get(0);
        int terkecil = nilai.get(0);

        for (int i = 1; i < nilai.size(); i++) {

            if (nilai.get(i) > terbesar) {
                terbesar = nilai.get(i);
            }

            if (nilai.get(i) < terkecil) {
                terkecil = nilai.get(i);
            }
        }

        String hasil = "";

        for (int i = 0; i < nilai.size(); i++) {
            hasil += "x[" + i + "]=" + nilai.get(i) + "\n";
        }

        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(
            null,
            hasil,
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
