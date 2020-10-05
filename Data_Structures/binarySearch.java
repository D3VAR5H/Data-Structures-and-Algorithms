package Year02.practice;

import java.util.Arrays;

public class binarySearch {

    public int recursive(char[] ch, int first, int last, char c) {
        int m = (first + last) / 2;
        if (ch[m] != c) {
            if (ch[m] > c)
                return recursive(ch, first, m - 1, c);
            else if (ch[m] < c)
                return recursive(ch, m + 1, last, c);
        } else {
            return m + 1;
        }
        return -1;
    }

    public int iterative(char[] ch, int first, int last, char c) {

        while (first < last) {
            int m = (first + last) / 2;
            if (ch[m] == c) {
                return m + 1;
            } else if (ch[m] > c) {
                last = m - 1;
            } else if (ch[m] < c) {
                first = m + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        binarySearch temp = new binarySearch();
        String s1 = "BINARY";
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        int n = temp.recursive(ch, 0, ch.length - 1, 'A');
        if (n != -1) {
            System.out.println("Recursive Method :");
            System.out.println("Index Of Element is : " + n);
        } else
            System.out.println("Element is not Found. ");

        int m = temp.iterative(ch, 0, ch.length - 1, 'A');
        if (m != -1) {
            System.out.println("Iterative Method :");
            System.out.println("Index Of Element is : " + m);
        } else
            System.out.println("Element is not Found.");

    }
}