package DSA;

/*
@author : Nancy Radadia
@date : / /2019
@Description :
*/ 
import java.util.*;
public class Binary_search_iterative {
    
    void merge(int arr[],int p, int q, int r){
        
        int n1 = q-p+1;
        int n2 = r-q;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < L.length; i++) {
            L[i] = arr[p+i];
        }
        for (int j = 0; j < R.length; j++) {
            R[j] = arr[q+1+j];
        }
        
        int i=0,j=0;
        
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
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
    
    void sort(int arr[], int p, int r) {
        
        if(p<r){
            int q = (p+r)/2;
            sort(arr,p,q);
            sort(arr,q+1,r);
            merge(arr,p,q,r);
            
        }
        
    }
    
    int binary(int arr[], int x){
        int l =0, r = arr.length-1;
      
        
        while(l<=r){
              int mid = r+l/2;
              
              if(arr[mid]<x){
                  
                  l = mid+1;
              }
              else if(arr[mid]>x){
                  r = mid-1;
              }
              else if(arr[mid]==x){
                  return mid;
                  
              }
        }
        return -1;
        
    }
    
    static void print(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        Binary_search_iterative ob = new Binary_search_iterative();
        ob.sort(arr, 0, arr.length-1);
        
        System.out.println("sorted array is: ");
        print(arr);
        
        System.out.println("Enter the value of x: ");
        int x = scan.nextInt();
        
        int result = ob.binary(arr,x);
        if(result ==-1){
            System.out.println("Not found");
            
            
        }
        else
        {
            System.out.println("Index is: "+result);
        }        
        
    }
    

}

/*
Program Output :
*/
