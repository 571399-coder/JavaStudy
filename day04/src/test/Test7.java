package test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
根据不同的分数送不同的礼物。
如果是 95~100 分，送自行车一辆
如果是 90~94 分，游乐场玩一天
如果是 80~89 分，送变形金刚一个。
如果是 80 分，揍一顿。 */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入本次成绩：");
        int score=sc.nextInt();
        if(score>=95 && score<=100){
            System.out.println("送自行车一辆");
        }else if(score>=90 && score<=94){
            System.out.println("游乐场一天");
        }else if(score>=80 && score<=89){
            System.out.println("送变形金刚一个");
        }else{
            System.out.println("直接揍一顿吧~");
        }
    }
}
