package Tugas01PBO;

class PesananFood {
    private String namaMenu;
    private int jumlah;
    private double totalHarga;

    public PesananFood(String namaMenu, int jumlah, double hargaSatuan) {
        this.namaMenu = namaMenu;
        this.jumlah = jumlah;
        this.totalHarga = jumlah * hargaSatuan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public String getNamaMenu() {
        return namaMenu;
    }
}

class Driver {
    private String namaDriver;
    private String status;

    public Driver(String namaDriver) {
        this.namaDriver = namaDriver;
        this.status = "Belum mengantar";
    }

    public void antarPesanan(PesananFood pesanan) {
        System.out.println(namaDriver + " mengantar "
                + pesanan.getNamaMenu());
        status = "Sedang mengantar";
    }

    public String getStatus() {
        return status;
    }
}

public class no10 {
    public static void main(String[] args) {
        PesananFood pesanan =
                new PesananFood("Nasi Goreng", 2, 15000);

        Driver driver = new Driver("Raiq");

        driver.antarPesanan(pesanan);

        System.out.println("Total harga: Rp"
                + pesanan.getTotalHarga());
        System.out.println("Status: " + driver.getStatus());
    }
}