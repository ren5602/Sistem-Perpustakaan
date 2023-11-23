import java.util.Scanner;

public class TambahBukuWithFunction {
    static final int MAX_BUKU = 100;
    static String[] judulBuku = new String[MAX_BUKU];
    static String[] penulisBuku = new String[MAX_BUKU];
    static int[] tahunTerbit = new int[MAX_BUKU];
    static int jumlahBuku = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistem Manajemen Perpustakaan");
            System.out.println("1. Tampilkan Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanBuku();
                    break;
                case 2:
                    if (jumlahBuku < MAX_BUKU) {
                        tambahBuku(scanner);
                    } else {
                        System.out.println("Maaf, kapasitas perpustakaan penuh.");
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Mohon masukkan opsi yang benar.");
            }
        }
    }

    static void tampilkanBuku() {
        System.out.println("\nDaftar Buku:");
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku yang tersedia.");
        } else {
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("Judul: " + judulBuku[i]);
                System.out.println("Penulis: " + penulisBuku[i]);
                System.out.println("Tahun Terbit: " + tahunTerbit[i]);
                System.out.println("-----------------------");
            }
        }
    }

    static void tambahBuku(Scanner scanner) {
        System.out.println("\nTambah Buku:");

        System.out.print("Masukkan judul: ");
        judulBuku[jumlahBuku] = scanner.nextLine();

        System.out.print("Masukkan penulis: ");
        penulisBuku[jumlahBuku] = scanner.nextLine();

        System.out.print("Masukkan tahun terbit: ");
        tahunTerbit[jumlahBuku] = scanner.nextInt();

        jumlahBuku++;

        System.out.println("Buku berhasil ditambahkan!");
    }
}
