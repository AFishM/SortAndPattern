package com.example.xu.myapplication;

/**
 * Created by xu on 2016/8/24.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] originalArray = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(originalArray);
        for (int i : originalArray) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] sortArray) {
        if (sortArray == null || sortArray.length < 2) {
            return;
        }
        int temp;
        boolean hasBeenSwap = false;
        for (int i = 1; i < sortArray.length; i++) {
            for (int j = 0; j < sortArray.length - i; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                    hasBeenSwap = true;
                }
                if (j == sortArray.length - i - 1) {
                    if (!hasBeenSwap) {
                        return;
                    }
                    hasBeenSwap = false;
                }
            }
        }
    }
}
