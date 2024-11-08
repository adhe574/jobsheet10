import java.util.Arrays;
import java.util.Scanner;
public class Numbers01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[0] = new int[3];
        myNumbers[0] = new int[1];

        for (int i=0; i<myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for (int i=0; i<myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + myNumbers[i].length);
        }
    }    
}