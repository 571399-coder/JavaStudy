//导入包
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args){
        //创建对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数");
        //接收数据
        int i = sc.nextInt();
        System.out.println(i);

        System.out.println("请输入第二个整数");
        int n=sc.nextInt();
        System.out.println(i+n);


    }
}
