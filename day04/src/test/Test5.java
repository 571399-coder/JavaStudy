package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //假设，用户在超市实际购买，商品总价为：600 元。
        //键盘录入一个整数表示用户实际支付的钱。
        //如果付款大于等于 600，表示付款成功。否则付款失败。
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入实际支付的钱：");
        int money=sc.nextInt();
        if(money>=600){
            System.out.println("支付成功");
        }else{
            System.out.println("支付失败啦");
        }
    }
}
