package com.programstudy.random;

/**
 * @ClassName : RandToRand  //类名
 * @Description : 给定一个范围的随机数，求另一个范围的随机数  //描述
 * @Author : geyongfei  //作者
 * @Date: 2021-07-26 14:50  //时间
 * @Version: 1.0
 */
public class RandToRandV2 {
    //random函数自定义的，且不能改
    public static int ourRandom(){
        int tempNum = (int)(Math.random()*17)+3;
        //System.out.println("tempNum = " + tempNum);
        return tempNum;
    }

    //随机机制，只能用此数学
    //等概率返回0和1
    public static int rangeRandomMid(){
        int ans = 0;
        do{
            ans = ourRandom();
        }while(ans == 11);
        //1 2时返回0，4 5时返回1
        //System.out.println(ans);
        if(ans < 11){
            return 0;
        }else{
            return 1;
        }
    }


    //得到000 ~ 111等概率，即做到了0~7的等概率返回
    public static int binaryProp(){
        return (rangeRandomMid() << 5) + (rangeRandomMid() << 4) + (rangeRandomMid() << 3) + (rangeRandomMid() << 2) + (rangeRandomMid() << 1) + rangeRandomMid();
    }

    //得到000 ~ 111等概率，即做到了0~7的等概率返回
    public static int binaryPropCommon(int binNum){
        int binToTen = 0;
        for (int i = 0; i < binNum; i++) {
            binToTen += rangeRandomMid() << binNum;
        }
        return (rangeRandomMid() << 2) + (rangeRandomMid() << 1) + rangeRandomMid();
    }

    //随机机制，只能用此数学
    //等概率返回0和1
    public static int rangeRandomTarget(){
        int ans = 0;
        do{
            ans = binaryProp();
        }while(ans > 39);
        //范围限制在0~6
        //System.out.println("ans = " + ans);
        return ans;
    }

    public static int commonRandom(){
        return rangeRandomTarget() +17;
    }

    public static void main(String[] args) {
        int testTimes = 500000;
        int countLower11 = 0;
        int countHiger11 = 0;
        int tempcount = 0;
        int count = 0;
        int[] counts = new int[57];
        /*for (int i = 0; i < testTimes; i++) {
            if(rangeRandomMid() == 0){
                countLower11++;
                count++;
            }else{
                countHiger11++;
            }
        }
        tempcount = countLower11+countHiger11;
        System.out.println("countLower11 = " + countLower11 + "  countHiger11 = "+countHiger11 + "   countLower+countHiger = " + tempcount);
        System.out.println((double) count / (double) testTimes);*/

        //现在得到了1~5的随机函数的概率，怎么得到1~7的等概率呢？如果能求出0~6的等概率随机函数，再加1就是1~7的随机函数了
        //需要几个二进制位，2^3=8,需要3个二进制位就可以了


        /*for (int i = 0; i < testTimes; i++) {
            int num = binaryProp();
            //System.out.println(num);
            counts[num]++;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + "这个数，出现了 "+counts[i] + " 次");
        }*/

        for (int i = 0; i < testTimes; i++) {
            int num = commonRandom();
            //System.out.println(num);
            counts[num]++;
        }
        for (int i = 0; i < 57; i++) {
            System.out.println(i + "这个数，出现了 "+counts[i] + " 次");
        }
    }
}
