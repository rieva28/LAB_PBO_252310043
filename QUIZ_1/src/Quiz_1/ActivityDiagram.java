package Quiz_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ActivityDiagram {
	public static void main(String[] args) {
		ArrayList<String> databuku = new ArrayList<String>();
		int menu = 0;
		do {
			String pilihMenu = JOptionPane.showInputDialog(null, 
			"Pilih Menu 1-4: " 
			+ "1. Masukkan Judul Buku yang ingin di input"
			+ "2. Masukkan Index Buku yang ingin di input"
			+ "3. Output seluruh data buku"
			+ "4. Keluar dari program");
			
			if (pilihMenu == null) {
				break;
			}
			
			menu = Integer.parseInt(pilihMenu);
            
            if (menu == 1) {
                String judul = JOptionPane.showInputDialog(null, "Masukkan Judul Buku: ");
                databuku.add(judul);
                JOptionPane.showMessageDialog(null, "Buku berhasil disimpan");
                
            } else if (menu == 2) {
                String indexStr = JOptionPane.showInputDialog(null, "Daftar Buku: " + databuku + "\nMasukkan Index yang ingin dihapus:");
                int index = Integer.parseInt(indexStr);
                databuku.remove(index);
                JOptionPane.showMessageDialog(null, "Buku berhasil dihapus");
                
            } else if (menu == 3) {
                JOptionPane.showMessageDialog(null, "Daftar Buku:\n" + databuku);
                
            } else if (menu == 4) {
                JOptionPane.showMessageDialog(null, "Keluar dari program.");
            }
            
        } while (menu != 4);
    }
}
			
