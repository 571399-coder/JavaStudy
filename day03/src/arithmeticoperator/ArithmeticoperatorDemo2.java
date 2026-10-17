package arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        byte b1=100;
        byte b2=100;
        int result =b1+b2;
        System.out.println(result);
        //数据过大进行强转，结果会出错
        byte r=(byte)(b1+b2);
        System.out.println(r);



    }
}
