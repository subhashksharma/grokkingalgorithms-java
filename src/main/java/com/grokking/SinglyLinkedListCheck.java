package com.grokking;

public class SinglyLinkedListCheck {
    

    public static void main(String[] args) {

        SinglyLinkedList<String> sl = new SinglyLinkedList<String>();
        String a = "subhash";
        String b = "check";
        String c = "check2";
        sl.addFirst(a);
        sl.addFirst(b);
        sl.addFirst(c);

        System.out.println(sl.size());

        System.out.println(sl.getFirst());

        System.out.println(sl.getLast());
        

    }
}
