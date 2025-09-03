package org.example.traverse.tree.fullbinarytree;


import org.example.traverse.tree.Node;

public class FullBinaryTreeExample {
    public static void main(String[] args) {
        //Each node has either 0 or 2 children.
                /*
                1
               / \
              2   3
             / \  / \
            4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Output (example: in-order)
        inorder(root);
    }

    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
}

