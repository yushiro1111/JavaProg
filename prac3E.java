import java.util.*;

public class prac3E{
    public static void main(String[] args){
        Random r = new Random();
        int fortune = r.nextInt(4);

        fortune++;
        System.out.println("あなたの今日の運勢は？");
        System.out.println("占いの結果が出ました。");
        if (fortune==1){
            System.out.println("大吉");
        }
        else if(fortune==2){
            System.out.println("中吉");
        }
        else if(fortune==3){
            System.out.println("小吉");
        }
        else{
            System.out.println("凶");
        }
    }
}