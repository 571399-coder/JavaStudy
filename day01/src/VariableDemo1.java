public class VariableDemo1 {
    //叫做main方法，表示程序的主入口
    public static void main(String[] args){
        /*输出语句（打印语句）会把小括号里面的内容进行打印输出
         */
        System.out.println("Hello Java!");
        System.out.println("lvjiayouz");
        System.out.println(666);
        System.out.println(12.10);
        System.out.println('A');
        System.out.println(true);
        System.out.println("null");
        System.out.println("name"+"age");
        System.out.println("Tom"+"23");
        System.out.println("name"+'\t'+"age");
        System.out.println("lily"+'\t'+"20");

        //定义变量
        //1.基本用法
        int a=10;
        int b=12;
        System.out.println(a);
        //2.变量参与计算
        System.out.println(a+b);
        //3.修改变量的值
        a=20;
        System.out.println(a);

        //一条语句可以定义多个变量
        int c=1210,d=100,e=999;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
