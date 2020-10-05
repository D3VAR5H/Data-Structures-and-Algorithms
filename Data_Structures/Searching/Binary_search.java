package DSA;

/*
@author : Nancy Radadia
@date : / /2019
@Description :
 */
import java.util.*;

public class Binary_search {

    void merge(int arr[], int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < L.length; i++) {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < R.length; j++) {
            R[j] = arr[q + 1 + j];
        }

        int i = 0, j = 0;

//        for (int k = p; k <= r; k++) {
//            if(i>n1){
//                arr[k] = R[j];
//                j++;
//            }
//            else if(j>n2){
//                 arr[k] = L[i];
//                i++;
//            }
//            else if(L[i]<R[j]){
//                arr[k] = L[i];
//                i++;
//            }
//            else if(R[j]<L[i]){
//                arr[k] = R[j];
//                j++;
//            }
//        }
        int k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            sort(arr, p, q);
            sort(arr, q + 1, r);
            merge(arr, p, q, r);

        }

    }

    static void print(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    int binary(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binary(arr, l, mid - 1, x);
            }

            return binary(arr, mid + 1, r, x);
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

        Binary_search ob = new Binary_search();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        print(arr);

        System.out.println("Enter the number you want to search: ");
        int n1 = scan.nextInt();
        int r = ob.binary(arr, 0, arr.length - 1, n1);

        if (r == -1) {
            System.out.println("The index does not exist");
        } else {
            System.out.println("The index is: " + r);
        }

    }

}

/*
Program Output :
 */
