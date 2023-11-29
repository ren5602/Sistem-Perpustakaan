import java.util.Scanner;

public class tambahBuku {
    public static final int MAX_BUKU = 100;
    public static int jumlahBuku;
    public static String[][] dataBuku = new String[MAX_BUKU][7];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBuku();
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

    public static void tambahBuku() {
        while (jumlahBuku < MAX_BUKU) {
            System.out.println("Masukkan informasi buku:");

            System.out.print("Judul: ");
            dataBuku[jumlahBuku][0] = scanner.nextLine();

            System.out.print("Penulis: ");
            dataBuku[jumlahBuku][1] = scanner.nextLine();

            System.out.print("Penerbit: ");
            dataBuku[jumlahBuku][2] = scanner.nextLine();

            System.out.print("Tahun Terbit: ");
            dataBuku[jumlahBuku][3] = scanner.nextLine();

            System.out.print("ISBN: ");
            dataBuku[jumlahBuku][4] = scanner.nextLine();

            System.out.print("Jumlah Halaman: ");
            dataBuku[jumlahBuku][5] = scanner.nextLine();

            System.out.print("Genre Buku: ");
            dataBuku[jumlahBuku][6] = scanner.nextLine();

            System.out.println("Apakah anda ingin menambah data lagi (ya/tidak) ?");
            String pilih = scanner.nextLine();

            if (pilih.equalsIgnoreCase("ya")) {
                
                jumlahBuku++; // Increment jumlahBuku only when a book is added
            }else if(pilih.equalsIgnoreCase("tidak")) {
                System.out.println("Buku berhasil ditambahkan!");
		break;
	    } else {
            	System.out.println("Proses invalid");
        }
            }if(jumlahBuku == MAX_BUKU){
            System.out.println("Maaf, perpustakaan penuh. Tidak dapat menambahkan buku baru.");
            }
        }

    public static void tampilkanDaftarBuku() {
        for (int i = 0; i < MAX_BUKU; i++) {
            if (dataBuku[i][0] != null && !dataBuku[i][0].isEmpty()) {
                System.out.println("Buku ke-" + (i + 1));
                System.out.println("Judul: " + dataBuku[i][0]);
                System.out.println("Penulis: " + dataBuku[i][1]);
                System.out.println("Penerbit: " + dataBuku[i][2]);
                System.out.println("Tahun Terbit: " + dataBuku[i][3]);
                System.out.println("ISBN: " + dataBuku[i][4]);
                System.out.println("Jumlah Halaman: " + dataBuku[i][5]);
                System.out.println("Genre Buku: " + dataBuku[i][6]);
                System.out.println("------------------------------");
            }
        }
    }
}
