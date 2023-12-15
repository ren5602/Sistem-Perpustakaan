static void Pembelian() {

        System.out.println("________________________________");
        System.out.println("|==============================|");
        System.out.println("|       Daftar Pembelian       |");
        System.out.println("|------------------------------|");
        System.out.println("|Sistem Perpustakaan Diponegoro|");
        System.out.println("|                              |");
        System.out.println("|______________________________|");

            
     
        System.out.println("\n------------------------------------------------------------------|");
        System.out.println("|     Judul Buku      |       Penulis         |       Harga       |");
        System.out.println("|-----------------------------------------------------------------|");
        for (int i = 0; i < jumlahBuku; i++) {    
       if (perpustakaan[i][6] == purchasable) 
            System.out.printf("|    %-15s|   %-18s|   %-20s|\n",
                    perpustakaan[i][0], perpustakaan[i][1],
                    perpustakaan[i][7]);
        }
        System.out.println("|-------------------------------------------------------------------------------------|");
                
        System.out.println("Masukkan Buku Yang Ingin Dibeli");
                input.nextLine(); 
                String katakunci = input.nextLine().toLowerCase(); 

                boolean found = false;
                for (int i = 0; i < jumlahBuku; i++) {
            if (perpustakaan[i][0].toLowerCase().contains(katakunci)) {
                System.out.println("Buku ini tersedia");
                System.out.println("");
                System.out.println("\n____________________________________________________________________");
                System.out.println("|                                                                  |");
                System.out.println("|Apakah anda ingin menambahkan buku kedalam keranjang (ya/tidak) ? |");
                System.out.println("|__________________________________________________________________|");
                System.out.println("");
                String beli = input.nextLine();
                found = true;
                if (beli.equals("ya")) {
                    System.out.println("");
                    System.out.println("\n______________________________________________________");
                    System.out.println("|                                                    |");
                    System.out.println("|Buku berhasil ditambahkan silahkan membayar dikasir.|");
                    System.out.println("|____________________________________________________|");
                    System.out.println("");
                }
            }
        }
                    if(!found) {   
                    System.out.println("\n_________________________");    
                    System.out.println("|                       |");    
                    System.out.println("|Buku ini tidak tersedia|");
                    System.out.println("|_______________________|");
                }
                
                
                
                    System.out.println("\n ______________________________________");
                    System.out.println("|                                      |");
                    System.out.println("|  Tekan ENTER untuk kembali ke Menu   |");
                    System.out.println("|______________________________________|");
                    input.nextLine();
                    menuAdmin();
                }