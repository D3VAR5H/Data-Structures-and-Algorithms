import java.util.Scanner;

public class quickSort {
    static void sort(int a[],int first,int last){
        int temp,low,high,pivot;
        low=first;
        high=last;
        pivot=a[(high+low)/2];
        while(low<=high){
            while(a[low]<pivot){
                low++;
            }
            while(a[high]>pivot){
                high--;
            }
            if(low<=high){
                temp=a[low];
                a[low]=a[high];
                a[high]=temp;
                low++;
                high--;
            }
        }
        if(first<high){
            sort(a,first,high);
        }
        if(low<last){
            sort(a,low,last);
        }
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of array that you want to make:");
        int s=scan.nextInt();
        int a[]=new  int[s];
        System.out.println("enter the array:");
        for(int i=0;i<s;i++){
            a[i]=scan.nextInt();
        }
        sort(a, 0, s-1);
        for(int i=0;i<s;i++){
            System.out.print(a[i]+" ");
        }
        scan.close();
    }
}