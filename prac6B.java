import java.util.*;

public class prac6B{
    public static void main(String[] args){
        System.out.println("三つの数値の合計、平均を計算します");
        System.out.println("一つ目の数字を入力");
        int a1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("二つ目の数字を入力");
        int a2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("三つ目の数字を入力");
        int a3 = new java.util.Scanner(System.in).nextInt();
        double [] A = {a1,a2,a3};
        calc(A);
    }
    public static void calc(double[]A){
        double sum = 0;
        for (int i=0; i< A.length;i++){
            sum += A[i];
        }
        double ave = sum / A.length;
        System.out.println("合計は"+sum+"で平均は"+ave+"でした。");
    }
}