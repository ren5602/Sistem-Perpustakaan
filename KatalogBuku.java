import java.util.Scanner;
public class KatalogBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBuku;
        System.out.println("Katalog Buku");
        System.out.println("_____________________________________________");
        System.out.println("1. Buku A");
        System.out.println("2. Buku B");
        System.out.println("3. Buku C");
        System.out.println("4. Buku D");
        System.out.println("5. Buku F");
        System.out.println("_____________________________________________");
        System.out.println();

        System.out.println("Masukkan Nama Buku dan Pastikan Nama Sesuai: ");
        namaBuku = input.nextLine();
        switch (namaBuku){
        case "Buku A":
        System.out.println("Buku A");
        System.out.println("Penulis: Si A");
        System.out.println("Tersedia");
            break;
        case "Buku B":
        System.out.println("Buku B Tersedia");
        System.out.println("Penulis: Si B");
        System.out.println("Tersedia");
            break;
        case "Buku C":
        System.out.println("Buku C Tersedia");
        System.out.println("Penulis: Si C");
        System.out.println("Tersedia");
            break;
        case "Buku D":
        System.out.println("Buku D Tersedia");
        System.out.println("Penulis: Si D");
        System.out.println("Tersedia");
            break;
        case "Buku E":
        System.out.println("Buku E Tersedia");
        System.out.println("Penulis: Si E");
        System.out.println("Tersedia");
            break;
        case "Buku F":
        System.out.println("Buku F Tersedia");
        System.out.println("Penulis: Si F");
        System.out.println("Tersedia");
            break;
        default: 
        System.out.println("buku tidak tersedia");
        }
    }
}