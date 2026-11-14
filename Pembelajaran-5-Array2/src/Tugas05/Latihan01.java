package Tugas05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        
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

        String hasil = "Matriks A:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += A.get(i).get(j) + "\t";
            }
            hasil += "\n";
        }

        hasil += "\nMatriks B:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += B.get(i).get(j) + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
