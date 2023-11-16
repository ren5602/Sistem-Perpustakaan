import java.util.Scanner;
public class TampilanAwal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login, username, password;
        
        
        System.out.println("__________________________________");
        System.out.println("__________________________________");
        System.out.println("          Selamat Datang          ");  
        System.out.println("      Di Sistem Perpustakaan      ");     
        System.out.println("        Pangeran Diponegoro       ");
        System.out.println("__________________________________");
        System.out.println("__________________________________");

        int i = 0;
        while(i < 3){
        System.out.print("Silahkan Masukkan Username Terlebih dauhulu : ");
        username = input.nextLine();
        System.out.print("Silahkan Masukkan Password : ");
        password = input.nextLine();
        if(username.equals("admin") && password.equals("1234")){
        System.out.println("Login Berhasil");
            break;
        }
        System.out.println("Login Gagal, silahkan coba lagi");
        i++;
        }
    }
}
