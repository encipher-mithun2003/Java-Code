import java.util.*;
public class SmallSum {
    public static void main(String[] args) {
        /*System.out.print("Enter the array elements: ");
        Scanner in= new Scanner(System.in);
        int[] arr;
        arr = new int[]{in.nextInt()};
        int ans =smallsum(arr);
        System.out.print(ans);*/
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        int[] arr2 = {4, 0, 7, 9, 6, 4};

        System.out.println(smallsum(arr1));
        System.out.println(smallsum(arr2));


    }
    static int smallsum(int[] arr){
        if (arr.length == 0 || arr.length <= 3) {
            return 0;
        }
        int[] evenIndices = new int[arr.length / 2];
        int[] oddIndices = new int[(arr.length + 1) / 2];

        // Populate evenIndices and oddIndices arrays
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndices[i / 2] = arr[i];
            } else {
                oddIndices[i / 2] = arr[i];
            }
        }

        // Sort both arrays in descending order
        Arrays.sort(evenIndices);
        Arrays.sort(oddIndices);

        // Check if both arrays have at least two elements
        if (evenIndices.length >= 2 && oddIndices.length >= 2) {
            return evenIndices[evenIndices.length - 2] + oddIndices[oddIndices.length - 2];
        } else {
            return 0;
        }
    }
}
