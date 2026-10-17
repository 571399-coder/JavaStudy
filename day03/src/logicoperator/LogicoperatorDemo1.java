package logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args){
        // & 并且
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        // | 或者
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true
    }
}
