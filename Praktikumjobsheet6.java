import java.util.Scanner;
public class Praktikumjobsheet6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int hargaBuku, potHarga, hargaBayar ;
        double disc;
        String namaBuku, beli, berlangganan;
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
    }
}