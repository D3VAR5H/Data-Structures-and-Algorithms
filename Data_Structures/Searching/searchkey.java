package DSA;

/*
@author : Nancy Radadia
@date : / /2019
@Description :
*/ 

import java.util.Scanner;

public class searchkey {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.println("Enter the no. you want to search: ");
        int n1 = scan.nextInt();
        int count=0;
        System.out.println("Indexes at which numbers are found:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n1){
                count++;
                System.out.println(i+"");
            }
        }
        if(count==0){
            System.out.println("Number not found");
        }else{
            System.out.println("The total count of the entered no is: "+count);
        }
    }

}

/*
Program Output :
*/
