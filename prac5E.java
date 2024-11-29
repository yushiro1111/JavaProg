import java.util.*;

public class prac5E{
    public static void main(String[] args){
        System.out.println("あなたのBMIと適正体重をお知らせします");
        System.out.println("あなたの身長を入力してください(cm)");
        double height = new java.util.Scanner(System.in).nextDouble();
        System.out.println("あなたの体重を入力してください(kg)");
        double weight = new java.util.Scanner(System.in).nextDouble();
        System.out.println(height);
        Aweight(height,weight);
        System.out.println("あなたのBMIは"+BMI(weight,height)+"です");
    }
    public static void Aweight(double height,double weight){
        double aweight = height*height*22/10000;
        System.out.println("あなたの体重は"+weight+"で、適正体重は"+aweight+"です");
    }
    public static double BMI(double weight,double height){
        double bmi = (weight*10000)/(height*height);
        return bmi;
    }
}