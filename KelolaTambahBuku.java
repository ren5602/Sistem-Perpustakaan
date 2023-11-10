import java.util.Scanner;

public class KelolaTambahBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        String[][] daftarBuku = new String[3][2]; 
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println("Masukkan informasi buku ke-" + (i + 1));
         
            for (int j = 0; j < daftarBuku[i].length; j++) {
                if (j == 0) {
                    System.out.print("Judul buku   : ");
                } else {
                    System.out.print("Punulis Buku : ");
                }
                daftarBuku[i][j] = scanner.nextLine();
            }
            System.out.println("Buku berhasil ditambahkan!\n");
        }
        scanner.close();
    }
}