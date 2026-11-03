package Tugas04;

import javax.swing.JOptionPane;

public class Latihan08 {

    public static void main(String[] args) {

        String field[] = {
            "Nama Lengkap",
            "Alamat",
            "No Telp"
        };

        String data[][] = {
            {
                "Septian Cahyadi",
                "Dramaga cantik residence II, Bogor",
                "+62 899-9506-210\n"
            },
            {
                "Isnan Mulia",
                "Jl. Manunggal, Bogor",
                "+62 819-3208-0875\n"
            },
            {
                "Edi Nurachmand",
                "Taman Cimanggu Permai, Bogor",
                "+62 856-9380-0384"
            }
        };

        String hasil = "Data Biodata\n\n";

        for (int i = 0; i < data.length; i++) {


            for (int j = 0; j < data[i].length; j++) {

                hasil += field[j] + " : "
                       + data[i][j] + "\n";
            }
        }

        JOptionPane.showMessageDialog(
            null,
            hasil,
            "Data Biodata",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
