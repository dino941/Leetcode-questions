class Solution {
    public void rotate(int[] arr, int k) {
        int l=0;
        int r=arr.length-1;
        k=k%(r+1);
        revers(arr,l,r);
        revers(arr,l,k-1);
        revers(arr,k,r);
    }
    public void revers(int[] arr,int l,int r){

        while(l<r){
            int tmp=arr[l];
            arr[l]=arr[r];
            arr[r]=tmp;
            r--;
            l++;
        }
    }
}