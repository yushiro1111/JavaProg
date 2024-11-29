import java.util.*;

public class task2C{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] b = {"ラーメン","チャーハン","餃子定食","唐揚げ定食"};
        int i=0;
        int menu=0;
        while(i<1){
            System.out.println("[メニュー]:1"+b[0]+"2:"+b[1]+"3:"+b[2]+"4:"+b[3]);
            System.out.println("数字を入力してメニューを選んでね");
            int num = scanner.nextInt();
            switch(num){
                case 1:
                    menu = num - 1; 
                    i++;
                    break;
                case 2:
                    menu = num - 1; 
                    i++;
                    break;
                case 3:
                    menu = num - 1; 
                    i++;
                    break;
                case 4:
                    menu = num - 1; 
                    i++;
                    break;
            }
        }
        System.out.println(b[menu]+"を注文します");
        scanner.close();
    }
}
