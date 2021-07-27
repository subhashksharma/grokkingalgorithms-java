package com.grokking;

public class BinaryTree {

    class Node {
        int key;
        Node left, right;
        public Node(int item) {
            key = item;
            left = null;
            right = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        BinaryTree btree = new BinaryTree();
        btree.root = btree.new Node(1);
        btree.root.left = btree.new Node(2);
        btree.root.right = btree.new Node(3);
    }
    
}
