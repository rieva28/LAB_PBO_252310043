package Tugas05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        String[][] isiData = {
            {"Septian Cahyadi",
             "Dramaga cantik residence II, Bogor",
             "+62 899-9506-210"},

            {"Isnan Mulia",
             "Jl.Manunggal, Bogor",
             "+62 819-3208-0875"},

            {"Edi Nurachmand",
             "Taman Cimanggu Permai, Bogor",
             "+62 856-9380-0384"}
        };

        for (int i = 0; i < 3; i++) {

            ArrayList<String> baris = new ArrayList<>();

            String nama = JOptionPane.showInputDialog(
                "Masukkan Nama Lengkap:",
                isiData[i][0]
            );

            String alamat = JOptionPane.showInputDialog(
                "Masukkan Alamat:",
                isiData[i][1]
            );

            String telp = JOptionPane.showInputDialog(
                "Masukkan No Telp:",
                isiData[i][2]
            );

            baris.add(nama);
            baris.add(alamat);
            baris.add(telp);

            data.add(baris);
        }

        Collections.sort(data, new Comparator<ArrayList<String>>() {

            public int compare(ArrayList<String> a,
                               ArrayList<String> b) {

                return a.get(0).compareToIgnoreCase(b.get(0));
            }
        });

        String hasil = "DATA DOSEN (ASCENDING)\n\n";

        for (int i = 0; i < data.size(); i++) {

            hasil += "Nama Lengkap: " + data.get(i).get(0) + "\n";
            hasil += "Alamat: " + data.get(i).get(1) + "\n";
            hasil += "No Telp: " + data.get(i).get(2) + "\n\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
