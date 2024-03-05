public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearserach(arr, target,1,4));
    }
    static int linearserach(int[] arr, int target,int start, int end){
        if(arr.length ==0){
            return -1;
        }
        for(int index=start; index<= end; index++){
            int element = arr[index];
            if(element == target){
                //System.out.println("element is : "+element);
                //System.out.println("index value of element is : "+index);
                //return index;
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
