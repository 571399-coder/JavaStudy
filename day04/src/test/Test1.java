package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //如果这次考试小明全班第一，小红就做小明女朋友
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入小明这次的考试排名：");
        int ranking = sc.nextInt();
        if(ranking==1){
            System.out.println("小红成为了小明女朋友");
        }
        else{
            System.out.println("小明依旧单身");
        }
    }
}
