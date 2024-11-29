import java.util.*;

public class task3C{
    public static void main(String[] args){
        System.out.println("じゃんけんしましょう");
        System.out.println("0.ぐー,1.ちょき,2.ぱー");
        int you = new java.util.Scanner(System.in).nextInt();
        Random r = new Random();
        int cpu = r.nextInt(3);
        janken(you,cpu);
    }
    public static void janken(int you,int cpu){
       String []hands = {"ぐー","ちょき","ぱー"};
       System.out.println("あなたは"+hands[you]);
       System.out.println("あいては"+hands[cpu]);
       if (you == cpu) {
        System.out.println("引き分けです！");
       } else if ((you == 0 && cpu == 1) || (you == 1 && cpu == 2) || (you == 2 && cpu == 0)) {
        System.out.println("前者の勝ち");
       } else {
        System.out.println("後者の勝ち");
       }
    }
}