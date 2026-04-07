public class Kalkulator5 {
    static double tambah(double a, double b) {
        double hasil = a + b;
        return hasil;
    }
    static double kurang(double a, double b) {
        double hasil = a - b;
        return hasil;
    }
    public double kali(double a, double b) {
        double hasil = a * b;
        return hasil;
    }
    public double bagi(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Pembagian dengan nol tidak diperbolehkan.");
        }
        double hasil = a / b;
        return hasil;
    }
    public void sederhana(int pembilang, int penyebut) {
        if (penyebut == 0) {
            System.out.println("Penyebut tidak boleh nol!");
            return;
        }

    
        int a = Math.abs(pembilang);
        int b = Math.abs(penyebut);
        
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;
        }
        int fpb = a; 

        int hasilPembilang = pembilang / fpb;
        int hasilPenyebut = penyebut / fpb;
        if (hasilPembilang % hasilPenyebut == 0) {
            System.out.print(hasilPembilang / hasilPenyebut);
        }
        else {
        System.out.print( hasilPembilang + "/" + hasilPenyebut);
        }
    }



}
class Jaket {
    final int HARGA_A = 100000;
    final int HARGA_B = 125000;
    final int HARGA_C = 175000;

    public void hitungTotal(String tipe, int jumlah) {
        long totalHarga = 0;
        int hargaSatuan = 0;

        switch (tipe.toUpperCase()) {
            case "A":
                hargaSatuan = (jumlah > 100) ? 95000 : HARGA_A;
                totalHarga = (long) jumlah * hargaSatuan;
                break;
            case "B":
                hargaSatuan = (jumlah > 100) ? 120000 : HARGA_B;
                totalHarga = (long) jumlah * hargaSatuan;
                break;
            case "C":
                hargaSatuan = (jumlah > 100) ? 160000 : HARGA_C;
                totalHarga = (long) jumlah * hargaSatuan;
                break;
            default:
                System.out.println("Tipe jaket tidak tersedia.");
                return;
        }

        System.out.println("Tipe Jaket  : " + tipe.toUpperCase());
        System.out.println("Jumlah Beli : " + jumlah + " buah");
        System.out.printf("Harga/pcs   : Rp %,d.00", hargaSatuan);
        System.out.println();
        System.out.printf("Total Bayar : Rp %,d.00", totalHarga);
        System.out.println();
        System.out.println();
    }
}
class MainPraktikum {
    public static void main(String[] args) {
        System.out.println("=== TEST NOMOR 1 (MATEMATIKA) ===");
        
        System.out.println("Hasil Penjumlahan (10+5): " + Kalkulator5.tambah(10, 5));
        System.out.println("Hasil Pengurangan (10-5): " + Kalkulator5.kurang(10, 5));
        
        
        Kalkulator5 math = new Kalkulator5();
        System.out.println("Hasil Perkalian (10*5): " + math.kali(10, 5));
        System.out.println("Hasil Pembagian (10/5): " + math.bagi(10, 5));
        System.out.print("Hasil Penyederhanaan (20/50): ");
        math.sederhana(20, 50);
        System.out.println();
        System.out.print("Hasil Penyederhanaan (20/10): ");
        math.sederhana(20, 10);
        System.out.println();


        System.out.println("=== TEST NOMOR 2 & 3 (JAKET) ===");
        Jaket toko = new Jaket();
        
      
        toko.hitungTotal("A", 50);

        toko.hitungTotal("B", 150);

        toko.hitungTotal("C", 120);
    }
}
