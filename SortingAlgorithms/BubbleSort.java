import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array that you want to make:");
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("enter the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        scan.close();
    }
}