package org.example.traverse.tree.binarytree;

import org.example.traverse.tree.Node;

public class BinaryTreeExample {
    public static void main(String[] args) {
        //Each node has at most two children.
        // Creating the tree:
        /*
                1
               / \
              2   3
             / \
            4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

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
