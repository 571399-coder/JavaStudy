package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        /*在实际开发中，电影院选座也会使用到 if 判断。
假设某影院售卖了 100 张票，票的序号为 1~100。
其中奇数票号坐左侧，偶数票号坐右侧。
键盘录入一个整数表示电影票的票号。
根据不同情况，给出不同的提示：
如果票号为奇数，那么打印坐左边
如果票号为偶数，那么打印坐右边。*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入1-100中你的票号：");
        int number=sc.nextInt();
        if(number>0 && number<=100){
            if(number%2==0){
                System.out.println("你的号码为偶数，请坐在右侧~");
            }else{
                System.out.println("你的票号为奇数，请坐在左侧~");
            }
        }else{
            System.out.println("您输入的号码无效");
        }


    }
}
