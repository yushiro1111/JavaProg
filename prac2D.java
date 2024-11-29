import java.util.*;

public class prac2D{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたの名前を入力してください");
        String name = scanner.nextLine();
        System.out.println("あなたの年齢は？");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println("名前"+name);
        System.out.println("年齢"+age);
    }
}