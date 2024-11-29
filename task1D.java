import java.util.*;

public class task1D{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] b = {"ラーメン","チャーハン","餃子定食","唐揚げ定食"};
        System.out.println("[メニュー1]:"+b[0]+"2:"+b[1]+"3:"+b[2]+"4:"+b[3]);
        System.out.println("数字を入力してメニューを選んでね");
        int i = scanner.nextInt();
        scanner.close();
        int menu = i-1;
        System.out.println("あなたが選んだメニューは"+b[menu]);
    }
}