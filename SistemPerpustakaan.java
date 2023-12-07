import java.util.Scanner;
import java.util.Date;

public class SistemPerpustakaan {
    static Scanner input = new Scanner(System.in);

    // note: rek kalau semisal mau deklarasi variable terus saling berhubungan dengan fitur lain deklarasino disini yo.... (aziz)
    static int jumlahBuku = 0; // jumlah buku awal
    static int maxBuku = 100; // Batas Maksimal Buku
    static int maxAtributBuku = 7; // Batas Maksimal Atribut

    static String nama, namaBuku; // nama buku untuk peminjaman
    static Date tanggalPinjam, tanggalPengembalian; // tanggal peminjaman dan pengembalian
    static String namaPeminjam; // nama peminjam
    static int banyakBuku, maxPinjam = 3;
    static boolean meminjam = false;
    static boolean valid = false;

    static String perpustakaan[][] = new String[maxBuku][maxAtributBuku];
    // Batas Maksimal Percobaan
    public static int maxPercobaan=0;
    public static void SelectAdmin(){
        String username, password;
        String[][] login_admin = {{"admin1","pass1"},{"admin2","pass2"},{"admin3","pass3"}};

        System.out.println("---------- ADMIN ----------");
        System.out.print("Silahkan Masukkan Username Terlebih dauhulu : ");
        username = input.nextLine();
        System.out.print("Silahkan Masukkan Password : ");
        password = input.nextLine();
        int count = 0; // "count" dimulai dari 0 untuk mengecek apakah username dan password benar
        for(int i = 0; i < login_admin.length; i++){
            if(username.equals(login_admin[i][0]) && password.equals(login_admin[i][1])){ // jika username dan password benar maka "count" akan bernilai 1
                count = 1;
            }
        }
        if(count == 1){
            System.out.print("Login anda telah berhasil");
            System.out.println("");

            // masukkan konten untuk mengakses fungsi admin
            menuAdmin();
        }else{
            if (maxPercobaan == 2){
                System.out.println("Batas Percobaan Login Telah Tercapai");
                main(null); // kembali ke fungsi utama dengan cara memanggil fungsi utama
            }else{
                maxPercobaan++;
                System.out.println("Username atau Password yang anda masukkan salah");
                SelectAdmin(); // kembali ke fungsi SelectAdmin untuk mencapai batas percobaan
            }
        }
    }
    public static void SelectUser(){
        String username, password;
        String[][] login_user = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};

