package test;

public class Test2 {
    public static void main(String[] args) {
        //红灯停，绿灯行，黄灯等
        //true亮，false灭
        boolean LightRed=false;
        boolean LightYello=false;
        boolean LightGreen=true;
        if(LightRed){
            System.out.println("stop!");
        }
        if(LightYello){
            System.out.println("Wait!");
        }
        if(LightGreen){
            System.out.println("gogogo!");
        }
    }
}
