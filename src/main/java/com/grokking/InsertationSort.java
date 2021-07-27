package com.grokking;

public class InsertationSort {
    

    static int[] insertionSortFunction(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        return array;
    }
    

    public static void main(String[] args) {

        int[] array = { 2, 9, 7, 5, 8, 7 };

        int[] sortedArray = InsertationSort.insertionSortFunction(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
       

    }
}
