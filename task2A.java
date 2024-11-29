import java.util.*;

public class task2A{
    public static void main(String[] args){
        System.out.println("好きな数字を入力してください");
        int a= new java.util.Scanner(System.in).nextInt();
        if(a >= 20){
            System.out.println("aは20以上");
        }else if(a >= 10){
            System.out.println("aは10以上20未満です");
        }else{
            System.out.println("aは10未満です");
        }
    }
}