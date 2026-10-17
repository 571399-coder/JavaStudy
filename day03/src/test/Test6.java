package test;

public class Test6 {
    public static void main(String[] args) {
        //需求：一座寺庙里住着三个和尚，已知他们的身高分别为 150cm、210cm、165cm，
        //请用程序实现获取这三个和尚的最高身高。
        int hight1=150;
        int hight2=210;
        int hight3=165;
        int a=hight1>hight2?hight1:hight2;
        int max=a>hight3?a:hight3;
        System.out.println(max);
    }
}
