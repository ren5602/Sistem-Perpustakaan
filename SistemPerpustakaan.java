import java.util.Scanner;
import java.util.Date;

public class SistemPerpustakaan {
    // Batas Maksimal Percobaan
    public static int maxPercobaan=0;
    public static void SelectAdmin(){
        Scanner input = new Scanner(System.in);
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
        Scanner input = new Scanner(System.in);
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
            // masukkan konten untuk mengakses fungsi admin
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
        Scanner input = new Scanner(System.in);
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
        Scanner input = new Scanner(System.in);

        boolean meminjam = false, valid = false;
        int maxBuku = 100, maxAtributBuku = 7, jumlahBuku = 0;
        String[][] perpustakaan = new String[maxBuku][maxAtributBuku];
        String[][] dataBuku = {{"Harry Poter","J.K Rowling", "gramedia", "2015", "2312421", "223", "1000","novel"}};
        for(int j = 0; j < dataBuku.length; j++){
            perpustakaan[j][0] = dataBuku[j][0];
            perpustakaan[j][1] = dataBuku[j][1];
            perpustakaan[j][2] = dataBuku[j][2];
            perpustakaan[j][3] = dataBuku[j][3];
            perpustakaan[j][4] = dataBuku[j][4];
            perpustakaan[j][5] = dataBuku[j][5];
            perpustakaan[j][6] = dataBuku[j][6];

        }
        jumlahBuku = dataBuku.length;
        int i = 0;
        boolean exitProgram = false;
        int pilihan, kategori;
        while (!exitProgram) {
            input.nextLine();
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
            System.out.println("| 3. Form Peminjaman               |");
            System.out.println("|__________________________________|");
            System.out.println("|                                  |");
            System.out.println("| 4. Pengembalian Buku             |");
            System.out.println("|__________________________________|");
            System.out.println("|                                  |");
            System.out.println("| 5. Form Keterlambatan            |");
            System.out.println("|__________________________________|");
            System.out.println("|                                  |");
            System.out.println("| 6. Form Pembelian Buku           |");
            System.out.println("|__________________________________|");
            System.out.println("|                                  |");
            System.out.println("| 7. Penambahan Buku               |");
            System.out.println("|__________________________________|");
            System.out.println("|                                  |");
            System.out.println("| 8. Log Out                       |");
            System.out.println("|__________________________________|");

            System.out.print("\nPilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
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
                    System.out.print("\nMasukkan Kategori Buku: ");
                    kategori = input.nextInt();

                    if (jumlahBuku > 0) {

                        for ( i = 0; i < jumlahBuku; i++) {
                            switch (kategori) {
                                case 1:
                                if (perpustakaan[i][6].equalsIgnoreCase("novel")) {
                                    System.out.println(i+1 + ". " + perpustakaan[i][0]);
                                
                                
                                } 
                                break;
                                
                            
                                case 2:
                                if (perpustakaan[i][6].equalsIgnoreCase("komik")) {
                                System.out.println(i+1 + ". " + perpustakaan[i][0]);
                                input.nextLine();
                                }
                        
                                break;

                                case 3:
                                if (perpustakaan[i][6].equalsIgnoreCase("cerpen")) {
                                System.out.println(i+1 + ". " + perpustakaan[i][0]);
                                input.nextLine();
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
                    String namaPeminjam = input.nextLine();

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
                    System.out.println("\n====================================");
                    System.out.println("         Terimakasih telah          ");
                    System.out.println("   menggunakan Form Peminjamanan    ");
                    System.out.println("------------------------------------");
                    System.out.println("        Sistem Perpustakaan         ");
                    System.out.println("        Pangeran Diponegoro         ");
                    System.out.println("====================================");

                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");
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

                case 5:
                    System.out.println("\n______________________________");
                    System.out.println("______________________________");
                    System.out.println("        Selamat Datang        ");
                    System.out.println("     di Form Keterlambatan    ");
                    System.out.println("------------------------------");
                    System.out.println("     Sistem Perpustakaan      ");
                    System.out.println("     Pangeran Diponegoro      ");
                    System.out.println("______________________________");

                    int denda = 0, jmlhKeterlambatan, totalDenda;
                    System.out.print("\nMasukkan Lama Keterlambatan: ");
                    jmlhKeterlambatan = input.nextInt();
                    totalDenda = denda * jmlhKeterlambatan;
                    if (jmlhKeterlambatan > 7) {
                        denda += 10000;

                    } else if (jmlhKeterlambatan > 4) {
                        denda += 7000;

                    } else {
                        denda += 5000;

                    }
                    totalDenda = denda * jmlhKeterlambatan;
                    System.out.println("\n _______________________________________________");
                    System.out.println("\n    Karena Anda terlambat mengembalikan buku    ");
                    System.out.println("                 selama " + jmlhKeterlambatan + " hari");
                    System.out.println("     Anda harus membayar denda sebesar " + totalDenda);
                    System.out.println(" _______________________________________________");
                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");

                    input.nextLine();
                    break;

                case 6:
                    int hargaBuku = 0, potHarga, hargaBayar;
                    double disc;
                    String beli, berlangganan;
                    System.out.println("\n______________________________");
                    System.out.println("______________________________");
                    System.out.println("        Selamat Datang        ");
                    System.out.println("         di Beli Buku         ");
                    System.out.println("------------------------------");
                    System.out.println("     Sistem Perpustakaan      ");
                    System.out.println("     Pangeran Diponegoro      ");
                    System.out.println("______________________________");

                    System.out.print("\nMasukkan Nama Buku    : ");
                    namaBuku = input.nextLine();
                    System.out.print("Masukkan Nama Penulis : ");
                    namaPenulis = input.nextLine();
                    if (namaBuku.equalsIgnoreCase("Buku A") && namaPenulis.equalsIgnoreCase("Penulis A")) {
                        hargaBuku += 50000;

                    } else if (namaBuku.equalsIgnoreCase("Buku B") && namaPenulis.equalsIgnoreCase("Penulis B")) {
                        hargaBuku += 70000;

                    } else if (namaBuku.equalsIgnoreCase("Buku C") && namaPenulis.equalsIgnoreCase("Penulis C")) {
                        hargaBuku += 85000;

                    } else if (namaBuku.equalsIgnoreCase("Buku D") && namaPenulis.equalsIgnoreCase("Penulis D")) {
                        hargaBuku += 62000;

                    } else if (namaBuku.equalsIgnoreCase("Buku E") && namaPenulis.equalsIgnoreCase("Penulis E")) {
                        hargaBuku += 380000;

                    } else if (namaBuku.equalsIgnoreCase("Buku F") && namaPenulis.equalsIgnoreCase("Penulis F")) {
                        hargaBuku += 55000;

                    } else if (namaBuku.equalsIgnoreCase("Buku G") && namaPenulis.equalsIgnoreCase("Penulis G")) {
                        hargaBuku += 45000;

                    } else if (namaBuku.equalsIgnoreCase("Buku H") && namaPenulis.equalsIgnoreCase("Penulis H")) {
                        hargaBuku += 40000;

                    } else {
                        System.out.println("\n _____________________");
                        System.out.println("|                     |");
                        System.out.println("| Buku tidak tersedia |");
                        System.out.println("|_____________________|");
                        System.out.println("\n ______________________________________");
                        System.out.println("|                                      |");
                        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                        System.out.println("|______________________________________|");
                        break;
                    }

                    System.out.print("\nApakah Anda ingin membeli buku ini (ya/tidak) ? ");
                    beli = input.nextLine();

                    if (beli.equals("ya")) {
                        System.out.print("\nApakah Anda berlangganan (ya/tidak) ? ");
                        berlangganan = input.nextLine();
                        if (berlangganan.equals("ya")) {
                            disc = 0.2;
                            potHarga = (int) (hargaBuku * disc);
                            hargaBayar = (int) (hargaBuku - potHarga);

                            System.out.println("\n_________________________________________________________________");
                            System.out.println("                         Terimakasih Telah                       ");
                            System.out.println("                    Melakukan Pembelian Buku                  ");
                            System.out.println("=================================================================");
                            System.out.println(" Selamat Anda Mendapatkan Potongan Harga sebesar     = " + potHarga);
                            System.out.println(" Harga Buku yang harus Anda bayarkan sebesar         = " + hargaBayar);
                            System.out.println("=================================================================");
                            System.out.println("\n ______________________________________");
                            System.out.println("|                                      |");
                            System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                            System.out.println("|______________________________________|");
                            break;

                        } else if (berlangganan.equals("tidak"))
                            System.out.println("\n_________________________________________________");
                        System.out.println("                Terimakasih Telah                ");
                        System.out.println("           Melakukan Pengembalian Buku           ");
                        System.out.println("=================================================");
                        System.out.println(" Harga Buku yang Harus Anda Bayarkan : " + hargaBuku);
                        System.out.println("=================================================");
                        System.out.println("\n ______________________________________");
                        System.out.println("|                                      |");
                        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                        System.out.println("|______________________________________|");
                        break;

                    } else if (beli.equals("tidak")) {
                        System.out.println("\n ______________________________________");
                        System.out.println("|                                      |");
                        System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                        System.out.println("|______________________________________|");
                        break;

                    } else {
                        System.out.println(" Mohon Ketikkan 'ya' atau 'tidak' !!!");
                        break;
                    }

                case 7:
                    System.out.println("\n______________________________");
                    System.out.println("______________________________");
                    System.out.println("        Selamat Datang        ");
                    System.out.println("        di Tambah Buku        ");
                    System.out.println("------------------------------");
                    System.out.println("     Sistem Perpustakaan      ");
                    System.out.println("     Pangeran Diponegoro      ");
                    System.out.println("______________________________");
                    String tambahLagi;
                    while (true) {
                        if (jumlahBuku < maxBuku) {

                            System.out.print("Judul          : ");
                            perpustakaan[jumlahBuku][0] = input.nextLine();
                            System.out.print("Penulis        : ");
                            perpustakaan[jumlahBuku][1] = input.nextLine();
                            System.out.print("Penerbit       : ");
                            perpustakaan[jumlahBuku][2] = input.nextLine();
                            System.out.print("Tahun Terbit   : ");
                            perpustakaan[jumlahBuku][3] = input.nextLine();
                            System.out.print("ISBN           : ");
                            perpustakaan[jumlahBuku][4] = input.nextLine();
                            System.out.print("Jumlah Halaman : ");
                            perpustakaan[jumlahBuku][5] = input.nextLine();
                            System.out.print("Genre Buku     : ");
                            perpustakaan[jumlahBuku][6] = input.nextLine();

                            System.out.println("\n============================");
                            System.out.println(" Buku berhasil ditambahkan!");
                            System.out.println("============================");
                            jumlahBuku++;

                            System.out.print("\nApakah Anda ingin menambahkan buku lagi (y/n)? ");
                            tambahLagi = input.nextLine();
                            if (tambahLagi.equalsIgnoreCase("n")) {
                                break;

                            }
                        } else {
                            System.out.println("\n==================================================");
                            System.out.println(" Perpustakaan penuh. Tidak dapat menambahkan buku.");
                            System.out.println("==================================================");
                        }
                    }
                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");

                    break;

                case 8:
                    System.out.println("\n_______________________________");
                    System.out.println("_______________________________");
                    System.out.println("       Log Out Berhasil !      ");
                    System.out.println(" Terimakasih Telah Menggunakan ");
                    System.out.println("-------------------------------");
                    System.out.println("      Sistem Perpustakaan      ");
                    System.out.println("      Pangeran Diponegoro      ");
                    System.out.println("_______________________________");
                    System.exit(0);
                    break;
                default:
                    System.out.println("==========================================");
                    System.out.println(" Menu tidak tersedia, Silahkan pilih lagi ");
                    System.out.println("==========================================");
                    input.nextLine();
                    break;
            }
        }
        input.close();
    }
}