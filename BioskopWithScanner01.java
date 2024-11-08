import java.util.Scanner;
public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) { 
            System.out.println("===== MENU =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu : ");
            pilihan = sc01.nextInt();
            sc01.nextLine();

            switch (pilihan) {
                case 1 :
                    System.out.println("===== Input data penonton =====");
                    boolean tambahPenonton = true;
                    while (tambahPenonton) { 
                        System.out.print("Masukkan nama : ");
                        String nama = sc01.nextLine();
                        System.out.print("Masukkan baris (1-4) : ");
                        int baris = sc01.nextInt();
                        System.out.print("Masukkan kolom (1-2) : ");
                        int kolom = sc01.nextInt();
                        sc01.nextLine();

                        if (baris>=1 && baris<=4 && kolom>=1 && kolom<=2) {
                            if (penonton[baris-1][kolom-1] == null) {
                                penonton[baris-1][kolom-1] = nama;
                            } else {
                                System.out.println("Kursi sudah terisi, silahkan cari kursi lain");
                            }
                        } else {
                            System.out.println("Baris atau kolom kursi tidak tersedia");
                        }

                        System.out.print("Input penonton lainnya? (y/n) : ");
                        String next = sc01.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            tambahPenonton = false;
                        }                        
                    }
                        break;

                case 2 :
                    System.out.println("===== Daftar Penonton =====");
                    for (int i=0; i<penonton.length; i++) {
                        for (int j=0; j<penonton[i].length; j++){
                            if (penonton[i][j] == null) {
                                System.out.println("***\t");
                            } else {
                                System.out.println(penonton[i][j] + "\t"); 
                            }
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3 : 
                    System.out.println("Keluar dari program. Terima kasih!");
                    sc01.close();
                    return;

                default :
                   System.out.println("Pilihan tidak valid. Silahkan pilih menu yang tersedia.");
            }
            System.out.println();
        }
    }
}