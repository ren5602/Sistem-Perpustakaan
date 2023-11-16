import java.util.Scanner;
public class Peminjaman {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String namaBuku, tanggal, namaPenulis, next;
    boolean meminjam=false, valid=false;

            System.out.println(" __________________________________  ");
            System.out.println("|__________________________________|");
            System.out.println("|           Peminjamanan           |");     
            System.out.println("|        Sistem Perpustakaan       |");     
            System.out.println("|        Pangeran Diponegoro       |");
            System.out.println("|__________________________________|");
            System.out.println("|   Cara Meminjam Buku             |");
            System.out.println("|__________________________________|");
            System.out.println("|1. Ketikkan Nama Buku             |");
            System.out.println("|2. Ketikkan Nama Penulis          |");
            System.out.println("|3. pilih opsi 'ya' atau 'tidak'   |");
            System.out.println("|   untuk mengkonfirmasi buku      |");
            System.out.println("|4. Konfirmasi Berlangganan        |");
            System.out.println("|   jika ada 'ya'atau'tidak        |");
            System.out.println("|5. masukkan tanggal peminjaman    |");
            System.out.println("|   untuk mengkonfirmasi buku      |");
            System.out.println("|__________________________________|");

        while(!meminjam){
            while(!valid){
            System.out.print("Masukkan Nama Buku: ");
            namaBuku = input.nextLine();
            System.out.print("Masukkan Nama Penulis: ");
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
            }
            if(meminjam){
            System.out.print("Apakah anda ingin meminjam buku\n" + namaBuku + " "+ namaPenulis+ " tersebut? (y/n)");
            next= input.nextLine();
            if(next.equalsIgnoreCase("y")){
                meminjam=true;
                valid=true;
                System.out.print("masukkan tanggal peminjaman: ");
                tanggal = input.nextLine();
            System.out.println(" __________________________________  ");
            System.out.println("|        Terimakasih telah         |");                 
            System.out.println("|      Melakukan Peminjamanan      |");     
            System.out.println("|        Sistem Perpustakaan       |");     
            System.out.println("|__________________________________|");
            System.out.println(" Nama Buku: " + namaBuku);
            System.out.println(" Nama Penulis: " + namaPenulis);
            System.out.println(" Tanggal Peminjaman: " + tanggal);
            System.out.println("|__________________________________|");
            }
            else if(next.equalsIgnoreCase("n")){
                System.out.print("apakan anda ingin melihat buku \nlagi? (y/n)");
                next= input.nextLine();
                if(next.equalsIgnoreCase("y")){
                meminjam = false;
                valid = false;
                }
                else if(next.equalsIgnoreCase("n")){
                break;
                }
                else{
                System.out.println("Masukan anda tidak valid.");
                meminjam = false;
                valid = false;
            }
            }
            else{
                System.out.println("Masukan anda tidak valid.");
                meminjam = false;
                valid = false;
            }
            }
        }
        }
    }
}