package Tugas04;

import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {

        int jumlah = Integer.parseInt(
            JOptionPane.showInputDialog(
            	"Masukkan jumlah array:"
            )
        );

        int[] nilai = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
        	
            nilai[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan angka:"
                )
            );
        }
        
        int terbesar = nilai[0];
        int terkecil = nilai[0];

        for (int i = 1; i < jumlah; i++) {

            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }

            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        String hasil = "";

        for (int i = 0; i < jumlah; i++) {
            hasil += "x[" + i + "]=" + nilai[i] + "\n";
        }

        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(
            null,
            hasil,
            "Output Array",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
