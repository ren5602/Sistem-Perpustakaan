import java.util.Scanner;

public class tambahBuku {
    private static final int MAX_BUKU = 100; 
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
    public static String[][] dataBuku = new String[10][6];
    public static Scanner scanner = new Scanner(System.in);

    private static void tambahBuku() {
        for (int i = 0;jumlahBuku<MAX_BUKU;i++) {
        if (jumlahBuku < MAX_BUKU) {
            System.out.println("Masukkan informasi buku:");

            System.out.print("Judul: ");
            dataBuku[i][0] = scanner.nextLine();

            System.out.print("Penulis: ");
            dataBuku[i][1] = scanner.nextLine();

            System.out.print("Penerbit: ");
            dataBuku[i][2] = scanner.nextLine();

            System.out.print("Tahun Terbit: ");
            dataBuku[i][3] = scanner.nextLine();

            System.out.print("ISBN: ");
            dataBuku[i][4] = scanner.nextLine();

            System.out.print("Jumlah Halaman: ");
            dataBuku[i][5] = scanner.nextLine();

            System.out.println("Apakah anda ingin menambah data lagi ");
            System.out.println("Ketik 1 untuk IYA");
            System.out.println("Ketik 0 untuk TIDAK");
            System.out.println("Pilih Salah Satu : ");
            int Choice = scanner.nextInt();

            if(Choice == 0) {
                            i++;
            break;}

            


        
            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Maaf, perpustakaan penuh. Tidak dapat menambahkan buku baru.");
        }
    }
    }

    private static void tampilkanDaftarBuku() {
       

            for (int i = 0; i < MAX_BUKU; i++) {
                if (dataBuku[i][0] !=null && !dataBuku[i][0].isEmpty()) {
                System.out.println("Buku ke-" + (i + 1));
                System.out.println("Judul: " + dataBuku[i][0]);
                System.out.println("Penulis: " + dataBuku[i][1]);
                System.out.println("Penerbit: " + dataBuku[i][2]);
                System.out.println("Tahun Terbit: " + dataBuku[i][3]);
                System.out.println("ISBN: " + dataBuku[i][4]);
                System.out.println("Jumlah Halaman: " + dataBuku [i][5]);
                System.out.println("------------------------------");
                }
                break;
            }
       
    }
}

