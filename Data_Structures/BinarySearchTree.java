package Year02.practice;

import java.util.Scanner;

public class BinarySearchTree {

    static class Node {
        int value;
        Node left, right;

        public Node(int item) {
            this.value = item;
            left = right = null;
        }

        Node insert(Node root, int value) {

            if (root == null) {
                root = new Node(value);
                return root;
            }

            if (value < root.value) {
                if (root.left == null) {
                    root.left = new Node(value);
                } else {
                    root.left = insert(root.left, value);
                }
            }

            if (value > root.value) {
                if (root.right == null) {
                    root.right = new Node(value);
                } else {
                    root.right = insert(root.right, value);
                }
            }

            return root;
        }
    }

    public static void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.println(node.value);
        printInorder(node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(44);
        node.insert(node,20);
        node.insert(node,25);
        node.insert(node,50);
        node.insert(node,76);
        node.insert(node,98);
        node.insert(node,97);
        node.insert(node,33);

        printInorder(node);
    }
}
