import java.util.Scanner;

public class Peminjamanv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        String[][] peminjam = new String[4][2]; 
        for (int i = 0; i < peminjam.length; i++) {
            System.out.println("Masukkan informasi Peminjam Ke-" + (i + 1));
         
            for (int j = 0; j < peminjam[i].length; j++) {
                if (j == 0) {
                    System.out.print("Masukkan Nama Peminjam   : ");
                } else {
                    System.out.print("Nama Buku Yang Dipinjam : ");
                }
                peminjam[i][j] = scanner.nextLine();
            }
            System.out.print("Apakah Anda ingin melanjutkan memasukkan data? (ya/tidak): ");
            String lanjut = scanner.nextLine();
            
            if (!lanjut.equalsIgnoreCase("ya")) {
                System.out.println("Peminjaman Berhasil!");
                break;
            }
        }   
        scanner.close();
    }
}