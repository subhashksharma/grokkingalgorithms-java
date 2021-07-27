package com.grokking;

public class SinglyLinkedList<E> {

   
   
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> e) {
            next = e;
        }
    }
    
    public Node<E> head = null;
    public Node<E> tail = null;
    public int size = 0;
    public SinglyLinkedList() {
    };

    public int size() {
        return size;
    }
     
    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public E getFirst() {
        if (isEmpty())
            return null;
        E element = head.getElement();
        return element;
    }
    
    public E getLast() {
        if (isEmpty())
            return null;
        E element = tail.getElement();

        return element;

    }
    
}
