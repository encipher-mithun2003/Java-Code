import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list= new ArrayList<>(10);
//        list.add(123);
//        list.add(159);
//        list.add(753);
//        list.add(123);
//        list.add(159);
//        list.add(753);
//        list.add(123);
//        list.add(159);
//        list.add(753);
//        list.add(123);
//        list.add(159);
//        list.add(753);
//        System.out.println(list);
//        System.out.println(list.contains(159));
//        list.set(0,78);
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list);

        // taking input from the user
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        // get items at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }



    }
}
