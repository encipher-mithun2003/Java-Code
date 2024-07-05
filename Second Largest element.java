class Solution {
    public int print2largest(List<Integer> arr) {
        int largest=0, slargest=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>largest){
                slargest = largest;
                largest=arr.get(i);
            }
            else if(arr.get(i)>largest && arr.get(i)<slargest){
                slargest = arr.get(i);
                
            }
        }
        return slargest;
    }
}
