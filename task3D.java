import java.util.*;

public class task3D{
    public static void main(String[] args){
        String[][] quizzes = {
            {"選択肢を選んでください","1.答えA2,答え.B,3.答えC","2"},
            {"早稲田大学のキャンパスであるのは？","1.湘南,2.所沢,3.日吉","2"},
            {"早稲田大学出身の野球選手は？","1.川上憲伸,2.鳥谷敬,3.高橋由伸","2"}
           };
        for (int i=0; i<quizzes.length;i++){
            System.out.println("質問を出します");
            quiz(i,quizzes);
        }    
    }
    public static void quiz(int i,String[][]quizzes){
       System.out.println(quizzes[i][0]);
       System.out.println(quizzes[i][1]);
       String ans = new java.util.Scanner(System.in).nextLine();
       if (ans.equals(quizzes[i][2])){
        System.out.println("正解");
       }else{
        System.out.println("不正解");
       }
    }
}