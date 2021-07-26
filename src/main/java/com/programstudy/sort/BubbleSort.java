package com.programstudy.sort;

/**
 * @ClassName : BubbleSort  //类名
 * @Description : 冒泡排序  //描述
 * @Author : geyongfei  //作者
 * @Date: 2021-07-25 15:39  //时间
 * @Version: 1.0
 */
public class BubbleSort {
    //打印排序结果
    public static void main(String[] args) {
        int[] arr = {7,1,3,5,1,4,2,9,2,1,22,18,99,13};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    //对数组进行排序
   public static void bubbleSort(int[] arr){
       //0~n-1
       //0~n-2
       //0~n-3
       int arrLength = arr.length-1;
       for (int i = arrLength; i >= 0; i--) {
           //0~end 去比较交换
           //0 1,1 2,2 3
           for(int j = 1; j <= i; j++){
               if(arr[j-1] > arr[j]){
                   swap(arr,j-1,j);
               }
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
