import java.util.*;

public class task3A{
    public static void main(String[] args){
        mail();
    }
    public static void mail(){
        System.out.println("メールを作成します");
        System.out.println("送り先のアドレスを入力してください");
        String a1 = new java.util.Scanner(System.in).nextLine();
        System.out.println("件名を入力してください");
        String a2 = new java.util.Scanner(System.in).nextLine();
        System.out.println("本文を入力してください");
        String a3 = new java.util.Scanner(System.in).nextLine();
        System.out.println(a1+"に以下のメールを送りました。");
        System.out.println("タイトル"+a2);
        System.out.println("本文"+a3);
    }
}