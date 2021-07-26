package com.programstudy.sort;

/**
 * @ClassName : SelectionSort  //类名
 * @Description : 选择排序  //描述
 * @Author : geyongfei  //作者
 * @Date: 2021-07-25 14:20  //时间
 * @Version: 1.0
 */
public class SelectionSort {

    //打印排序结果
    public static void main(String[] args) {
        int[] arr = {7,1,3,5,1,4,2,9,2,1,22,18,99,13};
        printArray(arr);
        selectSort(arr);
        printArray(arr);
    }

    //对数组进行排序
    private static void selectSort(int[] arrays){
        int arrayLength = arrays.length;
        for (int i = 0; i < arrayLength; i++) {
            int minIndex = i;
            for (int j = i+1; j < arrayLength; j++) {
                if(arrays[j] < arrays[minIndex]){
                    minIndex = j;   //如果当前下标的值，小于所记录的最小下标的值，则更新下标至当前下标
                }
            }
            swap(arrays,i,minIndex);
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
