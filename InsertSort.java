package com.example.xu.myapplication;

/**
 * Created by xu on 2016/8/30.
 */
public class InsertSort {
    public static void main(String[] args){
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertSort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    private static void insertSort(int[] list) {
        if(list==null||list.length<2){
            return;
        }
        for(int i=1;i<list.length;i++){
            for(int j=i;j>0;j--){
                if(list[j]<list[j-1]){
                    int temp=list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                }
            }
        }
    }
}
