package test;

import java.util.Scanner;

public class Teat8{
    public static void main(String[] args) {
        /*商场都会有 VIP 的会员制，根据不同的会员会有不同的折扣。
假设商品总价为 1000。
键盘录入会员级别，并计算出实际支付的钱。
会员 1 级：打 9 折。
会员 2 级：打 8 折。
会员 3 级：打 7 折。
非会员：不打折，要打也是打骨折。*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入1-3中你的会员级别：");
        int level=sc.nextInt();
        if(level>=1 && level<=3){
            if(level==1){
                System.out.println("实际支付: "+900);
            }else if(level==2){
                System.out.println("实际支付: "+800);
            }else if(level==3){
                System.out.println("实际支付: "+700);
            }
        }else{
            System.out.println("非会员：不打折，要打也是打骨折。");
    }
    }
}
