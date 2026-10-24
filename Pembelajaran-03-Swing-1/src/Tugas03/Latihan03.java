package Tugas03;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        while (true) {
            String nama = JOptionPane.showInputDialog(
                    "Masukkan nama lengkap:");

            if (nama == null) {
                return;
            }

            if (nama.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field fullname tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            String usiaInput = JOptionPane.showInputDialog(
                    "Masukkan usia:");

            if (usiaInput == null) {
                return;
            }

            if (usiaInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Usia tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            int usia;

            try {
                usia = Integer.parseInt(usiaInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Isian usia harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            String alamat = JOptionPane.showInputDialog(
                    "Masukkan alamat:");

            if (alamat == null) {
                return;
            }

            if (alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Alamat tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            data.setFullname(nama);
            data.setUsia(usia);
            data.setAlamat(alamat);

            JOptionPane.showMessageDialog(null,
                    "Nama: " + data.getFullname()
                    + "\nUsia: " + data.getUsia()
                    + "\nAlamat: " + data.getAlamat(),
                    "Data Biodata",
                    JOptionPane.INFORMATION_MESSAGE);
          
            if (keluar()) {
            break;
        }
    }
}
    public static boolean keluar() {
        int pilih = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);

        return pilih == JOptionPane.YES_OPTION;
    }
}