import java.util.Scanner;
public class KatalogBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxBuku = 100, maxAtributBuku = 7, jumlahBuku=0;
        String[][] perpustakaan = new String[maxBuku][maxAtributBuku];

        System.out.println("\n______________________________");
        System.out.println("______________________________");
        System.out.println("        Selamat  Datang       ");
        System.out.println("        di Katalog Buku       ");
        System.out.println("------------------------------");
        System.out.println("      Sistem Perpustakaan     ");
        System.out.println("      Pangeran Diponegoro     ");
        System.out.println("______________________________");

        System.out.println("\n ______________________");
        System.out.println("|     Katalog Buku     |");
        System.out.println("|______________________|");
        System.out.println("| 1. Novel             |");
        System.out.println("| 2. Komik             |");
        System.out.println("| 3. Cerpen            |");
        System.out.println("| 4. Sejarah           |");
        System.out.println("| 5. Ilmu Pengetahuan  |");
        System.out.println("|______________________|");
        System.out.print("\nMasukkan Kategori Buku (1/2/3): ");
        int kategori = input.nextInt();

        if (jumlahBuku > 0) {
            while (true) {
                for (int i = 0; i < jumlahBuku; i++) {
                    switch (kategori) {

                        case 1:
                            if (perpustakaan[i][6].equalsIgnoreCase("novel")) {
                                System.out.println("_______________________________");
                                System.out.println(" Judul          : " + perpustakaan[i][0]);
                                System.out.println(" Penulis        : " + perpustakaan[i][1]);
                                System.out.println(" Penerbit       : " + perpustakaan[i][2]);
                                System.out.println(" Tahun Terbit   : " + perpustakaan[i][3]);
                                System.out.println(" ISBN           : " + perpustakaan[i][4]);
                                System.out.println(" Jumlah Halaman : " + perpustakaan[i][5]);
                                System.out.println("_______________________________");
                                input.nextLine();
                            }
                            break;

                        case 2:
                            if (perpustakaan[i][6].equalsIgnoreCase("komik")) {
                                System.out.println("_______________________________");
                                System.out.println(" Judul          : " + perpustakaan[i][0]);
                                System.out.println(" Penulis        : " + perpustakaan[i][1]);
                                System.out.println(" Penerbit       : " + perpustakaan[i][2]);
                                System.out.println(" Tahun Terbit   : " + perpustakaan[i][3]);
                                System.out.println(" ISBN           : " + perpustakaan[i][4]);
                                System.out.println(" Jumlah Halaman : " + perpustakaan[i][5]);
                                System.out.println("_______________________________");
                                input.nextLine();
                            }

                            break;

                        case 3:
                            if (perpustakaan[i][6].equalsIgnoreCase("cerpen")) {
                                System.out.println("_______________________________");
                                System.out.println(" Judul          : " + perpustakaan[i][0]);
                                System.out.println(" Penulis        : " + perpustakaan[i][1]);
                                System.out.println(" Penerbit       : " + perpustakaan[i][2]);
                                System.out.println(" Tahun Terbit   : " + perpustakaan[i][3]);
                                System.out.println(" ISBN           : " + perpustakaan[i][4]);
                                System.out.println(" Jumlah Halaman : " + perpustakaan[i][5]);
                                System.out.println("_______________________________");
                                input.nextLine();
                            }
                            break;

                        case 4:
                            if (perpustakaan[i][6].equalsIgnoreCase("sejarah")) {
                                System.out.println("_______________________________");
                                System.out.println(" Judul          : " + perpustakaan[i][0]);
                                System.out.println(" Penulis        : " + perpustakaan[i][1]);
                                System.out.println(" Penerbit       : " + perpustakaan[i][2]);
                                System.out.println(" Tahun Terbit   : " + perpustakaan[i][3]);
                                System.out.println(" ISBN           : " + perpustakaan[i][4]);
                                System.out.println(" Jumlah Halaman : " + perpustakaan[i][5]);
                                System.out.println("_______________________________");
                                input.nextLine();
                            }
                            break;

                        case 5:
                            if (perpustakaan[i][6].equalsIgnoreCase("ilmu pengetahuan")) {
                                System.out.println("_______________________________");
                                System.out.println(" Judul          : " + perpustakaan[i][0]);
                                System.out.println(" Penulis        : " + perpustakaan[i][1]);
                                System.out.println(" Penerbit       : " + perpustakaan[i][2]);
                                System.out.println(" Tahun Terbit   : " + perpustakaan[i][3]);
                                System.out.println(" ISBN           : " + perpustakaan[i][4]);
                                System.out.println(" Jumlah Halaman : " + perpustakaan[i][5]);
                                System.out.println("_______________________________");
                                input.nextLine();
                            }
                            break;

                        default:
                            System.out.println("Kategori Tidak Tersedia");
                            break;

                    }
                
                }
                
            }

        } else {
            System.out.println("\n=================================");
            System.out.println(" Belum ada buku yang ditambahkan ");
            System.out.println("=================================");
        }
}
}
