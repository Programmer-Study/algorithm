package com.programstudy.sort;

/**
 * @ClassName : InsertSort  //类名
 * @Description : 插入排序  //描述
 * @Author : geyongfei  //作者
 * @Date: 2021-07-25 18:05  //时间
 * @Version: 1.0
 */
public class InsertSort {
    //打印排序结果
    public static void main(String[] args) {
        int[] arr = {7,1,3,5,1,4,2,9,2,1,22,18,99,13};
        printArray(arr);
        insertSort(arr);
        printArray(arr);
    }

    //对数组进行排序
    public static void insertSort(int[] arr){
        //0~1
        //0~2
        //0~3
        int arrLength = arr.length;
        for (int i = 1; i < arrLength; i++) {
            for (int j = i-1 ; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr,j,j+1);
            }
        }
    }

    private static void swap(int[] arrays, int i, int minIndex){
        int tempNo = arrays[i];
        arrays[i] = arrays[minIndex];
        arrays[minIndex] = tempNo;
    }

    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }
}
