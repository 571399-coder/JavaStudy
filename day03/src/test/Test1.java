package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int ge = number%10;
        int shi = number%100/10;
        int bai = number/100;
        System.out.println("个位数是："+ge);
        System.out.println("十位数是："+shi);
        System.out.println("百位数是："+bai);
    }
}
