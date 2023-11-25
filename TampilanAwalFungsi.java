import java.util.Scanner;
public class TampilanAwalFungsi {
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
        System.out.println("__");
        System.out.println("__");
        System.out.println("          Selamat Datang          ");
        System.out.println("      Di Sistem Perpustakaan      ");
        System.out.println("        Pangeran Diponegoro       ");
        System.out.println("__");
        System.out.println("__");

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
}