package com.grokking.linkedList;


class Node {
    int data;
    Node next;
}

class Linked {

    private Node getNewNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    public Node insertDataInLinkedList(int data, Node rootNode) {
        if (rootNode == null) {
            return getNewNode(data);
        } else {
            rootNode.next = insertDataInLinkedList(data, rootNode.next);
        }
        return rootNode;
    }

    public Node insertDataAtFront(int data, Node rootNode) {
        Node nodeToInsert = getNewNode(data);
        nodeToInsert.next = rootNode;
        return nodeToInsert;       
    }
    


    public Node insertDataAtAnyPosition(int data, int position, Node rootNode) {
        if (position < 1) {
            System.out.println(" Can not insert the element beyond this ");
            return rootNode;
        }
        if (rootNode == null && position > 1) {
            System.out.println("Position can not be  greater than element in List");
            return rootNode;
        }
        if (rootNode == null && position == 1) {
            return getNewNode(data);
        }
        if (position == 1) {
            Node node = getNewNode(data);
            node.next = rootNode;
            return node;
        }
        rootNode.next = insertDataAtAnyPosition(data, position - 1, rootNode.next);
        return rootNode;
    }
    

    public Node deleteNodeFromTail(Node rootNode) {
        if (rootNode == null || rootNode.next == null) {
            return null;
        }
        Node temp = rootNode;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return rootNode;
    }
    

    public Node deleteNodeFromHead(Node rootNode) {
        if (rootNode == null) {
            return rootNode;
        }
        return rootNode.next;
    }

    public Node deleteNodeFromGivenPosition(int position, Node rootNode) {
        if (position < 0) {
            System.out.println(" Not a valid position ");
            return null;
        }
        if (rootNode == null && position > 1) {
            System.out.println(" Not a valid position ");
            return null;
        }
        if (position == 1) {
            return rootNode.next;
        }
        rootNode.next = deleteNodeFromGivenPosition(position - 1, rootNode.next);
        return rootNode;

    }
    public void printNodeData(Node node) {
        
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printNodeData(node.next);
    }
}
public class LinkedListRecursion {
    public static void main(String[] args) {
        Node root = null;
        Linked linked = new Linked();
        root = linked.insertDataInLinkedList(7, root);
        root = linked.insertDataInLinkedList(9, root);
        root = linked.insertDataInLinkedList(12, root);
        root = linked.insertDataInLinkedList(15, root);
        //root = linked.insertDataAtFront(2, root);

        root = linked.deleteNodeFromHead(root);

        linked.printNodeData(root);
    }

}
