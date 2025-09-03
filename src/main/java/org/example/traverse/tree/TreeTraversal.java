package org.example.traverse.tree;

public class TreeTraversal {
    // In-order traversal (left, root, right)
    void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        TreeTraversal tree = new TreeTraversal();
        tree.inorder(root);
    }
}
