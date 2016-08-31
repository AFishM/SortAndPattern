package com.example.xu.myapplication;

/**
 * Created by xu on 2016/8/31.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        selectionSort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] list) {
        if (list == null || list.length < 2) {
            return;
        }
        int minValueIndex;
        for (int i = 0; i < list.length - 1; i++) {
            minValueIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            if (minValueIndex != i) {
                int temp = list[minValueIndex];
                list[minValueIndex] = list[i];
                list[i] = temp;
            }
        }
    }
}
