public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 43, 15};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxval = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
