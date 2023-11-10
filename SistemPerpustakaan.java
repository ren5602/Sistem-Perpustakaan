import java.util.Scanner;
public class SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean meminjam=false, valid=false;
        String login, username, password;
        System.out.println(" __________________________________");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("|          Selamat Datang          |");  
        System.out.println("|      Di Sistem Perpustakaan      |");     
        System.out.println("|        Pangeran Diponegoro       |");
        System.out.println("|__________________________________|");
        System.out.println("|__________________________________|");

        int i = 0;
        while(i < 3){
        System.out.print("\nSilahkan Masukkan Username Terlebih dauhulu : ");
        username = input.nextLine();
        System.out.print("Silahkan Masukkan Password                  : ");
        password = input.nextLine();
        if(username.equals("admin") && password.equals("1234")){
        System.out.println("\n _______________________________________________");
        System.out.println("|                 Login Berhasil!               |");
        System.out.println("|Silahkan tekan ENTER untuk melanjutkan ke Menu |");
        System.out.println("|_______________________________________________|");
            break;
        }
        System.out.println("Login Gagal, silahkan coba lagi");
        i++;
        if (i == 3) {
            System.exit(0);
            
        }

        }

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

        switch (pilihan){
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
                kategori= input.nextInt();
                
                switch (kategori){
                case 1:
                System.out.println("\n ______________ ");
                System.out.println("|    Novel     |");
                System.out.println("|______________|");
                System.out.println("|  1. Buku A   |");
                System.out.println("|  2. Buku B   |");
                System.out.println("|  3. Buku C   |");
                System.out.println("|  4. Buku D   |");
                System.out.println("|  5. Buku E   |");
                System.out.println("|______________|");
                break;

                case 2:
                System.out.println("\n ______________ ");
                System.out.println("|    Komik     |");
                System.out.println("|______________|");
                System.out.println("|  1. Buku F   |");
                System.out.println("|  2. Buku G   |");
                System.out.println("|  3. Buku H   |");
                System.out.println("|  4. Buku I   |");
                System.out.println("|  5. Buku J   |");
                System.out.println("|______________|");
                break;

                case 3:
                System.out.println("\n ______________ ");
                System.out.println("|    Cerpen    |");
                System.out.println("|______________|");
                System.out.println("|  1. Buku K   |");
                System.out.println("|  2. Buku L   |");
                System.out.println("|  3. Buku M   |");
                System.out.println("|  4. Buku N   |");
                System.out.println("|  5. Buku O   |");
                System.out.println("|______________|");
                break;

                case 4:
                System.out.println("\n ______________");
                System.out.println("|    Sejarah   |");
                System.out.println("|______________|");
                System.out.println("|  1. Buku P   |");
                System.out.println("|  2. Buku Q   |");
                System.out.println("|  3. Buku R   |");
                System.out.println("|  4. Buku S   |");
                System.out.println("|  5. Buku T   |");
                System.out.println("|______________|");
                break;

                case 5:
                System.out.println("\n ____________________");
                System.out.println("|  Ilmu Pengetahuan  |");
                System.out.println("|____________________|");
                System.out.println("|     1. Buku U      |");
                System.out.println("|     2. Buku V      |");
                System.out.println("|     3. Buku W      |");
                System.out.println("|     4. Buku X      |");
                System.out.println("|     5. Buku Y      |");
                System.out.println("|     6. Buku Z      |");
                System.out.println("|____________________|");
                break;
              
                default: 
                System.out.println("kategori tidak tersedia");
                break;
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
                String namaBuku= input.nextLine();
                switch (namaBuku){
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
                int banyakBuku;

                System.out.println("\n______________________________");
                System.out.println("______________________________");
                System.out.println("        Selamat Datang        ");
                System.out.println("      di Peminjaman Buku      ");
                System.out.println("------------------------------");
                System.out.println("      Sistem Perpustakaan     ");
                System.out.println("      Pangeran Diponegoro     ");
                System.out.println("______________________________");
                System.out.print("\nBerapa banyak buku yang akan Anda pinjam? ");
                banyakBuku = input.nextInt();
                System.out.print("\nMasukkan Nama Anda            : ");
                nama = input.nextLine();
                input.nextLine();

                for (i = 0; i < banyakBuku; i++){
                System.out.print("\nMasukkan Nama Buku            : ");
                namaBuku = input.nextLine();
                System.out.print("Masukkan Nama Penulis         : ");
                namaPenulis = input.nextLine();
                if(namaBuku.equalsIgnoreCase("Buku A") && namaPenulis.equalsIgnoreCase("Penulis A")){
                    meminjam=true;
                    valid=true;
                } else if(namaBuku.equalsIgnoreCase("Buku B") && namaPenulis.equalsIgnoreCase("Penulis B")){
                    meminjam=true;
                    valid=true;
                } else if(namaBuku.equalsIgnoreCase("Buku C") && namaPenulis.equalsIgnoreCase("Penulis C")){
                    meminjam=true;
                    valid=true;
                } else if(namaBuku.equalsIgnoreCase("Buku D") && namaPenulis.equalsIgnoreCase("Penulis D")){
                    meminjam=true;
                    valid=true;
                } else if(namaBuku.equalsIgnoreCase("Buku E") && namaPenulis.equalsIgnoreCase("Penulis E")){
                    meminjam=true;
                    valid=true;
                } else if(namaBuku.equalsIgnoreCase("Buku F") && namaPenulis.equalsIgnoreCase("Penulis F")){
                    meminjam=true;
                    valid=true;
                } else if(namaBuku.equalsIgnoreCase("Buku G") && namaPenulis.equalsIgnoreCase("Penulis G")){
                    meminjam=true;
                    valid=true;
                } else if(namaBuku.equalsIgnoreCase("Buku H") && namaPenulis.equalsIgnoreCase("Penulis H")){
                    meminjam=true;
                    valid=true;
                } else{
                    System.out.println("Buku tidak tersedia");
                    meminjam=false;
                    valid=false;

                i++;
                }
                if(meminjam){
                    meminjam=true;
                    valid=true;
                    System.out.print("masukkan tanggal peminjaman   : ");
                    tanggalPeminjaman = input.nextLine();
                    System.out.print("masukkan tanggal pengembalian : ");
                    tanggalPengembalian = input.nextLine();

                    System.out.println("\n______________________________________________");
                    System.out.println("\n           Buku pinjaman ke-" + (i + 1)          );
                    System.out.println(" Nama Peminjam              : " + nama);
                    System.out.println(" Nama Buku                  : " + namaBuku);
                    System.out.println(" Nama Penulis               : " + namaPenulis);
                    System.out.println(" Tanggal Peminjaman         : " + tanggalPeminjaman);
                    System.out.println(" Tenggat Pengembalian Buku  : " + tanggalPengembalian);
                    System.out.println("______________________________________________");
                
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
                    System.out.println(" Nama Peminjam                      : " + nama );
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


                int denda=0, jmlhKeterlambatan, totalDenda;
                System.out.print("\nMasukkan Lama Keterlambatan: ");
                jmlhKeterlambatan = input.nextInt();
                  totalDenda = denda * jmlhKeterlambatan;
                if (jmlhKeterlambatan > 7) {
                    denda +=10000;
            
                } else if (jmlhKeterlambatan > 4) {
                    denda +=7000; 

                } else {
                    denda +=5000;
            
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
                int hargaBuku=0, potHarga, hargaBayar ;
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
                    if(namaBuku.equalsIgnoreCase("Buku A") && namaPenulis.equalsIgnoreCase("Penulis A")){
                        hargaBuku += 50000;

                    } else if(namaBuku.equalsIgnoreCase("Buku B") && namaPenulis.equalsIgnoreCase("Penulis B")){
                        hargaBuku += 70000;

                    } else if(namaBuku.equalsIgnoreCase("Buku C") && namaPenulis.equalsIgnoreCase("Penulis C")){
                        hargaBuku += 85000;

                    } else if(namaBuku.equalsIgnoreCase("Buku D") && namaPenulis.equalsIgnoreCase("Penulis D")){
                        hargaBuku += 62000;

                    } else if(namaBuku.equalsIgnoreCase("Buku E") && namaPenulis.equalsIgnoreCase("Penulis E")){
                        hargaBuku += 380000;

                    } else if(namaBuku.equalsIgnoreCase("Buku F") && namaPenulis.equalsIgnoreCase("Penulis F")){
                        hargaBuku += 55000;

                    } else if(namaBuku.equalsIgnoreCase("Buku G") && namaPenulis.equalsIgnoreCase("Penulis G")){
                        hargaBuku += 45000;

                    } else if(namaBuku.equalsIgnoreCase("Buku H") && namaPenulis.equalsIgnoreCase("Penulis H")){
                        hargaBuku += 40000;

                    } else{
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
                                potHarga = (int) (hargaBuku * disc );
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
                System.out.println("Penambahan Buku");
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