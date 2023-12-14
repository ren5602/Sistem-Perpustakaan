import java.util.Scanner;
import java.util.Date;

public class SistemPerpustakaan {
    static Scanner input = new Scanner(System.in);

    // note: rek kalau semisal mau deklarasi variable terus saling berhubungan dengan fitur lain deklarasino disini yo.... (aziz)
    static int jumlahBuku = 0; // jumlah buku awal
    static int maxBuku = 100; // Batas Maksimal Buku
    static int maxAtributBuku = 8; // Batas Maksimal Atribut
    static String novel = "Novel", komik = "Komik", cerpen = "Cerpen", sejarah = "Sejarah", ilmuPengetahuan = "Ilmu Pengetahuan", purchasable = "Purchasable";
    static boolean[] bukuTersedia = new boolean[maxBuku];

    static String nama, namaBuku; // nama buku untuk peminjaman
    static Date tanggalPinjam, tanggalPengembalian; // tanggal peminjaman dan pengembalian
    static String namaPeminjam; // nama peminjam
    static int banyakBuku, maxPinjam = 3;
    static boolean meminjam = false;
    static boolean valid = false;
    static String[][] riwayatPeminjaman = new String[100][5];
    static int jumlahRiwayat = 0;

    static String[][] riwayatPengembalian = new String[100][5];
    static int jumlahRiwayatPengembalian = 0;

 

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
                SelectUser(); // kembali ke fungsi SelectUser untuk mencapai batas percobaan
            }
        }
    }
    static void defaultData() {
        jumlahBuku = 4;
        
        perpustakaan[0][0] = "Harry Potter";
        perpustakaan[0][1] = "J.K Rowling";
        perpustakaan[0][2] = "Gramedia";
        perpustakaan[0][3] = "2000";
        perpustakaan[0][4] = "111";
        perpustakaan[0][5] = "636";
        perpustakaan[0][6] = novel;
        bukuTersedia[0] = true;



        perpustakaan[1][0] = "Naruto Vol 1";
        perpustakaan[1][1] = "Masashi Kishimoto";
        perpustakaan[1][2] = "Alex Media";
        perpustakaan[1][3] = "2003";
        perpustakaan[1][4] = "222";
        perpustakaan[1][5] = "194";
        perpustakaan[1][6] = komik;
        bukuTersedia[1] = true;



        perpustakaan[2][0] = "Gagal Menjadi Manusia";
        perpustakaan[2][1] = "Osamu Dazai";
        perpustakaan[2][2] = "Gramedia";
        perpustakaan[2][3] = "2000";
        perpustakaan[2][4] = "333";
        perpustakaan[2][5] = "700";
        perpustakaan[2][6] = purchasable;
        perpustakaan[2][7] = "Rp100.000,00";
        bukuTersedia[2] = true;




        perpustakaan[3][0] = "Detective Conan";
        perpustakaan[3][1] = "Aoyama Gosho";
        perpustakaan[3][2] = "Gramedia";
        perpustakaan[3][3] = "2020";
        perpustakaan[3][4] = "444";
        perpustakaan[3][5] = "50";
        perpustakaan[3][6] = purchasable;
        perpustakaan[3][7] = "Rp75.000,00";
        bukuTersedia[3] = true;

        
        
    }
    public static void main(String[] args) {
        defaultData();
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
        System.out.println(" _____________________________________________________________________");
        System.out.println("|                             DAFTAR MENU                             |");
        System.out.println("|                         Sistem Perpustakaan                         |");
        System.out.println("|                         Pangeran Diponegoro                         |");
        System.out.println("|__________________________________"+"___________________________________|");
        System.out.println("|                                  |"+"                                  |");
        System.out.println("| 1. Katalog Buku                  |"+" 6. Form Pembelian Buku           |");
        System.out.println("|__________________________________|"+"__________________________________|");
        System.out.println("|                                  |"+"                                  |");
        System.out.println("| 2. Cari Buku                     |"+" 7. Penambahan Buku               |");
        System.out.println("|__________________________________|"+"__________________________________|");
        System.out.println("|                                  |"+"                                  |");
        System.out.println("| 3. Aturan Peminjaman dan         |"+" 8. Riwayat                       |");
        System.out.println("|    Pembelian                     |"+"                                  |");
        System.out.println("|__________________________________|"+"__________________________________|");
        System.out.println("|                                  |"+"                                  |");
        System.out.println("| 4. Form Peminjaman               |"+" 9. Log Out                       |");
        System.out.println("|__________________________________|"+"__________________________________|");
        System.out.println("|                                  |");
        System.out.println("| 5. Pengembalian Buku             |");
        System.out.println("|__________________________________|");

        System.out.print("\nPilih Menu : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                KatalogBuku();
                break;
            case 2:
            CariBuku();
            break;
            case 3:
                aturanPeminjaman();
                break;
            case 4:
                Peminjaman();
                break;
            case 5:
                pengembalianBuku();
            case 6:
                Pembelian();
                break;
            case 7:
            PenambahanBuku();
                break;
            case 8:
            Riwayat();
                break;
            case 9:
            LogOut();
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                menuAdmin();
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
        

        System.out.print("\nMasukkan Kategori Buku (1/2/3/4/5/6): ");
        int kategori = input.nextInt();
        if(kategori > 6 || kategori == 0){
            System.out.println("Kategori Tidak Tersedia");
        }else if(kategori > 0 && kategori < 7){
            if(jumlahBuku > 0){
                System.out.printf("\n| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |%n", "Judul", "Penulis", "Penerbit", "Tahun Terbit", "ISBN", "Jml Halaman", "Status");
                System.out.println("|---------------------------|----------------------|-----------------|---------------|-----------------|-----------------|-------------------|");
                for ( int i = 0; i <= jumlahBuku; i++) { 
                    switch (kategori){
                        case 1:
                        if(perpustakaan[i][6] == novel){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;
                        
                        case 2:
                        if(perpustakaan[i][6] == komik){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;
                        
                        case 3:
                        if(perpustakaan[i][6] == cerpen){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;

                        case 4:
                        if(perpustakaan[i][6] == sejarah){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        } 
                        break;

                        case 5:
                        if(perpustakaan[i][6] == ilmuPengetahuan){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;
                        case 6:
                        if (perpustakaan[i][6] == purchasable) {
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        
                        }
                        break;
                        default:
                        System.out.println("Belum Ada Buku Yang Ditambahkan");
                    }
                }
            }else if(jumlahBuku == 0){
                System.out.println("\n================================="); // jika belum ada buku yang ditambahkan akan menampilkan ini
                System.out.println(" Belum ada buku yang ditambahkan ");
                System.out.println("=================================");
            }
        }
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu admin
        input.nextLine();
        menuAdmin();
        
    }
    //fungsi dari aturan peminjaman
    static void aturanPeminjaman(){
        String rule1 = "1. Apabila ingin meminjam buku, harap konfirmasi kepada petugas perpustakaan.             ";
        String rule2 = "2. Maksimal lama peminjaman buku adalah 7 hari.                                               ";
        String rule3 = "4. Keterlambatan pengembalian buku akan dikenakan denda dengan nominals sebesar Rp,-5000 :";
        String rule4 ="5. Pembayaran denda keterlambatan dapat dibayarkan kepada petugas perpustakaan secara tunai maupun non tunai.";

        System.out.println("Aturan Peminjaman Buku:");
        System.out.println(rule1);
        System.out.println(rule2);
        System.out.println(rule3);
        System.out.println(rule4);
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine();
        input.nextLine();
        menuAdmin();
    }

    static void CariBuku() {
        System.out.println("\n______________________________");
        System.out.println("______________________________");
        System.out.println("        Selamat  Datang       ");
        System.out.println("        di Pencarian Buku    ");
        System.out.println("------------------------------");
        System.out.println("      Sistem Perpustakaan     ");
        System.out.println("      Pangeran Diponegoro     ");
        System.out.println("______________________________");
    
        input.nextLine(); // Membersihkan buffer
        System.out.print("\nMasukkan informasi buku yang ingin dicari: ");
        String keyword = input.nextLine().toLowerCase();
    
        boolean ditemukan = false;
    
        System.out.printf("\n|  %-17s | %-17s | %-15s | %-15s | %-15s | %-15s | %-18s |%n", "Judul", "Penulis", "Penerbit", "Tahun Terbit", "ISBN", "Jml Halaman", "Status");
        System.out.println("|--------------------|-------------------|-----------------|-----------------|-----------------|-----------------|--------------------|");
    
        for (int i = 0; i < jumlahBuku; i++) {
            if (perpustakaan[i][0].toLowerCase().contains(keyword) ||
                perpustakaan[i][1].toLowerCase().contains(keyword) ||
                perpustakaan[i][2].toLowerCase().contains(keyword) ||
                perpustakaan[i][3].toLowerCase().contains(keyword) ||
                perpustakaan[i][4].toLowerCase().contains(keyword) ||
                perpustakaan[i][5].toLowerCase().contains(keyword)) {
                System.out.printf("|   %-17s|  %-17s|  %-15s|  %-15s|  %-15s|  %-15s|  %-18s|\n",
                        perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2],
                        perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5],
                        bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia");
                ditemukan = true;
            }
        }
    
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
    
        if (!ditemukan) {
            System.out.println("Buku dengan informasi tersebut tidak ditemukan.");
            menuAdmin();
        }
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu admin
        menuAdmin();
    }
    
    

    static void Peminjaman(){
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

        boolean meminjam = true;
        while (meminjam) {
            System.out.print("\nMasukkan Kode Buku            : ");
            namaBuku = input.nextLine();
            boolean bukuDitemukan = false;
        for (int i = 0; i < maxPinjam; i++) {
            if (namaBuku.equalsIgnoreCase(perpustakaan[i][4]) && bukuTersedia[i]) {
                bukuTersedia[i] = false;
                bukuDitemukan = true;
                tanggalPinjam = new Date();
                riwayatPeminjaman[jumlahRiwayat][0] = namaPeminjam;
                    riwayatPeminjaman[jumlahRiwayat][1] = perpustakaan[i][0];
                    riwayatPeminjaman[jumlahRiwayat][2] = perpustakaan[i][1];
                    riwayatPeminjaman[jumlahRiwayat][3] = tanggalPinjam.toString();
                    riwayatPeminjaman[jumlahRiwayat][4] = perpustakaan[i][4];
                    jumlahRiwayat++;

                System.out.println("\n______________________________________________");
                System.out.println(" Nama Peminjam              : " + namaPeminjam);
                System.out.println(" Nama Buku                  : " + perpustakaan[i][0]);
                System.out.println(" Nama Penulis               : " + perpustakaan[i][1]);
                System.out.println(" Tanggal Peminjaman         : " + tanggalPinjam);
                System.out.println("______________________________________________");
                System.out.print("\nApakah Anda ingin meminjam buku lagi (y/n)? ");
                String pinjamLagi = input.nextLine();
                if (pinjamLagi.equalsIgnoreCase("n")) {
                    meminjam = false;
                    menuAdmin();
                    
                }
            
        }
    
    
            } if (!bukuDitemukan) {
                System.out.println("Buku tidak ditemukan atau sedang tidak tersedia.");
                menuAdmin();
            }
            
            

        }
    }
    static void pengembalianBuku(){
        System.out.println("\n______________________________");
        System.out.println("______________________________");
        System.out.println("        Selamat Datang        ");
        System.out.println("    di Pengembalian Buku      ");
        System.out.println("------------------------------");
        System.out.println("      Sistem Perpustakaan     ");
        System.out.println("      Pangeran Diponegoro     ");
        System.out.println("______________________________");

        System.out.print("\nMasukkan Nama Anda            : ");
        input.nextLine();
        nama = input.nextLine();
        boolean bukuDitemukan = false;
        for (int i = 0; i < maxPinjam; i++) {
            System.out.print("\nMasukkan Kode Buku            : ");
            namaBuku = input.nextLine();
            if (namaBuku.equalsIgnoreCase(perpustakaan[i][4])&& !bukuTersedia[i]) {
                bukuTersedia[i] = true;
                meminjam = true;
                valid = true;
                riwayatPengembalian[jumlahRiwayatPengembalian][0] = namaPeminjam;
                riwayatPengembalian[jumlahRiwayatPengembalian][1] = perpustakaan[i][0];
                riwayatPengembalian[jumlahRiwayatPengembalian][2] = perpustakaan[i][1];
                riwayatPengembalian[jumlahRiwayatPengembalian][3] = tanggalPinjam.toString();
                riwayatPengembalian[jumlahRiwayatPengembalian][4] = perpustakaan[i][4];
                jumlahRiwayatPengembalian++;

            } else {
                System.out.println("\n=====================");
                System.out.println(" Buku tidak tersedia");
                System.out.println("=====================");
                meminjam = false;
                valid = false;
                menuAdmin();
            }
            if (meminjam) {
                meminjam = true;
                valid = true;
                tanggalPengembalian = new Date();
                long selisihHari = (tanggalPengembalian.getTime() - tanggalPinjam.getTime()) / (24 * 60 * 60 * 1000);
                if (selisihHari <= 7) {
                System.out.println("\n______________________________________________");
                System.out.println(" Nama Peminjam            : " + nama);
                System.out.println(" Nama Buku                : " + perpustakaan[i][0]);
                System.out.println(" Nama Penulis             : " + perpustakaan[i][1]);
                System.out.println(" Tanggal Pengembalian      : " + tanggalPengembalian);
                System.out.println("______________________________________________");
                }
                else {
                    int denda = (int) ((selisihHari - 7) * 5000);
                    System.out.println("\n______________________________________________");
                System.out.println(" Nama Peminjam         : " + nama);
                System.out.println(" Nama Buku             : " + perpustakaan[i][0]);
                System.out.println(" Nama Penulis          : " + perpustakaan[i][1]);
                System.out.println(" Tanggal Pengembalian  : " + tanggalPengembalian);
                System.out.println(" Denda                 : " + denda);
                System.out.println("______________________________________________");
                }
                System.out.print("\nApakah Anda ingin mengembalikan buku lagi (y/n)? ");
                String pinjamLagi = input.nextLine();
                if (pinjamLagi.equalsIgnoreCase("n")) {
                    menuAdmin();
                }

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
                case "2":
                    tampilkanDaftarBuku();
                    break;
                case "3":
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

            System.out.print("Judul         : ");
            perpustakaan[jumlahBuku][0] = input.nextLine();

            System.out.print("Penulis       : ");
            perpustakaan[jumlahBuku][1] = input.nextLine();

            System.out.print("Penerbit      : ");
            perpustakaan[jumlahBuku][2] = input.nextLine();

            System.out.print("Tahun Terbit  : ");
            perpustakaan[jumlahBuku][3] = input.nextLine();

            System.out.print("ISBN          : ");
            perpustakaan[jumlahBuku][4] = input.nextLine();

            System.out.print("Jumlah Halaman: ");
            perpustakaan[jumlahBuku][5] = input.nextLine();

            System.out.println ("______________________");
            System.out.println("|      Genre Buku      |");
            System.out.println("|______________________|");
            System.out.println("| 1. Novel             |");
            System.out.println("| 2. Komik             |");
            System.out.println("| 3. Cerpen            |");
            System.out.println("| 4. Sejarah           |");
            System.out.println("| 5. Ilmu Pengetahuan  |");
            System.out.println("| 6. Purchasable       |");
            System.out.println("|______________________|");
            System.out.print("Silahkan Pilih Genre Buku (1/2/3/4/5/6/):");
            int genreBuku = input.nextInt();
            switch (genreBuku){
                case 1:
                    perpustakaan[jumlahBuku][6] = novel;
                    break;
                case 2:
                    perpustakaan[jumlahBuku][6] = komik;
                    break;
                case 3:
                    perpustakaan[jumlahBuku][6] = cerpen;
                    break;
                case 4:
                    perpustakaan[jumlahBuku][6] = sejarah;
                    break;
                case 5:
                    perpustakaan[jumlahBuku][6] = ilmuPengetahuan;
                    break;
                case 6:
                    perpustakaan[jumlahBuku][6] = purchasable;
                    System.out.print("Masukkan Harga Buku:");
                    input.nextLine();
                    perpustakaan[jumlahBuku][7] = input.next();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    return;
            }
            bukuTersedia[jumlahBuku] = true;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan!");
            System.out.println("Apakah anda ingin menambah data lagi (y/n) ?");
            input.nextLine();
            String pilih = input.nextLine();

            if(pilih.equalsIgnoreCase("y")) {
            }else if(pilih.equalsIgnoreCase("n")) {
                System.out.println("Buku berhasil ditambahkan!");
                System.out.println("\n ______________________________________");
                System.out.println("|                                      |");
                System.out.println("|  Tekan ENTER untuk kembali           |");
                System.out.println("|______________________________________|");
                input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu 
                break;
	        }else {
            	System.out.println("Proses invalid");
                break;
            }
        }if(jumlahBuku == maxBuku){
            System.out.println("Maaf, perpustakaan penuh. Tidak dapat menambahkan buku baru.");
        }
    }
        // fungsi dari tampilkan daftar buku yang baru ditambahkan bagian parents 
        public static void tampilkanDaftarBuku() {
            System.out.printf("| No. | %-20s | %-20s | %-10s | %-13s | %-15s | %-15s | %-14s | %-10s |%n", "Judul", "Penulis", "Penerbit", "Tahun Terbit", "ISBN", "Jml Halaman", "Genre", "Harga");
            System.out.println("|-----|----------------------|----------------------|------------|---------------|-----------------|-----------------|----------------|");
        for (int i = 0; i < maxBuku; i++) {
            if (perpustakaan[i][0] != null && perpustakaan[i][7] != null) {
                System.out.printf("| %3d | %-20s | %-20s | %-10s | %-13s | %-15s | %-15s | %-14s | %-10s |%n", i + 1, perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], perpustakaan[i][6], perpustakaan[i][7]);

            }else if (perpustakaan[i][0] != null && !perpustakaan[i][0].isEmpty()) {
                System.out.printf("| %3d | %-20s | %-20s | %-10s | %-13s | %-15s | %-15s | %-14s |%n", i + 1, perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], perpustakaan[i][6]);
            }
        }
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali           |");
        System.out.println("|______________________________________|");
        input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu admin
    }
    static void Riwayat(){
        System.out.println("Menu riwayat");
        System.out.println("____________________________________");
        System.out.println("|           Fitur Riwayat          |");
        System.out.println("|==================================|");
        System.out.println("| Perpustakaan Pangeran Diponegoro |");
        System.out.println("|                                  |");
        System.out.println("| 1. Riwayat Penambahan Buku       |");
        System.out.println("| 2. Riwayat Peminjaman Buku       |");
        System.out.println("| 3. Riwayat Pengembalian Buku     |");
        System.out.println("| 4. Riwayat Pembelian Buku        |");
        System.out.println("| 5. Kembali ke Menu Utama         |");
        System.out.println("|__________________________________|");
        System.out.print("Pilih Menu (1/2/3/4/5/6): ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                RiwayatTambah();
                break;
            case 2:
                RiwayatPeminjaman();
                break;
            case 3:
                RiwayatPengembalian();
                break;
            case 4:
                RiwayatPembelian();
                break;
            case 5:
                menuAdmin();
                break;
        
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }

    static void Pembelian() {

        System.out.println("______________________________");
        System.out.println("|==============================|");
        System.out.println("|       Daftar Pembelian       |");
        System.out.println("|------------------------------|");
        System.out.println("|Sistem Perpustakaan Diponegoro|");
        System.out.println("|                              |");
        System.out.println("|______________________________|");
        for (int i = 0; i < maxBuku; i++) {
            if (perpustakaan[i][6] == purchasable) {
                {
                    System.out.println("Judul: " + perpustakaan[i][0]);
                    System.out.println("Harga: " + perpustakaan[i][7]);
                    System.out.println();
                }



                System.out.println("Masukkan Buku Yang Ingin Dibeli");
                String isTersedia = input.nextLine();
            
            if (isTersedia.equalsIgnoreCase(perpustakaan[i][0])) {
                System.out.println("                              ");
                System.out.println("Buku ini tersedia");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                String isBeli = input.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");
                    input.nextLine();
                    menuAdmin();
                }
            }
            }
        }
        
    }
    static void RiwayatTambah(){
        System.out.println("      Riwayat Penambahan Buku       ");
        System.out.println("|==================================|");
        System.out.println("| Perpustakaan Pangeran Diponegoro |");
        for (int i = 0; i < maxBuku; i++) {
            if (perpustakaan[i][0] != null && perpustakaan[i][7] != null) {
                System.out.println("Buku ke-" + (i + 1));
                System.out.println("Judul: " + perpustakaan[i][0]);
                System.out.println("Penulis: " + perpustakaan[i][1]);
                System.out.println("Penerbit: " + perpustakaan[i][2]);
                System.out.println("Tahun Terbit: " + perpustakaan[i][3]);
                System.out.println("ISBN: " + perpustakaan[i][4]);
                System.out.println("Jumlah Halaman: " + perpustakaan[i][5]);
                System.out.println("Genre Buku: " + perpustakaan[i][6]);
                System.out.println("Harga Buku: " + perpustakaan[i][7]);
                System.out.println("------------------------------");

            }else if (perpustakaan[i][0] != null && !perpustakaan[i][0].isEmpty()) {
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
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali           |");
        System.out.println("|______________________________________|");
        input.nextLine();
        input.nextLine();
        Riwayat();
    }
    static void RiwayatPeminjaman(){
        System.out.println("\n______________________________");
        System.out.println("______________________________");
        System.out.println("      Riwayat Peminjaman      ");
        System.out.println("------------------------------");
        System.out.println("      Sistem Perpustakaan     ");
        System.out.println("      Pangeran Diponegoro     ");
        System.out.println("______________________________");

        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.println("|   Nama Peminjam   |     Judul Buku      |       Penulis         |       Tanggal Peminjaman       |   ISBN   |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------|");

        for (int i = 0; i < jumlahRiwayat; i++) {
            System.out.printf("|    %-15s|   %-18s|   %-20s|  %-22s  |   %-7s|\n",
                    riwayatPeminjaman[i][0], riwayatPeminjaman[i][1], riwayatPeminjaman[i][2],
                    riwayatPeminjaman[i][3], riwayatPeminjaman[i][4]);
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu admin
        input.nextLine();
        menuAdmin();

    }
    static void RiwayatPengembalian(){
        System.out.println("\n______________________________");
        System.out.println("______________________________");
        System.out.println("      Riwayat Peminjaman      ");
        System.out.println("------------------------------");
        System.out.println("      Sistem Perpustakaan     ");
        System.out.println("      Pangeran Diponegoro     ");
        System.out.println("______________________________");

        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.println("|   Nama Peminjam   |     Judul Buku      |       Penulis         |       Tanggal Peminjaman       |   ISBN   |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------|");

        for (int i = 0; i < jumlahRiwayatPengembalian; i++) {
            System.out.printf("|    %-15s|   %-18s|   %-20s|  %-22s  |   %-7s|\n",
                    riwayatPengembalian[i][0], riwayatPengembalian[i][1], riwayatPengembalian[i][2],
                    riwayatPengembalian[i][3], riwayatPengembalian[i][4]);
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu admin
        input.nextLine();
        menuAdmin();
    }
    static void RiwayatPembelian(){
        
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
                CariBukuUser();
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

        System.out.print("\nMasukkan Kategori Buku (1/2/3/4/5/6): ");
        int kategori = input.nextInt();
        if(kategori > 6 || kategori == 0){
            System.out.println("Kategori Tidak Tersedia");
        }else if(kategori > 0 && kategori < 7){
            if(jumlahBuku > 0){
                System.out.printf("\n| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |%n", "Judul", "Penulis", "Penerbit", "Tahun Terbit", "ISBN", "Jml Halaman", "Status");
                System.out.println("|---------------------------|----------------------|-----------------|---------------|-----------------|-----------------|-------------------|");
                for ( int i = 0; i <= jumlahBuku; i++) { 
                    switch (kategori){
                        case 1:
                        if(perpustakaan[i][6] == novel){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;
                        
                        case 2:
                        if(perpustakaan[i][6] == komik){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;
                        
                        case 3:
                        if(perpustakaan[i][6] == cerpen){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;

                        case 4:
                        if(perpustakaan[i][6] == sejarah){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        } 
                        break;

                        case 5:
                        if(perpustakaan[i][6] == ilmuPengetahuan){          // Cara agar buku yang ditambahkan sesuai dengan kategori yang diinginkan atribut ke 6 adalah genre / kategori buku
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        }
                        break;
                        case 6:
                        if (perpustakaan[i][6] == purchasable) {
                            System.out.printf("| %-25s | %-20s | %-15s | %-13s | %-15s | %-15s | %-17s |", perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2], perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5], (bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia"));
                            System.out.println();
                        
                        }
                        break;
                        default:
                        System.out.println("Belum Ada Buku Yang Ditambahkan");
                    }
                }
            }else if(jumlahBuku == 0){
                System.out.println("\n================================="); // jika belum ada buku yang ditambahkan akan menampilkan ini
                System.out.println(" Belum ada buku yang ditambahkan ");
                System.out.println("=================================");
            }
        }
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu admin
        input.nextLine();
        menuUser();
    }
    static void CariBukuUser() {
        System.out.println("\n______________________________");
        System.out.println("______________________________");
        System.out.println("        Selamat  Datang       ");
        System.out.println("        di Pencarian Buku    ");
        System.out.println("------------------------------");
        System.out.println("      Sistem Perpustakaan     ");
        System.out.println("      Pangeran Diponegoro     ");
        System.out.println("______________________________");
    
        input.nextLine(); // Membersihkan buffer
        System.out.print("\nMasukkan informasi buku yang ingin dicari: ");
        String keyword = input.nextLine().toLowerCase();
    
        boolean ditemukan = false;
    
        System.out.printf("\n|  %-17s | %-17s | %-15s | %-15s | %-15s | %-15s | %-18s |%n", "Judul", "Penulis", "Penerbit", "Tahun Terbit", "ISBN", "Jml Halaman", "Status");
        System.out.println("|--------------------|-------------------|-----------------|-----------------|-----------------|-----------------|--------------------|");
    
        for (int i = 0; i < jumlahBuku; i++) {
            if (perpustakaan[i][0].toLowerCase().contains(keyword) ||
                perpustakaan[i][1].toLowerCase().contains(keyword) ||
                perpustakaan[i][2].toLowerCase().contains(keyword) ||
                perpustakaan[i][3].toLowerCase().contains(keyword) ||
                perpustakaan[i][4].toLowerCase().contains(keyword) ||
                perpustakaan[i][5].toLowerCase().contains(keyword)) {
                System.out.printf("|   %-17s|  %-17s|  %-15s|  %-15s|  %-15s|  %-15s|  %-18s|\n",
                        perpustakaan[i][0], perpustakaan[i][1], perpustakaan[i][2],
                        perpustakaan[i][3], perpustakaan[i][4], perpustakaan[i][5],
                        bukuTersedia[i] ? "Tersedia" : "Tidak Tersedia");
                ditemukan = true;
            }
        }
    
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------|");
    
        if (!ditemukan) {
            System.out.println("Buku dengan informasi tersebut tidak ditemukan.");
            menuUser();
        }
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine(); // mengosongkan input agar dapat menjalankan fungsi menu admin
        menuUser();
    }
    static void aturanPeminjamanUser(){
        String rule1 = "1. Apabila ingin meminjam buku, harap konfirmasi kepada petugas perpustakaan.             ";
        String rule2 = "2. Maksimal lama peminjaman buku adalah 7 hari.                                               ";
        String rule3 = "4. Keterlambatan pengembalian buku akan dikenakan denda dengan nominals sebesar Rp,-5000 :";
        String rule4 ="5. Pembayaran denda keterlambatan dapat dibayarkan kepada petugas perpustakaan secara tunai maupun non tunai.";

        System.out.println("Aturan Peminjaman Buku:");
        System.out.println(rule1);
        System.out.println(rule2);
        System.out.println(rule3);
        System.out.println(rule4);
        System.out.println("\n ______________________________________");
        System.out.println("|                                      |");
        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
        System.out.println("|______________________________________|");
        input.nextLine();
        input.nextLine();
        menuUser();
    }
}