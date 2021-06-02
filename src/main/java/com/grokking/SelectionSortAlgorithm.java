package com.grokking;

public class SelectionSortAlgorithm {



    static int findSmallestFromArray(int[] array) {
        int smallest = array[0];
        int smallest_index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    static int []   selectionSort(int [] array) {
        
        for (int i = 0; i < array.length-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
        }
        return array;
    }
    
    public static void main(String[] args) {
        int [] selectedArray =  {2, 4, 5, 30, 6, 6, 9};
        int[] sortedArray = SelectionSortAlgorithm.selectionSort(selectedArray);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Sorted Array Value =>>" + sortedArray[i]);
        }

    }
}
