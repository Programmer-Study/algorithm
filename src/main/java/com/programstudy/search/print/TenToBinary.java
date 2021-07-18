package com.programstudy.search.print;

/**
 * @ClassName : TenToBinary  //类名
 * @Description : 将一个十进制的整数，转换为32位的二进制并打印  //描述
 * @Author : geyongfei  //作者
 * @Date: 2021-07-19 01:09  //时间
 * @Version: 1.0
 */
public class TenToBinary {
    public static void convert(int num){
        for (int i = 31; i >= 0; i--) {
            if((num & (1 << i)) == 0){  //任何数与1相与都等于原数
                System.out.println("0");
            }else {
                System.out.println("1");
            }
        }
    }

    public static void main(String[] args) {
        int num = 16;
        convert(num);
    }
}
