package DSA;

/*
@author : Nancy Radadia
@date : / /2019
@Description :
 */
import java.util.Arrays;
import java.util.Scanner;

public class Magic_Matric {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scan.nextInt();

        System.out.println("Enter elements row wise: ");
        int row[][] = new int[n][n];
        int[] check = new int[2 * n + 2];
        int sum = 0, k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j] = scan.nextInt();
            }
        }
       
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + row[i][j]);
            }
        }
        
        // For row wise sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + row[i][j];
            }
            check[k] = sum;
            k++;
            sum = 0;
        }
        
        // For column wise sum
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sum = sum + row[i][j];
            }
            check[k] = sum;
            k++;
            sum = 0;
        }
        
        // For primary diagonal
        for (int i = 0; i < n; i++) {
            sum = sum + row[i][i];
        }
        check[k] = sum;
        k++;
        sum = 0;
        
        // For second diagonal
        for (int i = 0; i < n; i++) {
            sum = sum + row[i][n - 1 - i];
        }
        check[k] = sum;
        k++;
        sum = 0;

        Arrays.sort(check);
      //  System.out.println("\n");

        if (check[0] == check[2 * n + 1]) {
            System.out.println("\n It is a square matrix");
        } else {
            System.out.println("\n It is not a square matrix");
        }

        // System.out.println(Arrays.toString(col));
    }

}

/*
Program Output :
 */
