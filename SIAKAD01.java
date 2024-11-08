import java.util.Scanner;
public class SIAKAD01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jumlahMhs = sc01.nextInt();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMatkul = sc01.nextInt();

        int[][] nilai = new int[jumlahMhs][jumlahMatkul];

        for (int i=0; i<jumlahMhs; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for (int j=0; j<jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc01.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i+1) + " : " + (totalPerSiswa/jumlahMatkul));
        }

        System.out.println("Rata-rata Nilai setiap Mata Kuliah : ");

        for (int j=0; j<jumlahMatkul; j++) {
            double totalPerMatkul = 0; 
            for (int i=0; i<jumlahMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + " : " + (totalPerMatkul/jumlahMhs));
        }
        sc01.close();
    }    
}