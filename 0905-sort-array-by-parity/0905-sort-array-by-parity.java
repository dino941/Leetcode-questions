class Solution {
    public int[] sortArrayByParity(int[] arr) {
        if(arr.length<=1)
            return arr;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                int tmp=arr[k];
                arr[k]=arr[i];
                arr[i]=tmp;
                k++;
            }
        }
        return arr;
    }
}