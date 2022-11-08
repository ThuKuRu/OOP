import java.util.ArrayList;
import java.util.List;

public class Aims {

    public static void main(String[] args){
        float total = 0;
        
        Cart anOder = new Cart();

        DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 =  new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOder.addDigitalVideoDisc(dvd2);

       DigitalVideoDisc dvd3 =  new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc[] dvds = {dvd1, dvd2, dvd3};

        System.out.println(" Total Cost is: ");
        System.out.println(anOder.totalCost(dvds));

        System.out.println(" danh sách trước khi xóa: ");
        for (DigitalVideoDisc dvd : dvds){
            System.out.println(dvd);
        }
        anOder.removeDigitalVideoDisc(dvds, dvd2);
        System.out.println(" Danh sách sau khi xóa");
        for (DigitalVideoDisc dvd : dvds){
            System.out.println(dvd);
        }

        
    }




}
