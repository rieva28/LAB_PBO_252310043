package pembelajaran;

import java.util.Scanner;

public class Latihan03 {

    static double phi = 3.14;
    
    // NPM saya 252310043 (ganjil) jadi membuat segitiga kerucut dan tabung
    static double luasKerucut(double r, double s) {
        return phi * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return (1.0 / 3.0) * phi * r * r * t;
    }

    static double luasTabung(double r, double t) {
        return 2 * phi * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return phi * r * r * t;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double jariKerucut;
        double tinggiKerucut;
        double garisPelukis;

        System.out.println("SEGITIGA KERUCUT");

        System.out.print("Masukkan jari-jari kerucut: ");
        jariKerucut = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        tinggiKerucut = input.nextDouble();

        System.out.print("Masukkan garis pelukis kerucut: ");
        garisPelukis = input.nextDouble();

        double luasK = luasKerucut(jariKerucut, garisPelukis);
        double volumeK = volumeKerucut(jariKerucut, tinggiKerucut);

        System.out.println("Luas permukaan kerucut: " + luasK);
        System.out.println("Volume kerucut: " + volumeK);

        double jariTabung;
        double tinggiTabung;

        System.out.println();
        System.out.println("TABUNG");

        System.out.print("Masukkan jari-jari tabung: ");
        jariTabung = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        tinggiTabung = input.nextDouble();

        double luasT = luasTabung(jariTabung, tinggiTabung);
        double volumeT = volumeTabung(jariTabung, tinggiTabung);

        System.out.println("Luas permukaan tabung: " + luasT);
        System.out.println("Volume tabung: " + volumeT);

        input.close();
    }
}