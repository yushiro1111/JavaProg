import java.util.Random;

public class prac2C{
    public static void main(String[] args){
        Random r = new Random();
        int num = r.nextInt(90);
        System.out.println("rは乱数で今回は"+num+"という値になりました。");
    }
}