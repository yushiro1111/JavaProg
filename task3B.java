import java.util.*;

public class task3B{
    public static void main(String[] args){
        System.out.println("5つの数値の合計、平均、最大値、最小値を計算します");
        int a1 = new java.util.Scanner(System.in).nextInt();
        int a2 = new java.util.Scanner(System.in).nextInt();
        int a3 = new java.util.Scanner(System.in).nextInt();
        int a4 = new java.util.Scanner(System.in).nextInt();
        int a5 = new java.util.Scanner(System.in).nextInt();
        System.out.println("1.合計,2.平均,3.最大,4.最小,0.終了");
        int a = new java.util.Scanner(System.in).nextInt();
        double [] A = {a1,a2,a3,a4,a5};
        if (a==0){
            System.out.println("終了");
        }else if(a==1){
            sum(A);
        }else if(a==2){
            ave(A);
        }else if(a==3){
            max(A);
        }else if(a==4){
            min(A);
        }else{
            System.out.println("正しい数字を入力してください");
        }
    }
    public static void sum(double[]A){
        double sum = 0;
        for (int i=0; i< A.length;i++){
            sum += A[i];
        }
        System.out.println(sum);
    }
    public static void ave(double[]A){
        double sum = 0;
        for (int i=0; i< A.length;i++){
            sum += A[i];
        }
        double ave = sum / A.length;
        System.out.println(ave);
    }
    public static void max(double[]A){
        double max = A[0]; 
        for (int i = 1; i < A.length; i++) { 
            if (A[i] > max) { 
                max = A[i];
            }
        }
        System.out.println(max);
    }
    public static void min(double[]A){
        double min = A[0]; 
        for (int i = 1; i < A.length; i++) { 
            if (A[i] < min) { 
                min = A[i];
            }
        }
        System.out.println(min);
    }
}