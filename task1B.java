import java.util.*;

public class task1B{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたの身長は？（cm単位、小数点以下切り捨て）");
        int height = scanner.nextInt();
        System.out.println("あなたの体重は？（kg単位、小数点以下切り捨て）");
        int weight = scanner.nextInt();
        scanner.close();
        double height2 = height/100.0;
        double BMI = weight/(height2*height2);
        System.out.println("あなたの身長は"+height+"で、体重は"+weight+"で、BMIは"+BMI+"です。");
    }
}