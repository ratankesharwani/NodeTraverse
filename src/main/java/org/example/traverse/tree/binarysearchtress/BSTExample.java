package org.example.traverse.tree.binarysearchtress;

public class BSTExample {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);
        return root;
    }

    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 8};
        for (int val : values) {
            root = insert(root, val);
        }
        inorder(root);  // Output: 2 3 4 5 7 8
    }
}

