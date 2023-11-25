import java.util.Scanner;
public class DaftarMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int hargaBuku, potHarga, hargaBayar ;
        double disc;
        String namaBuku, beli, berlangganan;

        System.out.println(" __________________________________  ");
        System.out.println("|__________________________________|");
        System.out.println("|            DAFTAR MENU           |");  
        System.out.println("|        Sistem Perpustakaan       |");     
        System.out.println("|        Pangeran Diponegoro       |");
        System.out.println("|__________________________________|");
        System.out.println("|1. Katalog Buku                   |");
        System.out.println("|__________________________________|");
        System.out.println("|2. Cari Buku                      |");
        System.out.println("|__________________________________|");
        System.out.println("|3. Form Peminjaman                |");
        System.out.println("|__________________________________|");
        System.out.println("|4. Pengembalian Buku              |");
        System.out.println("|__________________________________|");
        System.out.println("|5. Form Keterlambatan             |");
        System.out.println("|__________________________________|");
        System.out.println("|6. Form Pembelian Buku            |");
        System.out.println("|__________________________________|");
        System.out.println("|7. Update Buku                    |");
        System.out.println("|__________________________________|");
        System.out.println("|8. Log Out                        |");
        System.out.println("|__________________________________|");

        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
    
        switch (pilihan){
            case 1:
                System.out.println("Katalog Buku");
                break;
            case 2:
                System.out.println("Cari Buku");
                break;
            case 3:
                System.out.println("Form Peminjaman");
                break;
            case 4:
                System.out.println("Pengembalian Buku");
                break;
            case 5:
                System.out.println("Form Keterlambatan");
                break;
            case 6:
                System.out.println("Form Pembelian Buku");
                System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("        Fitur Beli Buku       ");
        System.out.println("------------------------------");
        System.out.println("Sistem Perpustakaan Diponegoro");
        System.out.println("                              ");
        System.out.println("______________________________");
        System.out.println("Masukkan Nama Buku yang ingin dibeli : ");
        namaBuku = input.nextLine();
        
        System.out.println("Apakah Anda ingin membeli buku ini (ya/tidak) ? ");
        beli = input.nextLine();
        hargaBuku = 50000 ;
        if (beli.equals("ya")) {
            System.out.println("Apakah Anda berlangganan (ya/tidak) ? ");
            berlangganan = input.nextLine();
            if (berlangganan.equals("ya")) {
                disc = 0.2;
                potHarga = (int) (hargaBuku * disc );
                hargaBayar = (int) (hargaBuku - potHarga);
                

                System.out.println("Selamat Anda Mendapatkan Potongan Harga sebesar = " + potHarga);
                System.out.println("Harga Buku yang harus Anda bayarkan sebesar = " + hargaBayar);
            } else if (berlangganan.equals("tidak"))
                
                System.out.println("Harga Buku yang Harus Anda Bayarkan : " + hargaBuku);

            
        } else if (beli.equals("tidak")) {
            System.out.println("_________________________________________");
            System.out.println("Selamat Datang di Menu Utama Perpustakaan");
            System.out.println("_________________________________________");
        } else 
            System.out.println(" Mohon Ketikkan 'ya' atau 'tidak' !!!");
                break;
            case 7:
                //System.out.println("Update Buku");
        String namaBuku1 = "Buku A", namaPenulis = "Penulis A", ketersediaan = "tersedia";
        System.out.println("Daftar Buku");
        System.out.print("Nama Buku: "+ namaBuku1 + "\n" + "Nama Penulis: " + namaPenulis +"\n" + "Informasi Tersedia: "+ ketersediaan);
        System.out.println();
        System.out.println("Silahkan ubah nama buku dan penulis " +"\n"+ "serta informasi ketersediaan buku ");

        System.out.print( "Masukkan nama Buku: ");
        namaBuku1 = input.next();
        System.out.print( "Masukkan nama penulis: ");
        namaPenulis = input.next();
        System.out.print( "Masukkan ketersediaan: ");
        ketersediaan = input.next();

        System.out.println();

        System.out.println("Buku telah dirubah menjadi: " + namaBuku1);
        System.out.println("Nama Penulis telah dirubah menjadi: " +namaPenulis);
        System.out.println("Ketersediaan buku dirubah menjadi: " +ketersediaan);
                break;
            case 8:
                System.out.println("Log Out");
        }
    }
}
