import java.util.Scanner;
public class TampilanAwal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menyiapkan beberapa pengguna dengan kategori admin dan user
        String[][] login_admin = {{"admin1","pass1"},{"admin2","pass2"},{"admin3","pass3"}};
        String[][] login_user = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};

        //deklarasi variabel
        String login, username, password;

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
        System.out.print("Masukkan Pilihan anda : ");
        // input untuk pilihan antara admin atau user
        login = input.nextLine();

        // logika ketika memilih 1 sebagai admin
        if(login.equals("1")){
            int percobaan = 0; // "percobaan" dimulai dari 0
            while (percobaan < 3){ // logika perulangan untuk percobaan memasukkan username dan password
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
                    // Pindah ke halaman admin
                    // silahkan masukkan source code fitur untuk halaman admin
                }else{
                    percobaan++; // "percobaan" ditambah 1
                    if(percobaan <=2){
                        System.out.println("Silahkan Coba lagi"); 
                    }else if(percobaan == 3){
                        System.out.println("Anda telah mencoba sebanyak 3 kali, anda akan dikeluarkan dari program");
                    }
                }
            
            }
            
        // logika ketika memilih 2 sebagai user
        }else if(login.equals("2")){
            int percobaan = 0; // "percobaan" dimulai dari 0
            while (percobaan < 3){ // logika perulangan untuk percobaan memasukkan username dan password
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
                // Pindah ke halaman user
                //masukkan source code fitur untuk halaman user
            }else{
                percobaan++; // "percobaan" ditambah 1
                if(percobaan <=2){
                    System.out.println("Silahkan Coba lagi"); 
                    }else if(percobaan == 3){
                        System.out.println("Anda telah mencoba sebanyak 3 kali, anda akan dikeluarkan dari program");
                    }
                }
            }
      
        }// end login user
    }
}