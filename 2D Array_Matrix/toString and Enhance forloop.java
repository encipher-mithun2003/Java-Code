import java.util.Arrays;
import java.util.Scanner;
public class Multidimension {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //int[][] arr=  new int[3][];
//        int[][] arr={
//                {1, 2, 3}, // 0th index
//                {6, 5}, // 1st index
//                {7, 8, 9, 10} // 2nd index
//        };
        int[][] arr = new int[3][3];
        for(int row=0;row<arr.length;row++) {
            // for each col in evry row
            for(int col =0 ; col<arr[row].length;col++){
                arr[row][col]= s.nextInt();
            }
        }
        // Printing the output using the Arrays.toString method
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        // Printing the output using Enhace For loop
        for(int[]  a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
