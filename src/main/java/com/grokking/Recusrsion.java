package com.grokking;

public class Recusrsion {
    
    // function to count down 
    static void countDown(int i) {
        System.out.println("count >>>" + i);
        if (i <= 0)
            return;
        countDown(i - 1);
    }

    static int sumNumberInList(int[] array, int size) {
        
        if (size <= 0)
            return 0;
        else
        return array[size - 1] + sumNumberInList(array, size - 1);

    }


   
    public static void main(String[] args) {
        
       // Recusrsion.countDown(6);
       int[] listToCount = {2, 4, 5, 6, 8, 8};
       System.out.println("PRINT SUM ::"+ Recusrsion.sumNumberInList(listToCount, listToCount.length));
    }
}
