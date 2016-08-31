package com.example.xu.myapplication;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        mergeSort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] list) {
        if (list == null || list.length < 2) {
            return;
        }
        int[] firstHalf = new int[list.length / 2];
        System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
        mergeSort(firstHalf);

        int secondHalfLength = list.length - list.length / 2;
        int[] secondHalf = new int[secondHalfLength];
        System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
        mergeSort(secondHalf);

        int[] temp = merge(firstHalf, secondHalf);
        System.arraycopy(temp, 0, list, 0, temp.length);

    }

    private static int[] merge(int[] firstHalf, int[] secondHalf) {
        int[] temp = new int[firstHalf.length + secondHalf.length];
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        int tempIndex = 0;

        while (firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length) {
            if (firstHalf[firstHalfIndex] < secondHalf[secondHalfIndex]) {
                temp[tempIndex] = firstHalf[firstHalfIndex];
                tempIndex = tempIndex + 1;
                firstHalfIndex = firstHalfIndex + 1;
            } else {
                temp[tempIndex] = secondHalf[secondHalfIndex];
                tempIndex = tempIndex + 1;
                secondHalfIndex = secondHalfIndex + 1;
            }
        }
        while (firstHalfIndex < firstHalf.length) {
            temp[tempIndex] = firstHalf[firstHalfIndex];
            tempIndex = tempIndex + 1;
            firstHalfIndex = firstHalfIndex + 1;
        }
        while (secondHalfIndex < secondHalf.length) {
            temp[tempIndex] = secondHalf[secondHalfIndex];
            tempIndex = tempIndex + 1;
            secondHalfIndex = secondHalfIndex + 1;
        }
        return temp;
    }
}
