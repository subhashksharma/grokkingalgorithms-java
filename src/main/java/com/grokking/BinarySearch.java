/**
 * @author subhash kumar sharma
 * @email [example@mail.com]
 * @create date 2021-06-01 16:25:05
 * @modify date 2021-06-01 16:25:05
 * @desc [description]
 */

package com.grokking;
public class BinarySearch {

    public static int binarySearch(int[] array, int key) {
        int searchElementIndex = -1;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (array[middle] == key) {
                return searchElementIndex = middle;
            }
            if (key < array[middle]) {
                high = middle - 1;
            }
            if (key > array[middle]) {
                low = middle + 1;
            }
        }
        return searchElementIndex;
    }
    

    public static void main(String[] args) {

        int []  ele = {2, 5, 6, 8, 9, 30, 68};

        System.out.println(BinarySearch.binarySearch(ele, 30));
    }
}
