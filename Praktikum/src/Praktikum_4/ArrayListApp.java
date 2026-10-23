package Praktikum_4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Vanny"); // input data
		System.out.println(nama.get(0));
		
		// input dari user menggunakan jop
		JOptionPane jop = new JOptionPane();
		nama.add(jop.showInputDialog(null, "Input nama: "));
		jop.showInputDialog(null, "Nama: "+ nama.getLast());
		
		nama.remove(0); // menghapus
		System.out.println("Nama setelah dihapus: " + nama.get(0));
		
		// pertanyaan
//		System.out.println(nama.get(1));
		
		nama.add("Ade");
		nama.add("Lauren");
		System.out.println("List Nama: ");
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(i));
		}
		
		nama.clear(); // menghapus semua data
		System.out.println(nama.size());
	}
}
