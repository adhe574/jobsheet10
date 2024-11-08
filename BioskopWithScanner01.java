import java.util.Scanner;
public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom;
        String nama, next;

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = sc01.nextLine();
            System.out.print("Masukkan baris : ");
            baris = sc01.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc01.nextInt();
            sc01.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = sc01.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }            
        }
    }    
}