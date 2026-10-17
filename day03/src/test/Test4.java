package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*数字 6 是一个真正伟大的数字，键盘录入两个整数。
        如果其中一个为 6，最终结果输出 true。
        如果它们的和为 6 的倍数。最终结果输出 true。
        其他情况都是 false。*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 =sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        boolean result=number1 ==6 || number2 ==6 || (number1+number2)%6==0;
        System.out.println(result);
    }
}
