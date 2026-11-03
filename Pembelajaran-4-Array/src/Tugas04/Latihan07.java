package Tugas04;

import javax.swing.JOptionPane;

public class Latihan07 {

    public static void main(String[] args) {

        int row = 2, column = 2;

        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] C = new int[row][column];

        String npm = JOptionPane.showInputDialog(
            "Masukkan NPM:"
        );

        int digitTerakhir = Integer.parseInt(
            npm.substring(npm.length() - 1)
        );

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                A[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai A[" + i + "][" + j + "]:"
                    )
                );
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                B[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai B[" + i + "][" + j + "]:"
                    )
                );
            }
        }

        // Menghitung Matriks C
        String operasi;

        if (digitTerakhir % 2 != 0) {

            operasi = "Penjumlahan Matriks C = A + B";

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }

        } else {

            operasi = "Pengurangan Matriks C = A - B";

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
        }

        String hasil = operasi + "\nMatriks C:\n";

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                hasil += C[i][j] + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(
            null, hasil, "Hasil Matriks",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
