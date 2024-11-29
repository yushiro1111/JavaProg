import java.util.*;

public class task1C{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = scanner.nextLine();
        System.out.println("あなたの年齢は？");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);
        scanner.close();
        Random r = new Random();
        int fortune = r.nextInt(4);

        fortune++;
        System.out.println("占いの結果が出ました。");
        System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
        System.out.println("1:大吉　2:中吉　3:小吉　4:凶");
    }
}