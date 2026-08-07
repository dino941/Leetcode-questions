class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int arr[]=new int[r+1];
        int p=r;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                arr[p--]=nums[l]*nums[l];
                l++;
            }else{
                arr[p--]=nums[r]*nums[r];
                r--;
            }
        }
        return arr;
    }
}