import java.util.Scanner;
import java.util.ArrayList;
public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in =new Scanner(System.in);
        // Initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        } // this loop is initial the list
        // Adding elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
