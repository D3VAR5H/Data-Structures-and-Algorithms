package DSA;

/*
@author : Nancy Radadia
@date : / /2019
@Description :
 */
import java.util.Scanner;

public class Linear_Search_recursive {

    int search(int arr[], int l, int r, int x) {

        if (l < r) {
            if (arr[l] == x) {
                return l;
            } else if (arr[r] == x) {
                return r;
            } else {
                l++;
                r--;
                search(arr, l, r, x);
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the value of x: ");
        int x = scan.nextInt();

        Linear_Search_recursive ob = new Linear_Search_recursive();
        int re = ob.search(arr, 0, arr.length - 1, x);

        if (re == -1) {
            System.out.println("Not found");

        } else {
            System.out.println("Index is: " + re);
        }

    }

}

/*
Program Output :
 */
