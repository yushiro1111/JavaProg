import java.util.*;

public class prac4A{
    public static void main(String[] args){
        Random r = new Random();
        int a = r.nextInt(99); 
        int b = r.nextInt(99);
        if(a<=30 && b>=20){
            System.out.println("Aはあたり");
        }
        else{
            System.out.println("Aはハズレ");
        }
        if(a<=20 || a>=40){
            System.out.println("Bはあたり");
        }
        else{
            System.out.println("Bはハズレ");
        }
    }
}