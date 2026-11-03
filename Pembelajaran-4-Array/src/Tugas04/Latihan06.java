package Tugas04;

import javax.swing.JOptionPane;

public class Latihan06 {

    public static void main(String[] args) {

        int row = 2, column = 2;

        int[][] A = new int[row][column];
        int[][] B = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                A[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai A[" + i + "][" + j + "]"
                    )
                );
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                B[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai B[" + i + "][" + j + "]"
                    )
                );
            }
        }

        String hasil = "Matriks A\n";

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                hasil += A[i][j] + "\t";
            }
            hasil += "\n";
        }

        hasil += "Matriks B\n";

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                hasil += B[i][j] + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
