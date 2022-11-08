import java.util.List;
import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private static int qtyOrdered = 0;

    public static void addDigitalVideoDisc(DigitalVideoDisc dvd){
        qtyOrdered++;
        if(qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println(" Giỏ hàng gần đầy");
        }else{
            System.out.println(" Đĩa đã được thêm");
        }

    }

    public static void removeDigitalVideoDisc(DigitalVideoDisc[] dvds, DigitalVideoDisc dvd){
        for(int i = 0; i < dvds.length; i++){
            if(dvds[i].equals(dvd)){
                System.out.println(" Xóa bỏ thành công");
                break;
            }
        }

    }

    public static float totalCost(DigitalVideoDisc[] dvds){
        float total = 0;
        for(int i = 0; i < dvds.length; i++){
            total += dvds[i].getCost();
        }
        return total;
    }


}
