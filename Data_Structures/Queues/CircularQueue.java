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

class cirQueue{
	protected int arr[];         
	protected int front;         
	protected int rear;          
	protected int capacity;      
	protected int count;         
	
	cirQueue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = -1;
		rear = -1;
	}

	public void enqueue(int value) {
        if ((front == 0 && rear == capacity - 1) || front - 1 == rear) {
            System.out.println("Full");
        } else {
            if (rear < 0) {
                rear = front = 0;
                arr[rear] = value;
            } else if (rear == capacity - 1) {
                rear = 0;
                arr[rear] = value;

            } else {
                rear++;
                arr[rear] = value;
            }
        }
    }

    public int dequeue() {
        if (front < 0) {
			System.out.println("empty");
			return Integer.MIN_VALUE;
		}
        if (front == rear) {
			int tmp = front;
			front = rear = -1;
			return arr[tmp];
        } else if (front == capacity- 1) {
			int tmp = front;
			front = 0;
			return arr[tmp];
        } else {
            return arr[front++];
        }
    }

    public void display() {
        if (front < 0) {
            System.out.println("Empty");
        } else if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else if (rear < front) {
            for (int i = front; i <= capacity - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
	}
}

public class CircularQueue{
	public static void main(String args[]) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        cirQueue qu = new cirQueue(5);
        do{
            System.out.print("Queue : ");
            qu.display();
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");

            System.out.print("\nEnter Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value you want to insert : ");
                    qu.enqueue(sc.nextInt());
                    break;
            
                case 2:
                    qu.dequeue();
                    break;

                case 3:
                    qu.display();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }while(choice!=4);
        sc.close();
    }

}