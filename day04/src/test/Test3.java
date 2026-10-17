package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //身上的钱大于100就吃漂亮饭，否则就吃沙县小吃
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身上的钱：");;
        int money=sc.nextInt();
        if(money>=100){
            System.out.println("吃漂亮饭哦~");
        }else{
            System.out.println("吃个沙县把。");
        }
    }
}
