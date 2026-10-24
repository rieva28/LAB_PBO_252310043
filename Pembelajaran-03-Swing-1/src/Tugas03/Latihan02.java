package Tugas03;

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String nama = JOptionPane.showInputDialog("Masukkan nama: ");
        String usia = JOptionPane.showInputDialog("Masukkan usia: ");
        String alamat = JOptionPane.showInputDialog("Masukkan alamat: ");

        data.setFullname(nama);
        data.setUsia(Integer.parseInt(usia));
        data.setAlamat(alamat);

        JOptionPane.showMessageDialog(null,
                "Nama: " + data.getFullname()
                + "\nUsia: " + data.getUsia()
                + "\nAlamat: " + data.getAlamat());
    }
}

