import java.util.*;

public class prac6A{
    public static void main(String[] args){
        System.out.println("あなたのBMIと適正体重をお知らせします");
        System.out.println("あなたの身長を入力してください(cm)");
        double height = new java.util.Scanner(System.in).nextDouble();
        System.out.println("あなたの体重を入力してください(kg)");
        double weight = new java.util.Scanner(System.in).nextDouble();
        System.out.println(height);
        BMI(weight,height);
    }

    public static void BMI(double weight,double height){
        double bmi = (weight*10000)/(height*height);
        String type;
        if (18.5 > bmi){
            type = "痩せすぎ";
        }else if(25.0 > bmi){
            type = "標準";
        }else{
            type = "肥満";
        }
        System.out.println("あなたのBMIは"+bmi+"で"+type+"です。");
    }
}