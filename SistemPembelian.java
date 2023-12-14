static void Pembelian() {

            System.out.println("______________________________");
            System.out.println("|==============================|");
            System.out.println("|       Daftar Pembelian       |");
            System.out.println("|------------------------------|");
            System.out.println("|Sistem Perpustakaan Diponegoro|");
            System.out.println("|                              |");
            System.out.println("|______________________________|");
            for (int i = 0; i < maxBuku; i++) {
            if (perpustakaan[i][6] == purchasable) {
                {
            System.out.println("Judul: " + perpustakaan[i][0]);
            System.out.println("Harga: " + perpustakaan[i][7]);
            System.out.println();
                }



            System.out.println("Masukkan Buku Yang Ingin Dibeli");
            String isTersedia = input.nextLine();
            
            if (isTersedia.equalsIgnoreCase(perpustakaan[i][0])) {
                System.out.println("                              ");
                System.out.println("Buku ini tersedia");
                System.out.println("Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? ");
                String isBeli = input.nextLine();
                
                if (isBeli.equals("ya")) {
                    System.out.println("                              ");
                    System.out.println("Buku berhasil ditambahkan silahkan membayar dikasir.");
                    System.out.println("                              ");
                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");
                    input.nextLine();
                    menuAdmin();
                    }
    }
}
            }
        
        }