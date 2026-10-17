package logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        // &&
        //运算结果跟单个是一样的
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        // ||
        //运算结果跟单个是一样的
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        //短路逻辑运算具有短路效果
        //当左边表达式能确定最终结果，那么右边就不会参与运行了
        int a=10;
        int b=10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        int c=10;
        int d=10;
        boolean result2 = ++c < 5 & ++d < 5;
        System.out.println(result2);
        System.out.println(c);
        System.out.println(d);

    }
}
