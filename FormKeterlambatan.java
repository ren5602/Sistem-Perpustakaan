import java.util.Scanner;
public class FormKeterlambatan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int denda = 5000, jumlahKeterlambatan, totalDenda;
        System.out.print("Masukkan lama keterlambatan: ");
        jumlahKeterlambatan = input.nextInt();
        totalDenda = denda*jumlahKeterlambatan;
        System.out.println("Total Denda Yang Harus Dibayar: " + totalDenda);
    }
}
