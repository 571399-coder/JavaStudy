package temaryoperator;

public class TemaryoperatorDemo1 {
    public static void main(String[] args){
        //使用三元运算符，获取两个数的较大值
        int number1=10;
        int number2=20;
       int max = number1 > number2 ? number1:number2;
       System.out.println(max);
       System.out.println(number1 > number2 ? number1:number2);

       int a=12;
       int b=10;
       System.out.println(a<b?a:b);
        System.out.println(a>b?a:b);
    }
}
