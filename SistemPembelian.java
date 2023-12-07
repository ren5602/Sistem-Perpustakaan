import java.util.Scanner;
import java.util.Arrays;

public class SistemPembelian {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        String pilihBuku, isTersedia, isBeli, afas, sifa;
        
        //Convert String Array To Array
        //String gfg = convertStringArrayToString(buku, ",");
        //String cfc = convertStringArrayToString(nobuku, ",");

        //afas = gfg;
        //sifa = cfc;

        while (true) {
            System.out.println("______________________________");
            System.out.println("______________________________");
            System.out.println("     Daftar Pembelian Buku    ");
            System.out.println("------------------------------");
            System.out.println("   Daftar Buku Yang Tersedia  ");
            System.out.println("______________________________");
            System.out.println("______________________________");
            System.out.println("1. Gagal Menjadi Manusia by Osamu Dazai                              ");
            System.out.println("2. The Complete Stories of Sherlock Holmes by Conan Doyle                             ");
            System.out.println("3. Harry Potter and the Philosopher's Stone by J. K. Rowling                             ");
            System.out.println("4. Your Name by Makoto Shinkai                             ");
            System.out.println("5. I Want To Eat Your Pancreas by Yoru Sumino                             ");
            System.out.println("6. Musashi by Eiji Yoshikawa                             ");
            System.out.println("7. Assassin's Creed: Renaissance by Anton Gill                              ");
            System.out.println("                                                            ");
            System.out.println("8. Kembali Ke Menu                                                            ");
            System.out.println("                                                            ");
            System.out.println("Masukkan Nomor Buku Yang Ingin Dicek : ");

            isTersedia = input19.nextLine();
            
            //int count = 0;
            //for(int i = 0; i < buku; i++){
            if (isTersedia.equals("1")) {
                System.out.println("                              ");
                System.out.println("Harga Buku ini Rp 150.000");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
               
                }
            }
            if (isTersedia.equals("2")) {
                System.out.println("                              ");
                System.out.println("Harga Buku ini Rp 250.000");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
               
                }
            }
            if (isTersedia.equals("3")) {
                System.out.println("                              ");
                System.out.println("Harga Buku ini Rp 200.000");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
               
                }
            }
            if (isTersedia.equals("4")) {
                System.out.println("                              ");
                System.out.println("Harga Buku ini Rp 200.000");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
               
                }
            }
            if (isTersedia.equals("5")) {
                System.out.println("                              ");
                System.out.println("Harga Buku ini Rp 175.000");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
               
                }
            }
            if (isTersedia.equals("6")) {
                System.out.println("                              ");
                System.out.println("Harga Buku ini Rp 250.000");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
               
                }
            }
            if (isTersedia.equals("7")) {
                System.out.println("                              ");
                System.out.println("Harga Buku ini Rp 150.000");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                isBeli = input19.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("                              ");
                    System.out.println("Apakah Anda ingin melihat daftar buku lagi (ya/tidak) ? ");
                    pilihBuku = input19.nextLine();
                    if (!pilihBuku.equals("ya")) {
                        break; // Keluar dari loop jika tidak ingin melihat daftar buku lagi
                    }
               
                }
            }

            if (isTersedia.equals("8")) {
                break;
            }
            
            

          //tring Array To Array
            //private static String convertStringArrayToString(String[] strArr, String delimiter) {
              //  StringBuilder sb = new StringBuilder();
                //for (String str : strArr)
                  //  sb.append(str).append(delimiter);
            //   return sb.substring(0, sb.length() - 1);
            //}
                        
        }
    }        
        }
    
   
