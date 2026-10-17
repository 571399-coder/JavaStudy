package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*练习 两只老虎
        需求：动物园里有两只老虎，体重分别为通过键盘录入获得，
        请用程序实现判断两只老虎的体重是否相同。*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一只老虎的重量：");
        int number1=sc.nextInt();
        System.out.println("请输入第二只老虎的重量：");
        int number2=sc.nextInt();
        //比较
        System.out.println(number1 == number2 ? "相同" : "不同");



    }
}
