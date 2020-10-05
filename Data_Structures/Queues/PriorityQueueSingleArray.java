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

public class PriorityQueueSingleArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int x = 0;
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        Queue2 q1 = new Queue2(n);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter priority:");
            int p = sc.nextInt();
           // int[] x=new int[n];
            //x[i]=p;

         
            if (p <= n && p > 0) {

                System.out.println("Enter element:");
                a[p - 1] = sc.nextInt();

            } else {
                System.out.println("Enter correct priority:");
            }

        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < n; i++) {
            q1.queueEnqueue(a[i]);
        }
        q1.queueDequeue();
        q1.queueDisplay();

    }

}

class Queue2 {

    private static int front, rear, capacity;
    private static int queue[];

    Queue2(int n) {
        front = rear = 0;
        capacity = n;
        queue = new int[capacity];
    }

    static void queueEnqueue(int data) {
        // check queue is full or not 
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } // insert element at the rear 
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    // function to delete an element 
    // from the front of the queue 
    static void queueDequeue() {
        // if queue is empty 
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } // shift all the elements from index 2 till rear 
        // to the right by one 
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            // store 0 at rear indicating there's no element 
            if (rear < capacity) {
                queue[rear] = 0;
            }

            // decrement rear 
            rear--;
        }
        return;
    }

    static void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }
}
/*
Enter the length of array: 
2
Enter priority:
1
Enter element:
3
Enter priority:
2
Enter element:
4
[3, 4]
 4 <-- 
*/
