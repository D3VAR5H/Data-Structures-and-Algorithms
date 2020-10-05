package Year02.practice;

public class BinaryTree {

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }

    }

    Node root;

    BinaryTree() {
        root = null;
    }

    public void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
        System.out.println();
    }

    /* Given a binary tree, print its nodes in inorder*/
    public void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
        System.out.println();
    }

    public void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
        System.out.println();
    }

    public void printPostorder() {
        printPostorder(root);
    }

    public void printInorder() {
        printInorder(root);
    }

    public void printPreorder() {
        printPreorder(root);
    }

    public static void main(String[] args) {
        BinaryTree s = new BinaryTree();
        s.root = new Node(1);
        s.root.left = new Node(2);
        s.root.right = new Node(3);
        s.root.left.left = new Node(4);


        System.out.println("Preorder of binary tree is ");
        s.printPreorder();

        System.out.println("Inorder of binary s is ");
        s.printInorder();

        System.out.println("\nPostorder traversal of binary s is ");
        s.printPostorder();
    }
}
