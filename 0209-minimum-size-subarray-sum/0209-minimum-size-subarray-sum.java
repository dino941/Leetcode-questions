class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=Integer.MAX_VALUE;
        int sum=0,l=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                int curLen=i-l+1;
                len=Math.min(len,curLen);
                sum-=nums[l++];
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}