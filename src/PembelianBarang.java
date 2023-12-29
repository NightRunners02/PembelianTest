import java.util.Scanner;

public class PembelianBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar barang
        String[] daftarBarang = {"Baju", "Celana", "Sepatu", "Tas"};
        int[] hargaBarang = {50, 40, 80, 30};

        // Menampilkan daftar barang
        System.out.println("Daftar Barang:");
        for (int i = 0; i < daftarBarang.length; i++) {
            System.out.println((i + 1) + ". " + daftarBarang[i] + " - Rp" + hargaBarang[i]);
        }

        // Memilih barang
        System.out.print("Pilih nomor barang yang ingin dibeli: ");
        int nomorBarang = scanner.nextInt();

        if (nomorBarang >= 1 && nomorBarang <= daftarBarang.length) {
            int indexBarang = nomorBarang - 1;
            String barangDibeli = daftarBarang[indexBarang];
            int hargaDibeli = hargaBarang[indexBarang];

            // Menampilkan struk belanja
            System.out.println("\nStruk Belanja:");
            System.out.println("Barang: " + barangDibeli);
            System.out.println("Harga: Rp" + hargaDibeli);

            // Proses pembayaran
            System.out.print("\nMasukkan jumlah uang pembayaran: Rp");
            int jumlahPembayaran = scanner.nextInt();

            if (jumlahPembayaran >= hargaDibeli) {
                int kembalian = jumlahPembayaran - hargaDibeli;
                System.out.println("Pembelian berhasil!");
                System.out.println("Kembalian: Rp" + kembalian);
            } else {
                System.out.println("Maaf, uang pembayaran tidak mencukupi.");
            }

        } else {
            System.out.println("Nomor barang tidak valid.");
        }

        scanner.close();
    }
}
