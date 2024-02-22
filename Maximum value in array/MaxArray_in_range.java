public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 43, 15};
        System.out.println(maxRange(arr,1, 3));
    }

    // maxval in range
    static int maxRange(int[] arr, int start, int end){
        int maxval = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
