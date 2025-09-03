package org.example.traverse.tree.nAarayTree;

import java.util.*;

class NaryNode {
    String value;
    List<NaryNode> children;

    NaryNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}

public class NaryTreeExample {
    public static void main(String[] args) {
        /*
                 A
               / | \
              B  C  D
                / \
               E   F
        */

        NaryNode root = new NaryNode("A");
        NaryNode b = new NaryNode("B");
        NaryNode c = new NaryNode("C");
        NaryNode d = new NaryNode("D");
        NaryNode e = new NaryNode("E");
        NaryNode f = new NaryNode("F");

        root.children.add(b);
        root.children.add(c);
        root.children.add(d);
        c.children.add(e);
        c.children.add(f);

        printTree(root);
    }

    static void printTree(NaryNode node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        for (NaryNode child : node.children) {
            printTree(child);
        }
    }
}

