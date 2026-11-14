package Tugas05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int nilai = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai A[" + i + "][" + j + "]"
                    )
                );

                baris.add(nilai);
            }

            A.add(baris);
        }

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int nilai = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai B[" + i + "][" + j + "]"
                    )
                );

                baris.add(nilai);
            }

            B.add(baris);
        }

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int jumlah = 0;

                for (int k = 0; k < 2; k++) {
                    jumlah += A.get(i).get(k) * B.get(k).get(j);
                }

                baris.add(jumlah);
            }

            C.add(baris);
        }

        String hasil = "Hasil Perkalian Matriks A x B:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += C.get(i).get(j) + "\t";
            }

            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
