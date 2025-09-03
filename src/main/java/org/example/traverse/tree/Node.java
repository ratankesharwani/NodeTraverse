package org.example.traverse.tree;

public class Node {
    public int value;
    public Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}
