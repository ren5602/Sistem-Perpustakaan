import java.util.Scanner;

public class tambahBuku {
    private static final int MAX_BUKU = 100; // Jumlah maksimal buku dalam perpustakaan
    private static Buku[] daftarBuku = new Buku[MAX_BUKU];
    private static int jumlahBuku = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("____________________________________");
            System.out.println("|         Fitur Tambah Buku        |");
            System.out.println("|==================================|");
            System.out.println("| Perpustakaan Pangeran Diponegoro |");
            System.out.println("|                                  |");
            System.out.println("|                                  |");
            System.out.println("|         1. Tambah Buku           |");
            System.out.println("|       2. Tampilkan Daftar Buku   |");
            System.out.println("|            3. Keluar             |");
            System.out.println("|                                  |");
            System.out.println("|                                  |");
            System.out.println("|__________________________________|");
            System.out.print("Pilih menu (1/2/3): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline karakter setelah input angka

            switch (pilihan) {
                case 1:
                    tambahBuku(scanner);
                    break;
                case 2:
                    tampilkanDaftarBuku();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        if (jumlahBuku < MAX_BUKU) {
            System.out.println("Masukkan informasi buku:");

            System.out.print("Judul: ");
            String judul = scanner.nextLine();

            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();

            System.out.print("Penerbit: ");
            String penerbit = scanner.nextLine();

            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine();

            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            System.out.print("Jumlah Halaman: ");
            int jumlahHalaman = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline karakter setelah input angka

            Buku buku = new Buku(judul, penulis, isbn, jumlahHalaman, penerbit, tahunTerbit);
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;

            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Maaf, perpustakaan penuh. Tidak dapat menambahkan buku baru.");
        }
    }

    private static void tampilkanDaftarBuku() {
        if (jumlahBuku > 0) {
            System.out.println("Daftar Buku:");

            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("Buku ke-" + (i + 1));
                System.out.println("Judul: " + daftarBuku[i].getJudul());
                System.out.println("Penulis: " + daftarBuku[i].getPenulis());
                System.out.println("ISBN: " + daftarBuku[i].getIsbn());
                System.out.println("Jumlah Halaman: " + daftarBuku[i].getJumlahHalaman());
                System.out.println("------------------------------");
            }
        } else {
            System.out.println("Belum ada buku dalam perpustakaan.");
        }
    }
}

class Buku {
    private String judul;
    private String penulis;
    private String isbn;
    private int jumlahHalaman;
    private String penerbit;
    private int tahunTerbit;

    public Buku(String judul, String penulis, String isbn, int jumlahHalaman, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}