        System.out.println("---------- User ----------");
        System.out.print("Silahkan Masukkan Username Terlebih dauhulu : ");
        username = input.nextLine();
        System.out.print("Silahkan Masukkan Password : ");
        password = input.nextLine();
        int count = 0; // "count" dimulai dari 0 untuk mengecek apakah username dan password benar
        for(int i = 0; i < login_user.length; i++){
            if(username.equals(login_user[i][0]) && password.equals(login_user[i][1])){ // jika username dan password benar maka "count" akan bernilai 1
                count = 1;
            }
        }
        if(count == 1){
            System.out.print("Login anda telah berhasil");
            System.out.println("");

            // masukkan konten untuk mengakses fungsi user
            menuUser();
        }else{
            if (maxPercobaan == 2){
                System.out.println("Batas Percobaan Login Telah Tercapai");
                main(null); // kembali ke fungsi utama dengan cara memanggil fungsi utama
            }else{
                maxPercobaan++;
                System.out.println("Username atau Password yang anda masukkan salah");
                SelectUser(); // kembali ke fungsi SelectAdmin untuk mencapai batas percobaan
            }
        }
    }
    public static void main(String[] args) {
        String login;
        // Tampilan awal ketika program dijalankan
        System.out.println("__________________________________");
        System.out.println("");
        System.out.println("          Selamat Datang          ");
        System.out.println("      Di Sistem Perpustakaan      ");
        System.out.println("        Pangeran Diponegoro       ");
        System.out.println("");
        System.out.println("__________________________________");

        // Pilih otoritas antara admin dan user
        System.out.println("Pilih Otoritas anda :");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("3. Exit");
        System.out.print("Masukkan Pilihan anda : ");
        // input untuk pilihan antara admin atau user
        login = input.nextLine();

        // logika ketika memilih 1 sebagai admin
        if(login.equals("1")){
            SelectAdmin();            
        // logika ketika memilih 2 sebagai user
        }else if(login.equals("2")){
            SelectUser();
        }else if(login.equals("3")){
            System.exit(0);
        }
    }
    public static void menuAdmin(){        
        System.out.println(" __________________________________");
        System.out.println("|            DAFTAR MENU           |");
        System.out.println("|        Sistem Perpustakaan       |");
        System.out.println("|        Pangeran Diponegoro       |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 1. Katalog Buku                  |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 2. Cari Buku                     |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 3. Aturan Peminjaman dan         |");
        System.out.println("|    Pembelian                     |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 4. Form Peminjaman               |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 5. Pengembalian Buku             |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 6. Form Keterlambatan            |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 7. Form Pembelian Buku           |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 8. Penambahan Buku               |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 9. Riwayat                       |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 10. Log Out                      |");
        System.out.println("|__________________________________|");

        System.out.print("\nPilih Menu : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                KatalogBuku();
                break;
            case 2:
            case 3:
                aturanPeminjaman();
                break;
            case 4:
                Peminjaman();
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                PenambahanBuku();
                break;
            case 9:
            case 10:
                LogOut();
        }
    }
    // fungsi dari katalog buku
    static void KatalogBuku(){
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
        System.out.println("| 6. Purchasable       |");
        System.out.println("|______________________|");

        System.out.print("\nMasukkan Kategori Buku: ");
        int kategori = input.nextInt();
        if (jumlahBuku > 0){
            for ( int i = 0; i < jumlahBuku; i++) {
                switch (kategori){
                    case 1:
                    if (perpustakaan[i][6].equalsIgnoreCase("novel")){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                        System.out.println("-" + perpustakaan[i][0]);
                        System.out.println("Penulis: " + perpustakaan[i][1]);

                    } 
                    break;
                    
                
                    case 2:
                    if (perpustakaan[i][6].equalsIgnoreCase("komik")){
                        System.out.println("-" + perpustakaan[i][0]);
                        System.out.println("Penulis: " + perpustakaan[i][1]);

                    }
            
                    break;

                    case 3:
                    if (perpustakaan[i][6].equalsIgnoreCase("cerpen")) {
                        System.out.println("-" + perpustakaan[i][0]);
                        System.out.println("Penulis: " + perpustakaan[i][1]);

                    }
                    break;

                    case 4:
                    if (perpustakaan[i][6].equalsIgnoreCase("sejarah")) {
                        System.out.println("-" + perpustakaan[i][0]);
                    }
                    break;

                    case 5:
                    if (perpustakaan[i][6].equalsIgnoreCase("ilmu pengetahuan")) {
                        System.out.println("-" + perpustakaan[i][0]);
                    }
                    break;

                    case 6:
                    if (perpustakaan[i][6].equalsIgnoreCase("purchasable")) {
                        System.out.println("-" + perpustakaan[i][0]);
                    }
                    break;
                    
                    default:
                    System.out.println("Kategori Tidak Tersedia");
                    break;
                }
            }
        } else {
            System.out.println("\n================================="); // jika belum ada buku yang ditambahkan akan menampilkan ini
            System.out.println(" Belum ada buku yang ditambahkan ");
            System.out.println("=================================");
        }

                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");
                  input.nextLine();
                    break;

                case 2:
                    System.out.println("\n______________________________");
                    System.out.println("______________________________");
                    System.out.println("        Selamat Datang        ");
                    System.out.println("         di Cari Buku         ");
                    System.out.println("------------------------------");
                    System.out.println("      Sistem Perpustakaan     ");
                    System.out.println("      Pangeran Diponegoro     ");
                    System.out.println("______________________________");
                    System.out.print("\nMasukkan Nama Buku: ");
                    String namaBuku = input.nextLine();
                    switch (namaBuku) {
                        case "Buku A":
                            System.out.println("\n ___________________________");
                            System.out.println("|                           |");
                            System.out.println("| Judul Buku      : Buku A  |");
                            System.out.println("| Penulis         : Si A    |");
                            System.out.println("| Jumlah Halaman  : 100     |");
                            System.out.println("| Letak           : Rak A   |");
                            System.out.println("| Baris           : 1       |");
                            System.out.println("|___________________________|");
                            break;

                        case "Buku B":
                            System.out.println("\n ___________________________");
                            System.out.println("|                           |");
                            System.out.println("| Judul Buku      : Buku B  |");
                            System.out.println("| Penulis         : Si B    |");
                            System.out.println("| Jumlah Halaman  : 100     |");
                            System.out.println("| Letak           : Rak A   |");
                            System.out.println("| Baris           : 2       |");
                            System.out.println("|___________________________|");
                            break;

                        case "Buku C":
                            System.out.println("\n ___________________________");
                            System.out.println("|                           |");
                            System.out.println("| Judul Buku      : Buku C  |");
                            System.out.println("| Penulis         : Si C    |");
                            System.out.println("| Jumlah Halaman  : 100     |");
                            System.out.println("| Letak           : Rak A   |");
                            System.out.println("| Baris           : 3       |");
                            System.out.println("|___________________________|");
                            break;

                        case "Buku D":
                            System.out.println("\n ___________________________");
                            System.out.println("|                           |");
                            System.out.println("| Judul Buku      : Buku D  |");
                            System.out.println("| Penulis         : Si D    |");
                            System.out.println("| Jumlah Halaman  : 100     |");
                            System.out.println("| Letak           : Rak B   |");
                            System.out.println("| Baris           : 1       |");
                            System.out.println("|___________________________|");
                            break;

                        case "Buku E":
                            System.out.println("\n ___________________________");
                            System.out.println("|                           |");
                            System.out.println("| Judul Buku      : Buku E  |");
                            System.out.println("| Penulis         : Si E    |");
                            System.out.println("| Jumlah Halaman  : 100     |");
                            System.out.println("| Letak           : Rak B   |");
                            System.out.println("| Baris           : 2       |");
                            System.out.println("|___________________________|");
                            break;

                        case "Buku F":
                            System.out.println("\n ___________________________");
                            System.out.println("|                           |");
                            System.out.println("| Judul Buku      : Buku F  |");
                            System.out.println("| Penulis         : Si F    |");
                            System.out.println("| Jumlah Halaman  : 100     |");
                            System.out.println("| Letak           : Rak B   |");
                            System.out.println("| Baris           : 3       |");
                            System.out.println("|___________________________|");
                            break;

                        default:
                            System.out.println("\n====================================");
                            System.out.println(" buku yang Anda cari tidak tersedia ");
                            System.out.println("====================================");
                    }
                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");
                    break;

                case 3:
                    String tanggalPeminjaman, tanggalPengembalian, namaPenulis, nama;
                    int banyakBuku, maxPinjam = 5;

                    System.out.println("\n______________________________");
                    System.out.println("______________________________");
                    System.out.println("        Selamat Datang        ");
                    System.out.println("      di Peminjaman Buku      ");
                    System.out.println("------------------------------");
                    System.out.println("      Sistem Perpustakaan     ");
                    System.out.println("      Pangeran Diponegoro     ");
                    System.out.println("______________________________");

        System.out.print("\nMasukkan Nama Anda            : ");
        input.nextLine();
        namaPeminjam = input.nextLine();

                    for (i = 0; i < maxPinjam; i++) {
                        System.out.print("\nMasukkan Nama Buku            : ");
                        namaBuku = input.nextLine();
                        System.out.print("Masukkan Nama Penulis         : ");
                        namaPenulis = input.nextLine();
                        if (namaBuku.equalsIgnoreCase(perpustakaan[i][0])
                                && namaPenulis.equalsIgnoreCase(perpustakaan[i][1])) {
                            meminjam = true;
                            valid = true;
                        } else {
                            System.out.println("Buku tidak tersedia");
                            meminjam = false;
                            valid = false;

                            i++;
                        }
                        if (meminjam) {
                            meminjam = true;
                            valid = true;
                            Date tanggalPinjam = new Date();

                            System.out.println("\n______________________________________________");
                            System.out.println("\n           Buku pinjaman ke-" + (i + 1));
                            System.out.println(" Nama Peminjam              : " + namaPeminjam);
                            System.out.println(" Nama Buku                  : " + namaBuku);
                            System.out.println(" Nama Penulis               : " + namaPenulis);
                            System.out.println(" Tanggal Peminjaman         : " + tanggalPinjam);

                            System.out.println("______________________________________________");
                            System.out.print("\nApakah Anda ingin meminjam buku lagi (y/n)? ");
                            String pinjamLagi = input.nextLine();
                            if (pinjamLagi.equalsIgnoreCase("n")) {
                                break;

            }

        }
    }
    //fungsi penambahan buku parents
    static void PenambahanBuku(){
        while (true) {
            System.out.println("____________________________________");
            System.out.println("|         Fitur Tambah Buku        |");
            System.out.println("|==================================|");
            System.out.println("| Perpustakaan Pangeran Diponegoro |");
            System.out.println("|                                  |");
            System.out.println("|                                  |");
            System.out.println("| 1. Tambah Buku                   |");
            System.out.println("| 2. Tampilkan Daftar Buku         |");
            System.out.println("| 3. Keluar                        |");
            System.out.println("|                                  |");
            System.out.println("|                                  |");
            System.out.println("|__________________________________|");
            System.out.print("Pilih menu (1/2/3): ");
            String pilihan = input.next();
            input.nextLine();

            switch (pilihan) {
                case "1":
                    tambahBuku();
                    break;

                case 4:
                    System.out.println("\n______________________________");
                    System.out.println("______________________________");
                    System.out.println("        Selamat Datang        ");
                    System.out.println("     di Pengembalian Buku     ");
                    System.out.println("------------------------------");
                    System.out.println("     Sistem Perpustakaan      ");
                    System.out.println("     Pangeran Diponegoro      ");
                    System.out.println("______________________________");
                    System.out.println(" ");
                    System.out.print("\nMasukkan Nama Peminjam            : ");
                    nama = input.nextLine();
                    System.out.print("Masukkan Judul Buku yang Dipinjam : ");
                    namaBuku = input.nextLine();
                    System.out.print("Masukkan Tanggal Pengembalian     : ");
                    tanggalPengembalian = input.nextLine();
                    System.out.println("\n__________________________________________________");
                    System.out.println("                 Terimakasih Telah                ");
                    System.out.println("            Melakukan Pengembalian Buku           ");
                    System.out.println("==================================================");
                    System.out.println(" Nama Peminjam                      : " + nama);
                    System.out.println(" Nama Buku yang telah dikembalikan  : " + namaBuku);
                    System.out.println(" Tanggal Pengembalian               : " + tanggalPengembalian);
                    System.out.println("==================================================");

                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");

                    break;
                case "3":
                    System.out.println("Terima kasih!");
                    menuAdmin();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
    // fungsi tambahbuku bagian parents
    static void tambahBuku() {
        while (jumlahBuku < maxBuku) {
            System.out.println("Masukkan informasi buku:");

            System.out.print("Judul: ");
            perpustakaan[jumlahBuku][0] = input.nextLine();

            System.out.print("Penulis: ");
            perpustakaan[jumlahBuku][1] = input.nextLine();

            System.out.print("Penerbit: ");
            perpustakaan[jumlahBuku][2] = input.nextLine();

            System.out.print("Tahun Terbit: ");
            perpustakaan[jumlahBuku][3] = input.nextLine();

            System.out.print("ISBN: ");
            perpustakaan[jumlahBuku][4] = input.nextLine();

            System.out.print("Jumlah Halaman: ");
            perpustakaan[jumlahBuku][5] = input.nextLine();

            System.out.print("Genre Buku: ");
            perpustakaan[jumlahBuku][6] = input.nextLine();
            jumlahBuku++;

            System.out.println("Apakah anda ingin menambah data lagi (ya/tidak) ?");
            String pilih = input.nextLine();

            if (pilih.equalsIgnoreCase("ya")) {
            }else if(pilih.equalsIgnoreCase("tidak")) {
                System.out.println("Buku berhasil ditambahkan!");
		break;
	    } else {
            	System.out.println("Proses invalid");
        }
        }if(jumlahBuku == maxBuku){
            System.out.println("Maaf, perpustakaan penuh. Tidak dapat menambahkan buku baru.");
            }
    }
        // fungsi dari tampilkan daftar buku yang baru ditambahkan bagian parents 
        public static void tampilkanDaftarBuku() {
        for (int i = 0; i < maxBuku; i++) {
            if (perpustakaan[i][0] != null && !perpustakaan[i][0].isEmpty()) {
                System.out.println("Buku ke-" + (i + 1));
                System.out.println("Judul: " + perpustakaan[i][0]);
                System.out.println("Penulis: " + perpustakaan[i][1]);
                System.out.println("Penerbit: " + perpustakaan[i][2]);
                System.out.println("Tahun Terbit: " + perpustakaan[i][3]);
                System.out.println("ISBN: " + perpustakaan[i][4]);
                System.out.println("Jumlah Halaman: " + perpustakaan[i][5]);
                System.out.println("Genre Buku: " + perpustakaan[i][6]);
                System.out.println("------------------------------");
            }
        }
    }
    static void LogOut(){
        System.out.println("\n_______________________________");
        System.out.println("_______________________________");
        System.out.println("       Log Out Berhasil !      ");
        System.out.println(" Terimakasih Telah Menggunakan ");
        System.out.println("-------------------------------");
        System.out.println("      Sistem Perpustakaan      ");
        System.out.println("      Pangeran Diponegoro      ");
        System.out.println("_______________________________");
        System.exit(0);
    }
    public static void menuUser(){
        System.out.println(" __________________________________");
        System.out.println("|            DAFTAR MENU           |");
        System.out.println("|        Sistem Perpustakaan       |");
        System.out.println("|        Pangeran Diponegoro       |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 1. Katalog Buku                  |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 2. Cari Buku                     |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 3. Aturan Peminjaman dan         |");
        System.out.println("|    Pembelian                     |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 4. Log Out                       |");
        System.out.println("|__________________________________|");

        System.out.print("\nPilih Menu : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                KatalogBukuUser();
                break;
            case 2:
            case 3:
                aturanPeminjamanUser();
                break;
            case 4:
                LogOut();
                break;
        }
    }
    static void KatalogBukuUser(){
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
        System.out.println("| 6. Purchasable       |");
        System.out.println("|______________________|");

        System.out.print("\nMasukkan Kategori Buku: ");
        int kategori = input.nextInt();
        if (jumlahBuku > 0){
            for ( int i = 0; i < jumlahBuku; i++) {
                switch (kategori){
                    case 1:
                    if (perpustakaan[i][6].equalsIgnoreCase("novel")){
                        System.out.println("-" + perpustakaan[i][0]);
                    } 
                    break;
                    
                
                    case 2:
                    if (perpustakaan[i][6].equalsIgnoreCase("komik")){
                        System.out.println("-" + perpustakaan[i][0]);
                    }
            
                    break;

                    case 3:
                    if (perpustakaan[i][6].equalsIgnoreCase("cerpen")) {
                        System.out.println("-" + perpustakaan[i][0]);
                    }
                    break;

                    case 4:
                    if (perpustakaan[i][6].equalsIgnoreCase("sejarah")) {
                        System.out.println("-" + perpustakaan[i][0]);
                    }
                    break;

                    case 5:
                    if (perpustakaan[i][6].equalsIgnoreCase("ilmu pengetahuan")) {
                        System.out.println("-" + perpustakaan[i][0]);
                    }
                    break;

                    case 6:
                    if (perpustakaan[i][6].equalsIgnoreCase("purchasable")) {
                        System.out.println("-" + perpustakaan[i][0]);
                    }
                    break;
                    
                    default:
                    System.out.println("Kategori Tidak Tersedia");
                    break;
                }
                
            }
        } else {
            System.out.println("\n=================================");
            System.out.println(" Belum ada buku yang ditambahkan ");
            System.out.println("=================================");
        }

        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine();
        input.nextLine();
        menuUser();
    }
    static void aturanPeminjamanUser(){
        String rule1 = "1. Apabila ingin meminjam buku, harap konfirmasi kepada petugas perpustakaan.             ";
        String rule2 = "2. Maksimal lama peminjaman buku adalah 7 hari.                                               ";
        String rule3 = "3. Apabila waktu peminjaman dirasa kurang, dapat memperpanjang waktu dengan konfirmasi kepada petugas.";
        String rule4 = "4. Keterlambatan pengembalian buku akan dikenakan denda dengan rincian sebagai berikut :";
        String rule5 = "  - Untuk buku bergenre Novel denda keterlambatan yang harus dibayar Rp5000/hari";
        String rule6 = "  - Untuk buku bergenre Komik denda keterlambatan yang harus dibayar Rp4000/hari";
        String rule7 = "  - Untuk buku bergenre Cerpen denda keterlambatan yang harus dibayar Rp3000/hari";
        String rule8 = "  - Untuk buku bergenre Sejarah denda keterlambatan yang harus dibayar Rp8000/hari";
        String rule9 = "  - Untuk buku bergenre Ilmu Pengetahuan denda keterlambatan yang harus dibayar Rp10000/hari";
        String rule10 ="5. Pembayaran denda keterlambatan dapat dibayarkan kepada petugas perpustakaan secara tunai maupun non tunai.";

        System.out.println("Aturan Peminjaman Buku:");
        System.out.println(rule1);
        System.out.println(rule2);
        System.out.println(rule3);
        System.out.println(rule4);
        System.out.println(rule5);
        System.out.println(rule6);
        System.out.println(rule7);
        System.out.println(rule8);
        System.out.println(rule9);
        System.out.println(rule10);
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine();
        input.nextLine();
        menuUser();
    }
}