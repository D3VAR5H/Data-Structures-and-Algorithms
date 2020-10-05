/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhatri
 */
import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=0;
        //int n = sc.nextInt();
        int[] a = {3, 5, 3, 6, 2, 3, 4, 1};
        int n=8;
        
        for (int i = 0; i < n; i++) {
            if(a[i]>k){
               k=a[i]; 
            }
        }
        int[] aux=new int[k+1];
        System.out.println(Arrays.toString(aux));
//        for (int i = 0; i < k+1; i++) {
//            aux[i]=0;
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k+1; j++) {
                if(a[i]==j){
                    aux[j]++;
                }
                
            }
            
        }
        int[] sorta= new int[n];
        int j=0;
        for (int i = 0; i < k+1; i++) {
            int temp=aux[i];
            while(temp!=0){
                sorta[j]=i;
                j++;
                temp--;
            }
        }
        System.out.println(Arrays.toString(sorta));
        //System.out.println(Arrays.toString(aux));
    }
    
}
/*
6,2,3,8,6

   
0 1 2 3 4 5 6 7 8
    1 1     2   1

2 3 6 6 8
time complexity:
the array a is transversed O(n) times while sorta is also transversed O(n) times. and aux is trans 
O(k) times so tc is O(n+k)
he complexity of counting Sort Technique
Time Complexity: O(n+r)
Space Complexity: O(n+r)
*/