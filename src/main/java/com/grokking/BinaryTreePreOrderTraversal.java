package com.grokking;

public class BinaryTreePreOrderTraversal<E> {
    
    public static class Node<E> {
        E key;
        Node<E> left;
        Node<E> right;

        public Node(E item) {
            key = item;
            left = null;
            right = null;
        }
    }
    
    Node<Integer> rootElement;

    public BinaryTreePreOrderTraversal() {
        rootElement = null;
    }

    static void preOrderTraversal(Node<Integer> node) {
        if (node == null) {
            return;
        }
        System.out.println("Elements are " + node.key);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTreePreOrderTraversal<Integer> btree = new BinaryTreePreOrderTraversal<Integer>();

        btree.rootElement = new Node<Integer>(4);
        btree.rootElement.left =new Node(5);
        btree.rootElement.right = new Node(10);
        btree.rootElement.left.left =new Node(7);
        btree.rootElement.left.right = new Node(8);
        btree.rootElement.right.right = new Node(1);

        preOrderTraversal(btree.rootElement);

    }
}
