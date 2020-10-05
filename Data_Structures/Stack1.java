package Year02.practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Stack1 {
    int stackSize = 1000;
    int arr[];
    int top;

    public Stack1() {
        arr = new int[stackSize];
        top = -1;
    }

    public int push(int element) {
        if (top + 1 >= stackSize)
            return Integer.MAX_VALUE;
        else
            arr[++top] = element;
        return top;
    }

    public int pop() {
        int temp;
        if (top <= -1)
            return Integer.MIN_VALUE;
        else {
            temp = arr[top];
            --top;
        }
        return temp;
    }

    public void peep(int index) {
        if (index > top)
            System.out.println("Invalid Index :");
        else if (index < 0)
            System.out.println("Stack is Empty :");
        else
            System.out.println("Element is : " + arr[index]);
    }

    public void update(int index, int element) {
        if (index > top)
            System.out.println("Invalid Index :");
        else if (index < 0)
            System.out.println("Stack is Empty :");
        else
            arr[index] = element;
    }

    public void display() {
        System.out.println("Stack : ");
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" ");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peak Element");
            System.out.println("4. Update Element");
            System.out.println("5. Exit");
            System.out.println("press the number :");
            int n = input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the element :");
                    int push = s.push(input.nextInt());
                    if (push == Integer.MAX_VALUE) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.println("Element is inserted at index " + push);
                    }
                    s.display();
                    break;
                case 2:
                    int pop = s.pop();
                    if(pop == Integer.MIN_VALUE) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println(pop + " is removed");
                    }
                    s.display();
                    break;
                case 3:
                    System.out.println("Enter the index : ");
                    s.peep(input.nextInt());
                    s.display();
                case 4:
                    System.out.println("Enter the index and Element: ");
                    s.update(input.nextInt(), input.nextInt());
                    s.display();
                case 5:
                    System.exit(0);
                    break;

            }
            input.close();
        }
    }
}

/*
 public void push(int element) {
        if (top + 1 >= stackSize)
            System.out.println("Stack Overflow");
        else
            arr[++top] = element;
 }

    public void pop() {
        int temp;
        if (top <= -1)
            System.out.println("Stack Underflow");
        else {
            temp = arr[top];
            --top;
        }
    }
 */