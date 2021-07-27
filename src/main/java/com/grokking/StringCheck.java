package com.grokking;

public class StringCheck {
    

    static String checkString(String s) {

        int initialLength = s.length();

        if (initialLength <= 1) {
            return s;
        }
        String a = s.substring(0, initialLength / 2);
        String b = s.substring(initialLength / 2, initialLength);
        System.out.println("Print A ::" + a);
        System.out.println("Print B :: " +  b);
        return checkString(a) + checkString(b);
    }

    public static void main(String[] args) {
        System.out.println(StringCheck.checkString("subhash"));
    }
}
