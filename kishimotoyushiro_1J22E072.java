import java.util.*;

public class kishimotoyushiro_1J22E072{
    public static void main(String[] args){
        int flg = 0;
        String[] goodsArray = new String[100];
        int[] quantityArray = new int[100];
        int itemCount = 0;
        while(flg<1){
            System.out.println("何を買いますか");
            String goods = new java.util.Scanner(System.in).nextLine();
            System.out.println("何個足しますか");
            int num = new java.util.Scanner(System.in).nextInt();

            int exist = item_exist(goodsArray,goods,itemCount);
            if(exist == -1){
                goodsArray[itemCount] = goods;
                quantityArray[itemCount] = num;
                itemCount++;
            }else{
                quantityArray[exist] += num;
            }

            System.out.println("買い物を続けますか １：続ける　２：終了");
            int con = new java.util.Scanner(System.in).nextInt();
            if (con == 2){
                flg = 1;
            }
        }
        item_calculate(goodsArray, quantityArray, itemCount);
        
    }
    public static int item_exist(String[] goodsArray,String goods,int itemCount){
        for(int i=0;i<itemCount;i++){
            if(goodsArray[i].equals(goods)){
                return i;
            }
        }
        return -1;
    }

    public static void item_calculate(String[] goodsArray,int[] quantityArray,int itemCount){
        for(int i=0;i<itemCount;i++){
            System.out.println(goodsArray[i]+"-"+quantityArray[i]+"個");
        }
    }
}