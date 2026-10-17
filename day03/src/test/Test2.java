package test;

public class Test2 {
    public static void main(String[] args){
        int x=10;
        //后++：先用后加
        //先把X的值拿出来用，赋值给y,然后在进行自增
        //赋值给y的值是自增前的
        int y=x++;
        //先++：先+后用
        //先把x进行自增，变成12，然后再把自增后的结果赋值给左边的变量
        int z=++x;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
    }
}
