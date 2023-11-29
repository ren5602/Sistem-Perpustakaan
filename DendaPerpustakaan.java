import java.util.Scanner;

public class DendaPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah hari keterlambatan pengembalian buku: ");
        int hariKeterlambatan = scanner.nextInt();

        System.out.print("Masukkan genre buku (novel, komik, cerpen, sejarah, ilmu pengetahuan): ");
        String genreBuku = scanner.next().toLowerCase();

        int denda = hitungDenda(hariKeterlambatan, genreBuku);
        if (denda > 0) {
            System.out.println("Denda yang harus dibayar: " + denda + " rupiah");
        } else {
            System.out.println("Tidak ada denda. Pengembalian tepat waktu.");
        }

        scanner.close();
    }

    public static int hitungDenda(int hariKeterlambatan, String genreBuku) {
        int dendaPerHari = 0;

        switch (genreBuku) {
            case "novel":
                dendaPerHari = 5000;
                break;
            case "komik":
                dendaPerHari = 4000;
                break;
            case "cerpen":
                dendaPerHari = 3000;
                break;
            case "sejarah":
                dendaPerHari = 8000;
                break;
            case "ilmu pengetahuan":
                dendaPerHari = 10000;
                break;
            default:
                System.out.println("Genre buku tidak valid.");
                return 0;
        }

        int totalDenda = hariKeterlambatan * dendaPerHari;
        return totalDenda;
    }
}
