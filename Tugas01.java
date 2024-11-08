import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        int[][] hasilSurvei = new int[10][6];
        double total = 0, rata2, totalRata2 = 0, rata2Keseluruhan;
        int totalKeseluruhan = 0;

        for (int i=0; i<hasilSurvei.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            System.out.println("Masukkan hasil survei (nilai 1-5) untuk setiap pertanyaan");
            for (int j=0; j<hasilSurvei[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j+1) + " : ");
                hasilSurvei[i][j] = sc01.nextInt();
            }
        }

        for (int i=0; i<hasilSurvei.length; i++) {
            total = 0;
            for (int j=0; j<hasilSurvei[i].length; j++) {
                total += hasilSurvei[i][j];
            }
            rata2 = total/hasilSurvei[i].length;
            System.out.println("Rata-rata responden ke-" + (i+1) + " : " + rata2);
        }

        for (int j=0; j<hasilSurvei[0].length; j++) {
            total = 0;
            for (int i=0; i<hasilSurvei.length; i++) {
                total += hasilSurvei[i][j];
            }
            rata2 = total/hasilSurvei.length;
            System.out.println("Rata-rata pertanyaan ke- " + (j+1) + " : " + rata2);
        }

        for (int i=0; i<hasilSurvei.length; i++) {
            for (int j=0; j<hasilSurvei[i].length; j++) {
                totalRata2 += hasilSurvei[i][j];
                totalKeseluruhan++;
            }
        }
        rata2Keseluruhan = totalRata2/totalKeseluruhan;
        System.out.println("Rata-rata keseluruhan : " + rata2Keseluruhan);
    }
}
