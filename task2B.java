import java.util.*;

public class task2B{
    public static void main(String[] args){
        System.out.println("数当てゲーム");
        Random r = new Random();
        int ans = r.nextInt(10); 
        for(int i=0;i<5;i++){
            System.out.println("０から９の数字を入力してください");
            int num= new java.util.Scanner(System.in).nextInt();
            if(ans==num){
                System.out.println("あたり");
                break;
            }else{
                System.out.println("ちがうよー");
            }
        }
        System.out.println("ゲーム終了");
    }
}