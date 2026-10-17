package Tugas01PBO;

public class Kendaraan {
    String merek;
    String warna;

    void bergerak() {
        System.out.println("Kendaraan bergerak");
    }
}

class Mobil extends Kendaraan {
}

class Motor extends Kendaraan {
}