package com.grokking.linkedList;

public class LinkedList {
    
    public static class Node {

        int data;
        Node next;

        public Node(int item) {
            data = item;
            next = null;
        }
    }

    static Node head;
    static int size = 0;
    static void addFirst(Node node, int data) {
        if (node == null) {
            head = new Node(data);
        } else {
            head.next = head;
            head = new Node(data);
        }
        size++;
    }
    
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();

        lList.addFirst(head, 1);
        lList.addFirst(head, 2);
        lList.addFirst(head, 3);
        lList.addFirst(head, 4);

        System.out.println("Size data ::" + size);

        System.out.println("first data ::" + head.data);
    }
}
